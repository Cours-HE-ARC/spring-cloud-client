package ch.hearc.clientgateway.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringClientGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientGatewayApplication.class, args);
	}

}
