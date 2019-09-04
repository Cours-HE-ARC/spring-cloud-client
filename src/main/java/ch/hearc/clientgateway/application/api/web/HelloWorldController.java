package ch.hearc.clientgateway.application.api.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.hearc.clientgateway.application.api.web.resources.HelloWorldResource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloWorldController {

	@Autowired
	Environment environment;
	
	@GetMapping("/hello")
	public ResponseEntity<HelloWorldResource> hello(){
		
		log.info("/hello rest endpoint");
		return ResponseEntity.ok(new HelloWorldResource("World, from /hello",getInstancePort()));
	}
	
	@GetMapping("/api/hello")
	public ResponseEntity<HelloWorldResource> apiHello(){
		
		log.info("/api/hello rest endpoint");
		return ResponseEntity.ok(new HelloWorldResource("World, from /api/hello",getInstancePort()));
	}
	
	
	private int getInstancePort() {
		return Integer.parseInt(environment.getProperty("server.port"));
	}
}
