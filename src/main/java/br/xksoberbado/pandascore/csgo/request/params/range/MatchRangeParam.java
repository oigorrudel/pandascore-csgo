package br.xksoberbado.pandascore.csgo.request.params.range;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MatchRangeParam implements IParam {

    BEGIN_AT("begin_at");

    private final String key;

    @Override
    public boolean isFilter() {
        return false;
    }

}
