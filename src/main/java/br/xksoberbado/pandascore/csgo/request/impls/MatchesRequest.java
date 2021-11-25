package br.xksoberbado.pandascore.csgo.request.impls;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;
import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Match;
import br.xksoberbado.pandascore.csgo.request.params.ParamType;
import br.xksoberbado.pandascore.csgo.request.params.Params;
import lombok.Builder;
import org.springframework.http.ResponseEntity;

@Builder
public class MatchesRequest extends AbstractPageRequest<Match[]> {

    private Type type;

    public ResponseEntity<Match[]> getToday() {
        buildFilters(Map.entry(Params.BEGIN_AT.apply(ParamType.RANGE), buildRangeOfToday()));
        return get();
    }

    private String buildRangeOfToday() {
        return LocalDate.now() + "T00:00:00Z," + LocalDate.now() + "T23:59:59Z";
    }

    @Override
    public String getUrl() {
        return URL + "matches" + (Objects.nonNull(type) ? defineSuffix() : "");
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
