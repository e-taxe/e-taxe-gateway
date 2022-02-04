package com.etaxe.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public RouteLocator routes(RouteLocatorBuilder builder) {
		return builder.routes()
               .route("TAXE-BOISSON",r -> r.path("/taxeBoissonTrim/**").uri("lb://TAXE-BOISSON"))
               .build();
}
}
