package com.github.cwh.auth.server.util.user;

import lombok.Data;

import java.io.Serializable;

/**
 * @author cwh
 */
@Data
public class JwtAuthenticationRequest implements Serializable {

    private String username;
    private String password;


    public JwtAuthenticationRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
