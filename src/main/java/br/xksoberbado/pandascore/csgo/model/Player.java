package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Player {

    private Long id;

    private String name;

    private String nationality;

    @JsonAlias("first_name")
    private String firstName;

    private String birthday;

    @JsonAlias("current_team")
    private Team currentTeam;

}
