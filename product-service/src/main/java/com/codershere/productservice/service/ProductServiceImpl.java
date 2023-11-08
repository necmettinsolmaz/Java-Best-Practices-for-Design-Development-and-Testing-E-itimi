package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product) {
        productRepository.save(product);
        log.info("{} id'li ürün kaydedildi",product.getId());
    }
}
