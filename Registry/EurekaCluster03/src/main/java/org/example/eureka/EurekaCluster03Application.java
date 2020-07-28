package org.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCluster03Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EurekaCluster03Application.class);
        application.run(args);
    }
}
