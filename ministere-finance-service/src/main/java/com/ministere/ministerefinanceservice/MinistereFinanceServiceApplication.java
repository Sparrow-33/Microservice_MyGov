package com.ministere.ministerefinanceservice;

import com.ministere.ministerefinanceservice.model.TransactionMF;
import com.ministere.ministerefinanceservice.repository.TransactionMFRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MinistereFinanceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinistereFinanceServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(TransactionMFRepository transaction) {
        return args -> {
            transaction.saveAll(
                    List.of(
                            TransactionMF.builder().nom("Tr-M.AG-01")
                                    .description("Tr-M.AG-PAYMENT-EMPLOYEES")
                                    .ministere("AG")
                                    .dateTime(LocalDateTime.now()).build(),
                            TransactionMF.builder().nom("Tr-M.AG-02")
                                    .description("Tr-M.AG-PAYMENT-LOGISTIC")
                                    .ministere("AG")
                                    .dateTime(LocalDateTime.now()).build(),
                            TransactionMF.builder().nom("Tr-M.AG-03")
                                    .description("Tr-M.AG-PAYMENT-ASSURANCE")
                                    .ministere("AG")
                                    .dateTime(LocalDateTime.now()).build()
                    )
            );
        };
    }
}
