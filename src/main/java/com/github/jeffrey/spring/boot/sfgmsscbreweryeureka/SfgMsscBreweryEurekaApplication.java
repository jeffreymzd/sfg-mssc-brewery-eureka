package com.github.jeffrey.spring.boot.sfgmsscbreweryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SfgMsscBreweryEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgMsscBreweryEurekaApplication.class, args);
	}

}
