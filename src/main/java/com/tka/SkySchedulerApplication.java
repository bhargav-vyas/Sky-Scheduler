package com.tka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SkySchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SkySchedulerApplication.class, args);
	}

}
