package com.example.demoyyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoYyyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoYyyApplication.class, args);
	}
	public void stavi(){
		System.out.println(11);
	}
	public int returnInt(){
		int i=100;
		return i++;
	}
}
