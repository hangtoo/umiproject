package com.sunyard.user;

import com.sunyard.user.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableAutoConfiguration
@RestController
public class DubboSpringCloudClientBootstrap {

    @Reference
    private EchoService echoService;

    @GetMapping("/echo")
    public String echo(String message) {
        return echoService.echo(message);
    }

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringCloudClientBootstrap.class);
    }
}