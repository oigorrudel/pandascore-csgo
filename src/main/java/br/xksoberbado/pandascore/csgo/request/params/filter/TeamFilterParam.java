package br.xksoberbado.pandascore.csgo.request.params.filter;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import br.xksoberbado.pandascore.csgo.request.params.Param;
import br.xksoberbado.pandascore.csgo.request.params.ParamType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TeamFilterParam implements IParam {

    NAME(new Param("name", ParamType.FILTER));

    private final Param param;

}
