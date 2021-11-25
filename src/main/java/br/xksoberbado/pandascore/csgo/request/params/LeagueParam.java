package br.xksoberbado.pandascore.csgo.request.params;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum LeagueParam implements IParam {

    ID("id"),
    MODIFIED_AT("modified_at"),
    NAME("name"),
    SLUG("slug"),
    URL("url");

    private final String key;

}
