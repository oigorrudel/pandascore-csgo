package br.xksoberbado.pandascore.csgo.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Tournament {

    private Long id;

    private String name;

    private Character tier;

    @JsonProperty("league_id")
    private Long leagueId;

    private List<Match> matches;

    @JsonProperty("serie_id")
    private Long serieId;

    /**
     * {
     *     "begin_at": "2021-08-04T23:00:00Z",
     *     "end_at": null,
     *     "id": 6404,
     *     "league": {
     *       "id": 4565,
     *       "image_url": "https://cdn.dev.pandascore.co/images/league/image/4565/CBCS_Elite_League_black_Logo.png",
     *       "modified_at": "2021-04-18T07:05:33Z",
     *       "name": "CBCS Elite League",
     *       "slug": "cs-go-cbcs-elite-league",
     *       "url": null
     *     },
     *     "league_id": 4565,
     *     "live_supported": false,
     *     "matches": [
     *       {
     *         "begin_at": "2021-08-05T20:20:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601476,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:00:40Z",
     *         "name": "Quarterfinals match 1: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-05T20:20:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-05T20:20:00Z",
     *         "slug": "2021-08-05-57dbd09c-ac10-463b-b764-6b940ac3d72b",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       },
     *       {
     *         "begin_at": "2021-08-05T23:00:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601477,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:01:08Z",
     *         "name": "Quarterfinals match 2: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-05T23:00:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-05T23:00:00Z",
     *         "slug": "2021-08-06",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       },
     *       {
     *         "begin_at": "2021-08-06T20:20:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601478,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:01:24Z",
     *         "name": "Quarterfinals match 3: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-06T20:20:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-06T20:20:00Z",
     *         "slug": "2021-08-06-8074905c-1385-452c-bc4e-02d3d21c0803",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       },
     *       {
     *         "begin_at": "2021-08-06T23:00:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601479,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:01:41Z",
     *         "name": "Quarterfinals match 4: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-06T23:00:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-06T23:00:00Z",
     *         "slug": "2021-08-07-817a1bc4-7e1e-4a7c-84a3-c5ba2e6f40a6",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       },
     *       {
     *         "begin_at": "2021-08-07T19:20:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601480,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:02:05Z",
     *         "name": "Semifinals match 1: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-07T19:20:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-07T19:20:00Z",
     *         "slug": "2021-08-07-b5bafe95-ae50-4440-83c4-a7aec4b1ed01",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       },
     *       {
     *         "begin_at": "2021-08-07T22:00:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601481,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:02:21Z",
     *         "name": "Semifinals match 2: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-07T22:00:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-07T22:00:00Z",
     *         "slug": "2021-08-08-a8627b18-671d-437f-9cb5-d6819e6e02c2",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       },
     *       {
     *         "begin_at": "2021-08-08T19:20:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601482,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:02:49Z",
     *         "name": "3rd place decider: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-08T19:20:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-08T19:20:00Z",
     *         "slug": "2021-08-08-f0884014-d920-45fa-a641-d5673ea0d214",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       },
     *       {
     *         "begin_at": "2021-08-08T22:00:00Z",
     *         "detailed_stats": true,
     *         "draw": false,
     *         "end_at": null,
     *         "forfeit": false,
     *         "game_advantage": null,
     *         "id": 601483,
     *         "live": {
     *           "opens_at": null,
     *           "supported": false,
     *           "url": null
     *         },
     *         "live_embed_url": null,
     *         "match_type": "best_of",
     *         "modified_at": "2021-07-20T08:02:59Z",
     *         "name": "Grand final: TBD vs TBD",
     *         "number_of_games": 3,
     *         "official_stream_url": null,
     *         "original_scheduled_at": "2021-08-08T22:00:00Z",
     *         "rescheduled": false,
     *         "scheduled_at": "2021-08-08T22:00:00Z",
     *         "slug": "2021-08-09-a0f43631-53ad-4ab4-bfb3-e4cd987e43b4",
     *         "status": "not_started",
     *         "streams": {
     *           "english": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "official": {
     *             "embed_url": null,
     *             "raw_url": null
     *           },
     *           "russian": {
     *             "embed_url": null,
     *             "raw_url": null
     *           }
     *         },
     *         "streams_list": [],
     *         "tournament_id": 6404,
     *         "winner_id": null
     *       }
     *     ],
     *     "modified_at": "2021-07-20T08:00:13Z",
     *     "name": "Playoffs",
     *     "prizepool": null,
     *     "serie": {
     *       "begin_at": "2021-07-21T20:20:00Z",
     *       "description": null,
     *       "end_at": null,
     *       "full_name": "Season 2 2021",
     *       "id": 3783,
     *       "league_id": 4565,
     *       "modified_at": "2021-07-16T07:28:22Z",
     *       "name": null,
     *       "season": "2",
     *       "slug": "cs-go-cbcs-elite-league-2-2021",
     *       "tier": "c",
     *       "winner_id": null,
     *       "winner_type": null,
     *       "year": 2021
     *     },
     *     "serie_id": 3783,
     *     "slug": "cs-go-cbcs-elite-league-2-2021-playoffs",
     *     "teams": [],
     *     "tier": "c",
     *     "videogame": {
     *       "id": 3,
     *       "name": "CS:GO",
     *       "slug": "cs-go"
     *     },
     *     "winner_id": null,
     *     "winner_type": "Team"
     *   }
     */
}
