package br.xksoberbado.pandascore.csgo.request;

import java.util.Map;
import static java.util.Optional.empty;
import static java.util.Optional.of;
import br.xksoberbado.pandascore.csgo.request.params.IParam;
import org.springframework.http.ResponseEntity;

public abstract class AbstractSimpleRequest<T> extends AbstractRequest<T>{

    public ResponseEntity<T> get() {
        return get(empty(), empty());
    }

    public ResponseEntity<T> get(Map<IParam, Object> filterParams) {
        return get(of(filterParams), empty());
    }
}
