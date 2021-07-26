package com.azsyed.lcconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class LcConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(LcConfigServerApplication.class, args);
    }

}
