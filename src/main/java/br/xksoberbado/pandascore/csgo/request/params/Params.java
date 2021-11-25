package br.xksoberbado.pandascore.csgo.request.params;

import java.util.function.Function;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class Params {

    public static final Function<ParamType, Param> ID = paramType -> new Param("id", paramType);
    public static final Function<ParamType, Param> NAME = paramType -> new Param("name", paramType);
    public static final Function<ParamType, Param> BEGIN_AT = paramType -> new Param("begin_at", paramType);
    public static final Function<ParamType, Param> NATIONALITY = paramType -> new Param("nationality", paramType);

}
