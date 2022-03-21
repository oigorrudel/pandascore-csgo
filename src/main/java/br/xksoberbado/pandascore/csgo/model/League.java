package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class League {

    private Long id;

    @JsonAlias("image_url")
    private String imageUrl;

    private String name;
}
