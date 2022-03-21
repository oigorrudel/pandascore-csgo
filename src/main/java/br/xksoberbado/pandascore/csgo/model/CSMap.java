package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class CSMap {

    private Integer id;

    private String name;

    @JsonAlias("image_url")
    private String imageUrl;

}
