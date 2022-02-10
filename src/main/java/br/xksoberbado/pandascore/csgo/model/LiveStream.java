package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LiveStream {

    @JsonProperty("raw_url")
    private String rawUrl;
}
