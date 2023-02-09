package com.inventory.inventoryservice.repository;

import com.inventory.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ProductRepository extends JpaRepository<Product, Long> {
}
