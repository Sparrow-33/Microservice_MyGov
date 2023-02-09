package com.inventory.inventoryservice;

import com.inventory.inventoryservice.entities.Product;
import com.inventory.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.List;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository, RepositoryRestConfiguration restConfiguration) {
		return args -> {
			restConfiguration.exposeIdsFor(Product.class);
			productRepository.saveAll(
					List.of(
                          Product.builder().name("Laptop")
								  .quantity(10)
								  .price(1000)
								  .build(),
							Product.builder().name("product-2")
									.quantity(7)
									.price(900)
									.build(),
							Product.builder().name("product-3")
									.quantity(3)
									.price(750)
									.build()
					)
			);
		};
	}
}
