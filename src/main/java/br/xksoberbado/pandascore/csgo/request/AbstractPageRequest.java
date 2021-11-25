package br.xksoberbado.pandascore.csgo.request;

import java.util.Map;
import static java.util.Optional.*;
import br.xksoberbado.pandascore.csgo.request.page.CustomPageable;
import br.xksoberbado.pandascore.csgo.request.params.IParam;
import org.springframework.http.ResponseEntity;

public abstract class AbstractPageRequest<T> extends AbstractRequest<T> {

    private CustomPageable pageable = new CustomPageable(1, 50);

    public ResponseEntity<T> getPage() {
        return get(empty(), of(pageable));
    }

    public ResponseEntity<T> getPage(Map<IParam, Object> filterParams) {
        return get(of(filterParams), of(pageable));
    }

    public ResponseEntity<T> getPage(CustomPageable pageable) {
        this.pageable = pageable;
        return get(empty(), of(pageable));
    }

    public ResponseEntity<T> getPage(Map<IParam, Object> filterParams, CustomPageable pageable) {
        this.pageable = pageable;
        return get(of(filterParams), of(pageable));
    }

    public ResponseEntity<T> nextPage() {
        this.pageable.next();
        return get(empty(), of(pageable));
    }

}
