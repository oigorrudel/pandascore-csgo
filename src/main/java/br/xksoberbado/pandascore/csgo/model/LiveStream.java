package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class LiveStream {

    @JsonAlias("raw_url")
    private String rawUrl;
}
