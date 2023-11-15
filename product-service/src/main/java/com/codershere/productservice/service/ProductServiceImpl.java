package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.mapper.ProductMapper;
import com.codershere.productservice.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductResponseDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return productMapper.productListToProductResponseList(products);
    }

    @Override
    public void createProduct(ProductRequestDTO productRequestDTO) {
        Product product = productMapper.productRequestToProduct(productRequestDTO);
        productRepository.save(product);
        log.info("{} idli product kaydedildi.", product.getId());
    }

    @Override
    public ProductResponseDTO getProduct(String id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.map(product -> productMapper.productToProductRensponse(product)).orElse(null);
//        Product product = productRepository.findById(id).orElseGet(Product::new);
//        return productMapper.productToProductRensponse(product);
    }


}
