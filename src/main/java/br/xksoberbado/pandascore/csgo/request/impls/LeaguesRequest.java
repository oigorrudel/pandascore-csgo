package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.League;
import lombok.Builder;

@Builder
public class LeaguesRequest extends AbstractPageRequest<League[]> {

    @Override
    public String getUrl() {
        return URL + "leagues";
    }
}
