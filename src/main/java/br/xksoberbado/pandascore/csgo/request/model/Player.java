package br.xksoberbado.pandascore.csgo.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Player {

    private Long id;

    private String name;

    private String nationality;

    @JsonProperty("first_name")
    private String firstName;

    private String birthday;

    @JsonProperty("current_team")
    private Team currentTeam;

}
