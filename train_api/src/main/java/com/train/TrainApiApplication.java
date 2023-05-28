package com.train;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@EnableEncryptableProperties
@SpringBootApplication
public class TrainApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrainApiApplication.class, args);
	}

}
