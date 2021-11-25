package br.xksoberbado.pandascore.csgo.request.params;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PlayerParam implements IParam {

    NATIONALITY("nationality");

    private final String key;

}
