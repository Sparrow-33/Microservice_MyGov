package com.ministere.ministereagricultureservice.repository;

import com.ministere.ministereagricultureservice.entities.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgrTransactionRepository extends JpaRepository<Transaction, Long> {

}
