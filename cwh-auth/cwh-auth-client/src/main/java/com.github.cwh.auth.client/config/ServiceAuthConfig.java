package com.github.cwh.auth.client.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author cwh
 */
@Data
public class ServiceAuthConfig {
    private byte[] pubKeyByte;

    @Value("${auth.client.id:null}")
    private String clientId;

    @Value("${auth.client.secret}")
    private String clientSecret;

    @Value("${auth.client.token-header}")
    private String tokenHeader;

    @Value("${spring.application.name}")
    private String applicationName;
}
