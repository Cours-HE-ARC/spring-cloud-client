package ch.hearc.clientgateway1.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringClientGateway1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringClientGateway1Application.class, args);
	}

}
