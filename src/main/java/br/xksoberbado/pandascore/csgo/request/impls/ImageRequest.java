package br.xksoberbado.pandascore.csgo.request.impls;

import br.xksoberbado.pandascore.csgo.request.AbstractSimpleRequest;
import lombok.Builder;

@Builder
public class ImageRequest extends AbstractSimpleRequest<byte[]> {

    private String url;

    @Override
    public String getUrl() {
        return url;
    }
}
