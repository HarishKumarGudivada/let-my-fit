package com.nisum.lmf.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.nisum.lmf")
public class LetMyFitDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LetMyFitDemoApplication.class, args);
	}
}
