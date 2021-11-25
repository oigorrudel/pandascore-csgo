package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class League {

    private Long id;

    @JsonProperty("image_url")
    private String imageUrl;

    private String name;
}
