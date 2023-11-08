package com.codershere.productservice.repository;

import com.codershere.productservice.document.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
