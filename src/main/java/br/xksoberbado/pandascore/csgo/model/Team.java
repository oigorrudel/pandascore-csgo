package br.xksoberbado.pandascore.csgo.model;

import java.util.List;
import lombok.Data;

@Data
public class Team {

    private Long id;

    private String name;

    private List<Player> players;

}
