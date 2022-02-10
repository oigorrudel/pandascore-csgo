package br.xksoberbado.pandascore.csgo.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Match {

    private Long id;

    @JsonProperty("league_id")
    private Long leagueId;

    private League league;

    @JsonProperty("tournament_id")
    private Long tournamentId;

    @JsonProperty("serie_id")
    private Long serieId;

    private Serie serie;

    @JsonProperty("winner_id")
    private Long winnerId;

    private MatchStatus status;

    @JsonProperty("match_type")
    private MatchType type;

    @JsonProperty("number_of_games")
    private Integer numberOfGames;

    @JsonProperty("scheduled_at")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime scheduledAt;

    private List<MatchTeam> opponents;

    private List<Game> games;

    @JsonProperty("streams_list")
    private List<LiveStream> streams;

    public boolean isCanceled() {
        return Objects.nonNull(this.status) && this.status.equals(MatchStatus.CANCELED);
    }

    public boolean isFinished() {
        return Objects.nonNull(this.status) && this.status.equals(MatchStatus.FINISHED);
    }

    public boolean isNotStarted() {
        return Objects.nonNull(this.status) && this.status.equals(MatchStatus.NOT_STARTED);
    }

    public boolean isPostponed() {
        return Objects.nonNull(this.status) && this.status.equals(MatchStatus.POSTPONED);
    }

    public boolean isRunning() {
        return Objects.nonNull(this.status) && this.status.equals(MatchStatus.RUNNING);
    }

    public boolean isBestOf() {
        return Objects.nonNull(this.type) && this.type.equals(MatchType.BEST_OF);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Match match = (Match) o;
        return Objects.equals(id, match.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
