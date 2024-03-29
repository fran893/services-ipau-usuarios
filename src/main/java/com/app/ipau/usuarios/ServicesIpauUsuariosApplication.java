package com.app.ipau.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.app.ipau.commons.usuarios.models.entities"})
public class ServicesIpauUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesIpauUsuariosApplication.class, args);
	}

}
