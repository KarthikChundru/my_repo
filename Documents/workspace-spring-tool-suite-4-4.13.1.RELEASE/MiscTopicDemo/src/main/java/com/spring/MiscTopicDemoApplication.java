package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class MiscTopicDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscTopicDemoApplication.class, args);
	}
	
	@Bean
	@Profile(value = "test")
	public DBConfig getDBConfig() {
		DBConfig dbConfig = new DBConfig("jdbc:odbc://local:3306/testdb", "testuser");
		return dbConfig;
	}
	
	
	@Bean
	@Profile(value = "prod")
	public DBConfig getDBConfigprod() {
		DBConfig dbConfig = new DBConfig("jdbc:odbc://local:3306/testdb", "produser");
		return dbConfig;
	}

}
