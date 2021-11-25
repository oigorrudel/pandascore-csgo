package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Map;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Team;
import br.xksoberbado.pandascore.csgo.request.params.TeamParam;
import lombok.Builder;
import org.springframework.http.ResponseEntity;

@Builder
public class TeamsRequest extends AbstractPageRequest<Team[]> {

    public ResponseEntity<Team[]> getPageByName(String... names) {
        buildFilters(Map.entry(TeamParam.NAME, buildArrayFromStrings(names)));
        return getPage();
    }

    @Override
    public String getUrl() {
        return URL + "teams";
    }
}
