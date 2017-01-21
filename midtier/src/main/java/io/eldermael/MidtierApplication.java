package io.eldermael;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MidtierApplication {

	public static void main(String[] args) {
		SpringApplication.run(MidtierApplication.class, args);
	}

}
