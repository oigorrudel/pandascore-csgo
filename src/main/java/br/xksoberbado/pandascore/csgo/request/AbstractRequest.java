package br.xksoberbado.pandascore.csgo.request;

import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import static java.util.Optional.ofNullable;
import br.xksoberbado.pandascore.csgo.request.page.CustomPageable;
import br.xksoberbado.pandascore.csgo.request.params.IParam;
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

    protected Map<IParam, Object> filterParams;

    protected ResponseEntity<T> get(final Optional<Map<IParam, Object>> filterParamsOp,
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

    private void applyFilters(final Optional<Map<IParam, Object>> filterParamsOp, final boolean pageable) {
        filterParamsOp.ifPresent(params -> this.filterParams = params);

        ofNullable(filterParams)
            .ifPresent(params -> {
                params.forEach((k, v) -> log.info("Param: " + getFilter(k.getKey()) + " Value: " + v));

                var queryParams = params.keySet().stream()
                    .map(k -> getFilter(k.getKey()) + "=" + params.get(k))
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
        this.filterParams = null;
    }

    private String getFilter(final String filter) {
        return "filter[" + filter + "]";
    }

    private HttpHeaders getHeaders() {
        return ofNullable(TokenSingleton.getInstance())
            .map(tokenSingleton -> {
                var headers = new HttpHeaders();
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

}
