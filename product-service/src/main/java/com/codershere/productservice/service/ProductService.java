package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;

import java.util.List;

public interface ProductService {

    void createProduct(Product product);
    void deleteProduct(String id);
    List<Product> listProduct();
    Product findProductById(String id);
}
