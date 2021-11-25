package br.xksoberbado.pandascore.csgo.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Game {

    private Long id;

    @JsonProperty("match_id")
    private Long matchId;

    private String status;

    private Team winner;

}
