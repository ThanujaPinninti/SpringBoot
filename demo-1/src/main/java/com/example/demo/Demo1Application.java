package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		
		A a= new ABuilder().setA(100).setB(200).build();
			System.out.println(a);
	}

}
