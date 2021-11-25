package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Objects;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.model.Tournament;
import lombok.Builder;

@Builder
public class TournamentsRequest extends AbstractPageRequest<Tournament[]> {

    private Type type;

    @Override
    public String getUrl() {
        return URL + "tournaments" + (Objects.nonNull(type) ? defineSuffix() : "");
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
