package com.id.testing.demo.ConnectSQLServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectSqlServerApplication {

	public static void main(String[] args) {
                System.setProperty("spring.jackson.serialization.INDENT_OUTPUT", "true");
		SpringApplication.run(ConnectSqlServerApplication.class, args);
	}
}
