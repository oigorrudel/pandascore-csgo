package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Game {

    private Long id;

    @JsonAlias("match_id")
    private Long matchId;

    private String status;

    private Team winner;

}
