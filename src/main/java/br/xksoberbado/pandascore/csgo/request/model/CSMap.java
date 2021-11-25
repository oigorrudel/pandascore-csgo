package br.xksoberbado.pandascore.csgo.request.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CSMap {

    private Integer id;

    private String name;

    @JsonProperty("image_url")
    private String imageUrl;

}
