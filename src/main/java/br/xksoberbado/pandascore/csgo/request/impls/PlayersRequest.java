package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Map;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.model.Player;
import br.xksoberbado.pandascore.csgo.params.ParamType;
import br.xksoberbado.pandascore.csgo.params.Params;
import lombok.Builder;
import org.springframework.http.ResponseEntity;

@Builder
public class PlayersRequest extends AbstractPageRequest<Player[]> {

    public ResponseEntity<Player[]> getByNationality(String... nationalities) {
        buildFilters(Map.entry(Params.NATIONALITY.apply(ParamType.FILTER), buildArrayFromStrings(nationalities)));
        return get();
    }

    @Override
    public String getUrl() {
        return URL + "players";
    }
}
