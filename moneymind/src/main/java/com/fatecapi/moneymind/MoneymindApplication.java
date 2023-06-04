package com.fatecapi.moneymind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;


@SpringBootApplication
public class MoneymindApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoneymindApplication.class, args);
		
		System.out.println("\n");
		System.out.println("===================================================================================================================\n");
		System.out.println("Aplicação inicializada na porta 8080\n");
		System.out.println("===================================================================================================================\n");
	}
	  @Bean
	    public ObjectMapper objectMapper() {
	        ObjectMapper objectMapper = new ObjectMapper();
	        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	        objectMapper.registerModule(new JavaTimeModule());
	        return objectMapper;
	    }

}
