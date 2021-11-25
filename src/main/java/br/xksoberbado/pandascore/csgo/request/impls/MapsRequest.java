package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.CSMap;
import lombok.Builder;

@Builder
public class MapsRequest extends AbstractPageRequest<CSMap[]> {

    @Override
    public String getUrl() {
        return URL + "maps";
    }
}
