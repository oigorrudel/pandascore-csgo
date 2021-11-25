package br.xksoberbado.pandascore.csgo.request;

import java.util.Map;
import static java.util.Optional.*;
import br.xksoberbado.pandascore.csgo.request.page.CustomPageable;
import br.xksoberbado.pandascore.csgo.request.params.DefaultParam;
import br.xksoberbado.pandascore.csgo.request.params.IParam;
import org.springframework.http.ResponseEntity;

public abstract class AbstractPageRequest<T> extends AbstractRequest<T> {

    protected CustomPageable pageable = new CustomPageable(1, 50);

    public ResponseEntity<T> getPage() {
        return get(empty(), of(pageable));
    }

    public ResponseEntity<T> getPage(final Map<IParam, Object> filterParams) {
        return get(of(filterParams), of(pageable));
    }

    public ResponseEntity<T> getPage(final CustomPageable pageable) {
        this.pageable = pageable;
        return get(empty(), of(pageable));
    }

    public ResponseEntity<T> getPage(final Map<IParam, Object> filterParams, final CustomPageable pageable) {
        this.pageable = pageable;
        return get(of(filterParams), of(pageable));
    }

    public ResponseEntity<T> nextPage() {
        this.pageable.next();
        return get(empty(), of(pageable));
    }

    @Override
    public ResponseEntity<?> getById(final Long... ids) {
        buildFilters(Map.entry(DefaultParam.ID, buildArrayFromLongs(ids)));
        return getPage();
    }
}
