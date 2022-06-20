package com.mongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongo.repository.ItemRepository;


@SpringBootApplication
@ComponentScan(basePackages= {"com.mongo.controller"})
@EnableMongoRepositories(basePackageClasses =ItemRepository.class )
@EntityScan("com.mongo.beans")
public class MongoDBApplication  {
	
	

	public static void main(String[] args) {
		SpringApplication.run(MongoDBApplication.class, args);
	}


}
