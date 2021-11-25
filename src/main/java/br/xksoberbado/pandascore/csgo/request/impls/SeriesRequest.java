package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Objects;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Serie;
import lombok.Builder;

@Builder
public class SeriesRequest extends AbstractPageRequest<Serie[]> {

    private Type type;

    @Override
    public String getUrl() {
        return URL + "series" + (Objects.nonNull(type) ? defineSuffix() : "");
    }

    private String defineSuffix() {
        return isPast() ? "/past"
            : isRunning() ? "/running"
                : isUpcoming() ? "/upcoming" : "";
    }

    public boolean isPast() {
        return this.type.equals(Type.PAST);
    }

    public boolean isRunning() {
        return this.type.equals(Type.RUNNING);
    }

    public boolean isUpcoming() {
        return this.type.equals(Type.UPCOMING);
    }

    public enum Type {
        PAST, RUNNING, UPCOMING
    }
}
