package com.example.product_service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
  @GetMapping("/{id}")
  public ResponseEntity<String> getProduct(@PathVariable String id) {
	  logger.info("Received request for product id: " + id);
    return ResponseEntity.ok("Product data for product " + id);
  }
}

