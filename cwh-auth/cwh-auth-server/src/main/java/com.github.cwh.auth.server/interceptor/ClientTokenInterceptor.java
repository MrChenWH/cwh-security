package com.github.cwh.auth.server.interceptor;

import com.github.cwh.auth.server.configuration.ClientConfiguration;
import com.github.cwh.auth.server.service.AuthClientService;
import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author cwh
 */
public class ClientTokenInterceptor implements RequestInterceptor {

    private Logger logger = LoggerFactory.getLogger(ClientTokenInterceptor.class);

    @Autowired
    private ClientConfiguration clientConfiguration;

    @Autowired
    private AuthClientService authClientService;

    @Override
    public void apply(RequestTemplate requestTemplate) {
        try {
            requestTemplate.header(clientConfiguration.getClientTokenHeader(), authClientService.apply(clientConfiguration.getClientId(), clientConfiguration.getClientSecret()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
