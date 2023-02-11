package com.ministere.ministerefinanceservice.model;


import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(indexName ="transactionmf")
@Data
@Builder
public class TransactionMF {

    @Id
    private Long id;

    @Field(type = FieldType.Text, name="ministere")
    private String ministere;
    @Field(type = FieldType.Text, name="nom")
    private String nom;
    @Field(type = FieldType.Text, name="description")
    private String description;
    @Field( name="created_at")
    private LocalDateTime dateTime;
}
