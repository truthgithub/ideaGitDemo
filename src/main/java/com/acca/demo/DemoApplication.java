package com.acca.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("git for master code change");
		System.out.println("git for hot-fix code change");
		System.out.println("git for hot-fix code change2");
		System.out.println("git for website code change");
		SpringApplication.run(DemoApplication.class, args);
	}

}
