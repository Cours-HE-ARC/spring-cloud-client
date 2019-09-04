package ch.hearc.clientgateway.application;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import ch.hearc.clientgateway.application.api.web.ConsulProperties;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@EnableDiscoveryClient
@SpringBootApplication
public class SpringClientGatewayApplication {

	@Autowired
	ConsulProperties consulProperties;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringClientGatewayApplication.class, args);
	}

	@PostConstruct
	public void postContextConstruct() {
		log.info("application context started");
		
		log.info("*************** Consull properties ***************");
		log.info("config/api-gateway/test : " + consulProperties.getTest());
		
	
	}
}
