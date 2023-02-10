package com.ministere.ministereagricultureservice.api;

import com.ministere.ministereagricultureservice.entities.Transaction;
import com.ministere.ministereagricultureservice.repository.AgrTransactionRepository;
import jakarta.ws.rs.GET;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AgrController {

    private final AgrTransactionRepository agr;

    @GetMapping("/agrTransaction")
    public List<Transaction> getTransaction() {
        return agr.findAll();
    }
}
