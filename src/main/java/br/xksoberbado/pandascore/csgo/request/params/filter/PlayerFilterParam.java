package br.xksoberbado.pandascore.csgo.request.params.filter;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PlayerFilterParam implements IParam {

    NATIONALITY("nationality");

    private final String key;

    @Override
    public boolean isFilter() {
        return true;
    }

}
