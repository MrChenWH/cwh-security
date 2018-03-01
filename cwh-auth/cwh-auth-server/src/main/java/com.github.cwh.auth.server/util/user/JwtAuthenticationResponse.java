package com.github.cwh.auth.server.util.user;

import java.io.Serializable;

/**
 * @author cwh
 */
public class JwtAuthenticationResponse implements Serializable {

    private final String token;

    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
