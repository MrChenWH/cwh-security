package com.github.cwh.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 注册中心
 *
 * @author cwh
 */
@EnableEurekaServer
@SpringBootApplication
public class CenterApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(CenterApplication.class, args);
    }
}
