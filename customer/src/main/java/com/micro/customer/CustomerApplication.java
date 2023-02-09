package com.micro.customer;

import com.micro.customer.entities.Customer;
import com.micro.customer.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.List;

@SpringBootApplication
public class CustomerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(CustomerRepository customerRepository,
                                               RepositoryRestConfiguration restConfiguration) {
        return args -> {
            restConfiguration.exposeIdsFor(Customer.class);
            customerRepository.saveAll(
                    List.of(
                            Customer.builder().name("Sabo")
                                    .email("sabo@koalaland.sky").build(),
                            Customer.builder().name("Koala")
                                    .email("Koala@koalaland.sky").build()
                    )
            );
            customerRepository.findAll().forEach(c -> {
                System.out.println(c);
            });
        };
    }
}
