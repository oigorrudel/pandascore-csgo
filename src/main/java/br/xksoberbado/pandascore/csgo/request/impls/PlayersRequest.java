package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Player;
import lombok.Builder;

@Builder
public class PlayersRequest extends AbstractPageRequest<Player[]> {

    @Override
    public String getUrl() {
        return URL + "players";
    }
}
