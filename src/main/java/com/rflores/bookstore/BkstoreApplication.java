package com.rflores.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.rflores.bookstore.domain")
@SpringBootApplication
public class BkstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(BkstoreApplication.class, args);
	}

}
