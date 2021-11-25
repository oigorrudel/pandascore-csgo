package br.xksoberbado.pandascore.csgo.request;

import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;


@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TokenSingleton {

    private static TokenSingleton instance;

    private String token;

    public static TokenSingleton getInstance() {
        return instance;
    }

    public static void init(String token) {
        synchronized (TokenSingleton.class) {
            if (Objects.isNull(instance)) {
                instance = new TokenSingleton();
                instance.setToken(token);
            }
        }
    }

    private void setToken(final String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
