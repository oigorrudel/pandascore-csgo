package br.xksoberbado.pandascore.csgo.request;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static java.util.Optional.empty;
import static java.util.Optional.ofNullable;
import br.xksoberbado.pandascore.csgo.page.CustomPageable;
import br.xksoberbado.pandascore.csgo.params.Param;
import br.xksoberbado.pandascore.csgo.params.ParamTuple;
import br.xksoberbado.pandascore.csgo.params.ParamType;
import br.xksoberbado.pandascore.csgo.params.Params;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
abstract class AbstractRequest<T> implements IRequest {

    private static final Logger log = Logger.getLogger(AbstractRequest.class.getName());

    protected static final String URL = "https://api.pandascore.co/csgo/";
    protected StringBuilder urlBuilder;

    private RestTemplate restTemplate = new RestTemplate();

    protected Map<Param, Object> filterParams;

    public ResponseEntity<?> getById(final Long... ids) {
        buildFilters(new ParamTuple(Params.ID.apply(ParamType.FILTER), buildArrayFromLongs(ids)));
        return get(empty(), empty());
    }

    protected ResponseEntity<T> get(final Optional<Map<Param, Object>> filterParamsOp,
        final Optional<CustomPageable> customPageableOp) {
        urlBuilder = new StringBuilder();
        urlBuilder.append(getUrl());

        boolean pageable = customPageableOp.isPresent();
        if (pageable || filterParamsOp.isPresent()) {
            urlBuilder.append("?");
        }

        applyPageable(customPageableOp);
        applyFilters(filterParamsOp, pageable);

        return get(urlBuilder.toString());
    }

    private void applyFilters(final Optional<Map<Param, Object>> filterParamsOp, final boolean pageable) {
        filterParamsOp.ifPresent(params -> this.filterParams = params);

        ofNullable(filterParams)
            .ifPresent(params -> {
                params.forEach((k, v) -> log.info("Param: " + k.getName() + " Value: " + v));

                String queryParams = params.keySet().stream()
                    .map(k -> k.toQuery() + "=" + params.get(k))
                    .collect(Collectors.joining("&"));

                urlBuilder.append((pageable ? "&" : "") +queryParams);
            });
    }

    private void applyPageable(final Optional<CustomPageable> customPageableOp) {
        customPageableOp.ifPresent(customPageable -> {
                log.info("Page: " + customPageable.getPage() + " Per-page: " + customPageable.getPerPage());
                urlBuilder.append("page=" + customPageable.getPage() + "&per_page=" + customPageable.getPerPage());
            }
        );
    }

    public void clearFilters() {
        this.filterParams.clear();
    }

    private HttpHeaders getHeaders() {
        return ofNullable(TokenSingleton.getInstance())
            .map(tokenSingleton -> {
                HttpHeaders headers = new HttpHeaders();
                headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + tokenSingleton.getToken());
                return headers;
            })
            .orElseThrow(() -> new NullPointerException("Token is not informed"));
    }

    private ResponseEntity<T> get(final String url) {
        log.info("URL: " + url);
        return restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(getHeaders()), getClazz());
    }

    private Class getClazz() {
        return (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected String buildArrayFromLongs(final Long... longs) {
        return Arrays.stream(longs)
            .map(Objects::toString)
            .collect(Collectors.joining(","));
    }

    protected String buildArrayFromStrings(final String... strings) {
        return Arrays.stream(strings)
            .collect(Collectors.joining(","));
    }

    protected void buildFilters(final ParamTuple... entries) {
        this.filterParams = new LinkedHashMap<>();
        Arrays.stream(entries)
            .forEach(entry -> this.filterParams.put(entry.getKey(), entry.getValue()));
    }

}
