package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Map;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.model.Team;
import br.xksoberbado.pandascore.csgo.params.ParamType;
import br.xksoberbado.pandascore.csgo.params.Params;
import lombok.Builder;
import org.springframework.http.ResponseEntity;

@Builder
public class TeamsRequest extends AbstractPageRequest<Team[]> {

    public ResponseEntity<Team[]> getByName(String... names) {
        buildFilters(Map.entry(Params.NAME.apply(ParamType.FILTER), buildArrayFromStrings(names)));
        return get();
    }

    @Override
    public String getUrl() {
        return URL + "teams";
    }
}
