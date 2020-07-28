package org.example.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaCluster01Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(EurekaCluster01Application.class);
        application.run(args);
    }
}
