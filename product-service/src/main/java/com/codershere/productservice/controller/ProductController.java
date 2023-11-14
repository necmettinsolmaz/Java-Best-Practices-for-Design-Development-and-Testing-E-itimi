package com.codershere.productservice.controller;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping("/merhaba")
    public String selamla(){return "merhaba";}
    @PostMapping("/product")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }
    @DeleteMapping("/product/delete/{id}")
    public void deleteProduct(@PathVariable String id){ productService.deleteProduct(id);}
    @GetMapping("/product/all")
    public List<Product> productList(){return productService.listProduct();}
    @GetMapping("/product/id/{id}")
    public Product findProductById(@PathVariable String id){
        id = id.toUpperCase();
        var product =  productService.findProductById(id);
        return Objects.requireNonNullElseGet(product, () -> new Product("0", "Hata!", "Böyle bir kayıt yok", new BigDecimal(-1)));

    }
}
