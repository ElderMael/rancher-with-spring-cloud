package io.eldermael;

import io.eldermael.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import io.eldermael.entities.User;

import javax.annotation.PostConstruct;

@EnableJpaRepositories
@EnableDiscoveryClient
@SpringBootApplication
public class DataApiApplication {

	@Autowired
	public UserRepository userRepository;

	@PostConstruct
	public void loadData() {
		User me = User.builder().name("Miguel").build();

		this.userRepository.save(me);
	}

	public static void main(String[] args) {
		SpringApplication.run(DataApiApplication.class, args);
	}
}
