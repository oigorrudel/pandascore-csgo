package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Team;
import lombok.Builder;

@Builder
public class TeamsRequest extends AbstractPageRequest<Team[]> {

    @Override
    public String getUrl() {
        return URL + "teams";
    }
}
