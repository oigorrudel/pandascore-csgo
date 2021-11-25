package br.xksoberbado.pandascore.csgo.request.params.filter;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TeamFilterParam implements IParam {

    NAME("name");

    private final String key;

    @Override
    public boolean isFilter() {
        return true;
    }

}
