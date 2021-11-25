package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.request.AbstractPageRequest;
import br.xksoberbado.pandascore.csgo.request.model.Weapon;
import lombok.Builder;

@Builder
public class WeaponsRequest extends AbstractPageRequest<Weapon[]> {

    @Override
    public String getUrl() {
        return URL + "weapons";
    }
}
