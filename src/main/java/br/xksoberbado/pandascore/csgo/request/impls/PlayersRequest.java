package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.model.Player;
import br.xksoberbado.pandascore.csgo.params.ParamTuple;
import br.xksoberbado.pandascore.csgo.params.ParamType;
import br.xksoberbado.pandascore.csgo.params.Params;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import lombok.Builder;
import org.springframework.http.ResponseEntity;

@Builder
public class PlayersRequest extends AbstractPageRequest<Player[]> {

    public ResponseEntity<Player[]> getByNationality(String... nationalities) {
        buildFilters(new ParamTuple(Params.NATIONALITY.apply(ParamType.FILTER), buildArrayFromStrings(nationalities)));
        return get();
    }

    @Override
    public String getUrl() {
        return URL + "players";
    }
}
