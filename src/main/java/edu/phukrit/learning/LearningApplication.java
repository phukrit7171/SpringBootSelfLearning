package edu.phukrit.learning;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import edu.phukrit.learning.models.UserModel;
import edu.phukrit.learning.repositories.UserRepository;

@SpringBootApplication
public class LearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(UserRepository userRepository) {
		return runner -> {
			System.out.println("Spring Boot started successfully!");
			
			// Add some sample data
			UserModel user1 = new UserModel("John", "Doe");
			UserModel user2 = new UserModel("Jane", "Smith");
			
			userRepository.save(user1);
			userRepository.save(user2);
			
			System.out.println("Sample data initialized!");
		};
	}
}
