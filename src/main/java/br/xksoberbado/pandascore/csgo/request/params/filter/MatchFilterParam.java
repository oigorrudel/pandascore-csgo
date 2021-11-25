package br.xksoberbado.pandascore.csgo.request.params.filter;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import br.xksoberbado.pandascore.csgo.request.params.Param;
import br.xksoberbado.pandascore.csgo.request.params.ParamType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MatchFilterParam implements IParam {

    BEGIN_AT(new Param("begin_at", ParamType.FILTER)), //array date-time
    DETAILED_STATS(new Param("detailed_stats", ParamType.FILTER)), //boolean
    DRAW(new Param("draw", ParamType.FILTER)), //boolean
    END_AT(new Param("end_at", ParamType.FILTER)), //array date-time
    FINISHED(new Param("finished", ParamType.FILTER)), //boolean
    FORFEIT(new Param("forfeit", ParamType.FILTER)), //boolean
    FUTURE(new Param("future", ParamType.FILTER)), //boolean
    LEAGUE_ID(new Param("league_id", ParamType.FILTER)), //array of integers
    MATCH_TYPE(new Param("match_type", ParamType.FILTER)), //array of strings //best_of, custom, first_to, ow_best_of
    MODIFIED_AT(new Param("modified_at", ParamType.FILTER)), //array date-time
    NAME(new Param("name", ParamType.FILTER)), //array of strings
    NOT_STARTED(new Param("not_started", ParamType.FILTER)), //boolean
    NUMBER_OF_GAMES(new Param("number_of_games", ParamType.FILTER)), //array of integers
    OPPONENT_ID(new Param("opponent_id", ParamType.FILTER)), //array
    PAST(new Param("past", ParamType.FILTER)), //boolean
    RUNNING(new Param("running", ParamType.FILTER)), //boolean
    SCHEDULED_AT(new Param("scheduled_at", ParamType.FILTER)), //array date-time
    SERIE_ID(new Param("serie_id", ParamType.FILTER)), //array of integers
    SLUG(new Param("slug", ParamType.FILTER)), //array of strings
    STATUS(new Param("status", ParamType.FILTER)), //array of strings //canceled, finished, not_started, postponed, running
    TOURNAMENT_ID(new Param("tournament_id", ParamType.FILTER)),  //array of integers
    UNSCHEDULED(new Param("unscheduled", ParamType.FILTER)), //boolean
    VIDEOGAME(new Param("videogame", ParamType.FILTER)), //array
    WINNER_ID(new Param("winner_id", ParamType.FILTER)); //array

    private final Param param;

}
