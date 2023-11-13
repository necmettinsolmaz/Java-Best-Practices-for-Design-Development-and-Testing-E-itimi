package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product product);
    void deleteProduct(Product product);
    List<Product> listProduct();
    Product findProductById(String id);
}
