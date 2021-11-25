//package br.xksoberbado.pandascore.csgo.request.impls;
//
//import java.util.Objects;
//import br.xksoberbado.pandascore.csgo.request.AbstractSimpleRequest;
//import lombok.Builder;
//
//@Builder
//public class RoundRequest extends AbstractSimpleRequest<String> {
//
//    private Integer gameId;
//
//    @Override
//    public String getUrl() {
//        Objects.requireNonNull(gameId);
//
//        return URL + "rounds/" + gameId;
//    }
//}
