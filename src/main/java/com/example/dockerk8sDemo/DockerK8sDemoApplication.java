package com.example.dockerk8sDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerK8sDemoApplication {


	@RequestMapping("/")
	public String home(){
		return"Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerK8sDemoApplication.class, args);
	}



}
