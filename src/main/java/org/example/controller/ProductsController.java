package org.example.controller;

import lombok.AllArgsConstructor;
import org.example.dto.ProductsDTO;
import org.example.entity.Products;
import org.example.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ProductsController {

    private final ProductService productService;

    @PostMapping
    public ResponseEntity<Products> create(@RequestBody ProductsDTO dto) {
        return new ResponseEntity<>(productService.createProduct(dto), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Products>> readAll() {
        return new ResponseEntity<>(productService.readAll(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Products> update(@RequestBody Products product) {
        return new ResponseEntity<>(productService.update(product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id) {
        productService.delete(id);
        return HttpStatus.OK;
    }
}
