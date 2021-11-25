package br.xksoberbado.pandascore.csgo.request;

import java.util.Map;
import static java.util.Optional.empty;
import static java.util.Optional.of;
import br.xksoberbado.pandascore.csgo.request.page.CustomPageable;
import br.xksoberbado.pandascore.csgo.request.params.Param;
import br.xksoberbado.pandascore.csgo.request.params.ParamType;
import br.xksoberbado.pandascore.csgo.request.params.Params;
import org.springframework.http.ResponseEntity;

public abstract class AbstractPageRequest<T> extends AbstractRequest<T> {

    protected CustomPageable pageable = new CustomPageable(1, 50);

    public ResponseEntity<T> get() {
        return get(empty(), of(pageable));
    }

    public ResponseEntity<T> get(final Map<Param, Object> filterParams) {
        return get(of(filterParams), of(pageable));
    }

    public ResponseEntity<T> get(final CustomPageable pageable) {
        this.pageable = pageable;
        return get(empty(), of(pageable));
    }

    public ResponseEntity<T> get(final Map<Param, Object> filterParams, final CustomPageable pageable) {
        this.pageable = pageable;
        return get(of(filterParams), of(pageable));
    }

    public ResponseEntity<T> nextPage() {
        this.pageable.next();
        return get(empty(), of(pageable));
    }

    @Override
    public ResponseEntity<?> getById(final Long... ids) {
        buildFilters(Map.entry(Params.ID.apply(ParamType.FILTER), buildArrayFromLongs(ids)));
        return get();
    }
}
