package br.xksoberbado.pandascore.csgo.request.params;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum TeamParam implements IParam {

    NAME("name");

    private final String key;
}
