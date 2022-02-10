package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MatchType {

    @JsonProperty("best_of")
    BEST_OF,
    @JsonProperty("custom")
    CUSTOM,
    @JsonProperty("first_to")
    FIRST_TO,
    @JsonProperty("ow_best_of")
    OW_BEST_OF

}
