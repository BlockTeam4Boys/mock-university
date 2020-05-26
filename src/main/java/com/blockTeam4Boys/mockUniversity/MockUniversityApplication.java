package com.blockTeam4Boys.mockUniversity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MockUniversityApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockUniversityApplication.class, args);
	}

}
