package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Serie {

    private Long id;

    private String name;

    private Character tier;

    @JsonAlias("winner_id")
    private Long winnerId;

    private Integer year;

    @JsonAlias("league_id")
    private Long leagueId;

    @JsonAlias("full_name")
    private String fullName;

}
