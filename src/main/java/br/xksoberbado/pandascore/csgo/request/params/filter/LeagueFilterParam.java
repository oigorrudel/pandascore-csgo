package br.xksoberbado.pandascore.csgo.request.params.filter;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LeagueFilterParam implements IParam {

    MODIFIED_AT("modified_at"),
    NAME("name"),
    SLUG("slug"),
    URL("url");

    private final String key;

    @Override
    public boolean isFilter() {
        return true;
    }
}
