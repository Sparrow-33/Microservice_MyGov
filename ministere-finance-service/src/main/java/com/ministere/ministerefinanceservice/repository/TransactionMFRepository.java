package com.ministere.ministerefinanceservice.repository;

import com.ministere.ministerefinanceservice.model.TransactionMF;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface TransactionMFRepository extends ElasticsearchRepository<TransactionMF, Long> {
}
