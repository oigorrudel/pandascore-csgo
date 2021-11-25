package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Map;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Player;
import br.xksoberbado.pandascore.csgo.request.params.PlayerParam;
import lombok.Builder;
import org.springframework.http.ResponseEntity;

@Builder
public class PlayersRequest extends AbstractPageRequest<Player[]> {

    public ResponseEntity<Player[]> getPageByNationality(String... nationalities) {
        buildFilters(Map.entry(PlayerParam.NATIONALITY, buildArrayFromStrings(nationalities)));
        return getPage();
    }

    @Override
    public String getUrl() {
        return URL + "players";
    }
}
