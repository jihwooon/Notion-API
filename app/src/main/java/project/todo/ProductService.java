package project.todo;

import org.springframework.stereotype.Service;

@Service
public class ProductService {
    public ProductResponse createProduct(ProductRequest productRequest) {

        return ProductResponse.builder()
                .name(productRequest.getName())
                .build();
    }
}
