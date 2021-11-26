package br.xksoberbado.pandascore.csgo.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Team {

    private Long id;

    private String name;

    @JsonProperty("image_url")
    private String imageUrl;

    private List<Player> players;

}
