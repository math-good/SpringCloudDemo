package org.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCluster02Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EurekaCluster02Application.class);
        application.run(args);
    }
}
