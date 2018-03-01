package com.github.cwh.auth.server.configuration;

import com.github.cwh.auth.server.interceptor.ClientTokenInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cwh
 */
@Configuration
public class FeignConfiguration {
    @Bean
    ClientTokenInterceptor getClientTokenInterceptor() {
        return new ClientTokenInterceptor();
    }
}
