package com.codershere.productservice;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {

        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Product p1 = new Product();
        p1.setId("Az244");
        p1.setName("Dondurma Makinesi");
        p1.setDescription("Dondurma yapıyor");
        p1.setPrice(BigDecimal.valueOf(3500));
        productRepository.save(p1);

        Product p2 = Product.builder()
                .id("abc123")
                .name("AirFryer")
                .description("Philips AirFryer")
                .price(BigDecimal.valueOf(7000))
                .build();
        productRepository.save(p2);
        Product p3 = new Product("MK123", "Makarna","Makarna 50kg", BigDecimal.valueOf(500));
        productRepository.save(p3);
        Product p4 = new Product();
        p4.setId("XY244");
        p4.setName("Kitaplık");
        p4.setDescription("kitaplık");
        productRepository.save(p4);
    }
}
