package com.github.cwh.auth.client.configuration;

import com.github.cwh.auth.client.config.ServiceAuthConfig;
import com.github.cwh.auth.client.config.UserAuthConfig;
import org.springframework.cloud.bus.jackson.RemoteApplicationEventScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cwh
 */
@Configuration
@ComponentScan({"com.github.cwh.auth.client", "com.github.cwh.auth.common.event"})
@RemoteApplicationEventScan(basePackages = "com.github.cwh.security.auth.common.event")
public class AutoConfiguration {
    @Bean
    ServiceAuthConfig getServiceAuthConfig() {
        return new ServiceAuthConfig();
    }

    @Bean
    UserAuthConfig getUserAuthConfig() {
        return new UserAuthConfig();
    }
}
