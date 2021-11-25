package br.xksoberbado.pandascore.csgo.request.params.filter;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import br.xksoberbado.pandascore.csgo.request.params.Param;
import br.xksoberbado.pandascore.csgo.request.params.ParamType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LeagueFilterParam implements IParam {

    MODIFIED_AT(new Param("modified_at", ParamType.FILTER)),
    NAME(new Param("name", ParamType.FILTER)),
    SLUG(new Param("slug", ParamType.FILTER)),
    URL(new Param("url", ParamType.FILTER));

    private final Param param;

}
