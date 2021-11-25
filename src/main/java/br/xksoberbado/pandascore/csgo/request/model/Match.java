package br.xksoberbado.pandascore.csgo.request.model;

import java.time.LocalDateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Match {

    private Long id;

    @JsonProperty("league_id")
    private Long leagueId;

    @JsonProperty("tournament_id")
    private Long tournamentId;

    @JsonProperty("serie_id")
    private Long serieId;

    @JsonProperty("winner_id")
    private Long winnerId;

    private String status;

    @JsonProperty("match_type")
    private MatchType type;

    @JsonProperty("number_of_games")
    private Integer numberOfGames;

    @JsonProperty("scheduled_at")
    private LocalDateTime scheduledAt;

    private List<Game> games;

}
