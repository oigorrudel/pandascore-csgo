package br.xksoberbado.pandascore.csgo.request.impls;

import java.util.Objects;
import br.xksoberbado.pandascore.csgo.request.AbstractSimpleRequest;
import br.xksoberbado.pandascore.csgo.request.model.Weapon;
import lombok.Builder;

@Builder
public class WeaponRequest extends AbstractSimpleRequest<Weapon> {

    private Integer weaponId;

    @Override
    public String getUrl() {
        Objects.requireNonNull(weaponId);

        return URL + "weapons/" + weaponId;
    }

}
