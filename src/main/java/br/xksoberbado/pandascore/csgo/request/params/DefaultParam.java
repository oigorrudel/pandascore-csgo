package br.xksoberbado.pandascore.csgo.request.params;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DefaultParam implements IParam {

    ID("id");

    private final String key;

}
