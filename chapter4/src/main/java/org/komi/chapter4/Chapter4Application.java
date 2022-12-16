package org.komi.chapter4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Chapter4Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter4Application.class, args);
    }

}
