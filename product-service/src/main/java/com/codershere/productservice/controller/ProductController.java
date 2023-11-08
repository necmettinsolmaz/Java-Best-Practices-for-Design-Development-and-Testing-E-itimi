package com.codershere.productservice.controller;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;
//    @GetMapping("/merhaba")
//    public String selamla(){
//
//        return "merhaba";
//    }
    @PostMapping("/product")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }
}
