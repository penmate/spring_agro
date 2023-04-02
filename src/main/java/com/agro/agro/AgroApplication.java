package com.agro.agro;

import com.agro.agro.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
@Import(SwaggerConfiguration.class)
public class AgroApplication {
	public static void main(String[] args) {
		SpringApplication.run(AgroApplication.class, args);
	}
}
