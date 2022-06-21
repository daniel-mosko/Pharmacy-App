package com.pharm;

import com.pharm.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class PharmApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmApplication.class, args);
	}

}
