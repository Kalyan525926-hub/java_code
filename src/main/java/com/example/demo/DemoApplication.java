package com.example.demo;
<<<<<<< HEAD

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

>>>>>>> uat

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
<<<<<<< HEAD
=======
    
    @Bean
	public RestTemplate restTemplate() {
        return new RestTemplate();
    }
>>>>>>> uat
}
