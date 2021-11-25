package br.xksoberbado.pandascore.csgo.request.params;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor
public class Param {

    private String name;
    private ParamType type;

    public String toQuery() {
        return this.type.getUnaryOperator().apply(this.name);
    }

}
