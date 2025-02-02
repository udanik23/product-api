package org.example.service;

import lombok.AllArgsConstructor;
import org.example.dto.ProductsDTO;
import org.example.entity.Products;
import org.example.repository.ProductsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {
    private final ProductsRepository productsRepository;

    public Products createProduct(ProductsDTO dto) {
        return productsRepository.save(
            Products.builder()
                    .name(dto.getName())
                    .price(dto.getPrice())
                    .build()
        );


    }

    public List<Products> readAll() {
        return productsRepository.findAll();
    }

    public Products update(Products product) {
        return productsRepository.save(product);
    }

    public void delete(Long id) {
        productsRepository.deleteById(id);
    }

}
