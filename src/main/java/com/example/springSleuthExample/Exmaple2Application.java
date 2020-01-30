package com.example.springSleuthExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

import brave.sampler.Sampler;


@SpringBootApplication
@EnableFeignClients
public class Exmaple2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exmaple2Application.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
	    return Sampler.ALWAYS_SAMPLE;
	}
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
