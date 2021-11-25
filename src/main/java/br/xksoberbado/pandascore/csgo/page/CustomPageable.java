package br.xksoberbado.pandascore.csgo.page;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class CustomPageable {

    private Integer page;
    private Integer perPage;

    public void next() {
        page++;
    }

}
