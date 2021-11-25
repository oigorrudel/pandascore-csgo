package br.xksoberbado.pandascore.csgo.params;

import java.util.function.UnaryOperator;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ParamType {

    FILTER(s -> String.format("filter[%s]", s)),
    RANGE(s -> String.format("range[%s]", s));

    private final UnaryOperator<String> unaryOperator;

}
