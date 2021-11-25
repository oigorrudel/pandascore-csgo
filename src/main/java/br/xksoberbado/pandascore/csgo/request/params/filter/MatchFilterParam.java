package br.xksoberbado.pandascore.csgo.request.params.filter;

import br.xksoberbado.pandascore.csgo.request.params.IParam;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum MatchFilterParam implements IParam {

    BEGIN_AT("begin_at"), //array date-time
    DETAILED_STATS("detailed_stats"), //boolean
    DRAW("draw"), //boolean
    END_AT("end_at"), //array date-time
    FINISHED("finished"), //boolean
    FORFEIT("forfeit"), //boolean
    FUTURE("future"), //boolean
    LEAGUE_ID("league_id"), //array of integers
    MATCH_TYPE("match_type"), //array of strings //best_of, custom, first_to, ow_best_of
    MODIFIED_AT("modified_at"), //array date-time
    NAME("name"), //array of strings
    NOT_STARTED("not_started"), //boolean
    NUMBER_OF_GAMES("number_of_games"), //array of integers
    OPPONENT_ID("opponent_id"), //array
    PAST("past"), //boolean
    RUNNING("running"), //boolean
    SCHEDULED_AT("scheduled_at"), //array date-time
    SERIE_ID("serie_id"), //array of integers
    SLUG("slug"), //array of strings
    STATUS("status"), //array of strings //canceled, finished, not_started, postponed, running
    TOURNAMENT_ID("tournament_id"),  //array of integers
    UNSCHEDULED("unscheduled"), //boolean
    VIDEOGAME("videogame"), //array
    WINNER_ID("winner_id"); //array

    private final String key;

    @Override
    public boolean isFilter() {
        return true;
    }

}
