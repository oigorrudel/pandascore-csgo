package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Tournament;
import lombok.Builder;

@Builder
public class TournamentsRequest extends AbstractPageRequest<Tournament[]> {

    private Type type = Type.DEFAULT;

    @Override
    public String getUrl() {
        return URL + "tournaments"
            + (isPast() ? "/past"
            : isRunning() ? "/running"
                : isUpcoming() ? "/upcoming" : "");
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
        DEFAULT, PAST, RUNNING, UPCOMING
    }
}
