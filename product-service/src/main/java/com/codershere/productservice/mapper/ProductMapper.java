package com.codershere.productservice.mapper;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    Product productRequestToProduct(ProductRequestDTO productRequestDTO);
    ProductResponseDTO productToProductRensponse(Product product);
    List<ProductResponseDTO> productListToProductResponseList(List<Product> products);
}
