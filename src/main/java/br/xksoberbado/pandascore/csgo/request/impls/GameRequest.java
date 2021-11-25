package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Objects;
import br.xksoberbado.pandascore.csgo.request.AbstractSimpleRequest;
import br.xksoberbado.pandascore.csgo.model.Game;
import lombok.Builder;

@Builder
public class GameRequest extends AbstractSimpleRequest<Game> {

    private Integer gameId;

    @Override
    public String getUrl() {
        Objects.requireNonNull(gameId);

        return URL + "games/" + gameId;
    }

}
