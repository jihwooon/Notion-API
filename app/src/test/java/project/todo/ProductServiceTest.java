package project.todo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProductServiceTest {

    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productService = new ProductService();
    }

    @Test
    void createProduct() {
        ProductRequest productRequest = ProductRequest.builder()
                .name("snake")
                .build();

        ProductResponse productResponse = productService.createProduct(productRequest);

        assertThat(productResponse.getName()).isEqualTo(productRequest.getName());
    }

}
