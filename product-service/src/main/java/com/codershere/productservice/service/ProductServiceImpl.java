package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
        log.info("{} id'li ürün kaydedildi",product.getId());
    }

    @Override
    public void deleteProduct(Product product) {
        productRepository.delete(product);
    }

    public List<Product> listProduct(){
        List<Product> products = new ArrayList<>();
        products = productRepository.findAll();
        return products;
    }

    @Override
    public Product findProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }
}
