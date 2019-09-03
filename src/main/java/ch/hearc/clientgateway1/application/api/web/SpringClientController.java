package ch.hearc.clientgateway1.application.api.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.hearc.clientgateway1.application.api.web.resources.HelloWorldResource;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class SpringClientController {

	@GetMapping("/hello")
	public ResponseEntity<HelloWorldResource> hello(){
		
		log.info("/hello rest endpoint");
		return ResponseEntity.ok(new HelloWorldResource("World, from /hello"));
	}
	
	@GetMapping("/api/hello")
	public ResponseEntity<HelloWorldResource> apiHello(){
		
		log.info("/api/hello rest endpoint");
		return ResponseEntity.ok(new HelloWorldResource("World, from /api/hello"));
	}
	
	
	
}
