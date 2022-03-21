package br.xksoberbado.pandascore.csgo.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

@Data
public class Weapon {

    private Long id;

    private String name;

    private Integer cost;

    private String slug;

    @JsonAlias("image_url")
    private String imageUrl;

    /**
     * {
     *     "ammo_clip_max": 1,
     *     "ammo_max": 1,
     *     "cost": 200,
     *     "id": 42,
     *     "image_url": "https://cdn.dev.pandascore.co/images/csgo/weapon/image/42/Taserhud.png",
     *     "kill_reward": 0,
     *     "kind": "secondary",
     *     "name": "Zeus",
     *     "slug": "taser"
     *   }
     */

}
