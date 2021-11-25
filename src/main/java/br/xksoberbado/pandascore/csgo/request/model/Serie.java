package br.xksoberbado.pandascore.csgo.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Serie {

    private Long id;

    private String name;

    private Character tier;

    @JsonProperty("winner_id")
    private Long winnerId;

    private Integer year;

    @JsonProperty("league_id")
    private Long leagueId;

    @JsonProperty("full_name")
    private String fullName;

}
