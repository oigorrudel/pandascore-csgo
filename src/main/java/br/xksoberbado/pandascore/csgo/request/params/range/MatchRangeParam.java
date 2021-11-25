package br.xksoberbado.pandascore.csgo.request.params.range;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import br.xksoberbado.pandascore.csgo.request.params.Param;
import br.xksoberbado.pandascore.csgo.request.params.ParamType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MatchRangeParam implements IParam {

    BEGIN_AT(new Param("begin_at", ParamType.RANGE));

    private final Param param;

}
