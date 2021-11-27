package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum MatchStatus {

    @JsonProperty("canceled")
    CANCELED,
    @JsonProperty("finished")
    FINISHED,
    @JsonProperty("not_started")
    NOT_STARTED,
    @JsonProperty("postponed")
    POSTPONED,
    @JsonProperty("running")
    RUNNING

}
