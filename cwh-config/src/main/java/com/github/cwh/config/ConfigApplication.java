package com.github.cwh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 配置中心
 *
 * @author cwh
 */
@EnableAutoConfiguration
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
