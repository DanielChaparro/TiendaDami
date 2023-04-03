package com.tienda.dami.TiendaDami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication( exclude = {SecurityAutoConfiguration.class })
//@EnableJpaRepositories (basePackages = {"com.tienda.dami.TiendaDami.model"})
//@EntityScan("com.tienda.dami.TiendaDami.model")
public class TiendaDamiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaDamiApplication.class, args);
	}

}
