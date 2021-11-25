package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Objects;
import br.xksoberbado.pandascore.csgo.request.AbstractSimpleRequest;
import br.xksoberbado.pandascore.csgo.request.model.CSMap;
import lombok.Builder;

@Builder
public class MapRequest extends AbstractSimpleRequest<CSMap> {

    private Integer mapId;

    @Override
    public String getUrl() {
        Objects.requireNonNull(mapId);

        return URL + "maps/" + mapId;
    }

}
