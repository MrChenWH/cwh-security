package com.github.cwh.auth.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.servlet.http.HttpServletRequest;

/**
 * @author cwh
 */
@Data
public class UserAuthConfig {
    @Value("${auth.user.token-header}")
    private String tokenHeader;

    private byte[] pubKeyByte;

    public String getToken(HttpServletRequest request) {
        return request.getHeader(this.getTokenHeader());
    }
}
