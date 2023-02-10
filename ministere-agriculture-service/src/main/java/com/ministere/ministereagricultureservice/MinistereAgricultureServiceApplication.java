package com.ministere.ministereagricultureservice;

import com.ministere.ministereagricultureservice.entities.Transaction;
import com.ministere.ministereagricultureservice.repository.AgrTransactionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class MinistereAgricultureServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MinistereAgricultureServiceApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(AgrTransactionRepository agr) {
//        return args -> {
//           agr.saveAll(
//                   List.of(
//                           Transaction.builder().nom("AGR-T-1")
//                                   .description("FIRST TRANSACTION")
//                                   .date( LocalDate.now()).ministere("AGR").build(),
//                           Transaction.builder().nom("AGR-T-2")
//                                   .description("SECOND TRANSACTION")
//                                   .date( LocalDate.now()).ministere("AGR").build(),
//                           Transaction.builder().nom("AGR-T-3")
//                                   .description("THIRD TRANSACTION")
//                                   .date( LocalDate.now()).ministere("AGR").build()
//                   )
//           );
//        };
//    }
}
