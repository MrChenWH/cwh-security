package com.github.cwh.auth.server.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author cwh
 */
@Configuration
@Data
public class UserConfiguration {

    @Value("${jwt.token-header}")
    private String userTokenHeader;
}
