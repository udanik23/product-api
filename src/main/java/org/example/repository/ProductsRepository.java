package org.example.repository;

import org.example.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
