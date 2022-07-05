package project.todo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.CoreMatchers.containsString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
class ProductControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @Test
    void creation() throws Exception {
        given(productService.createProduct(any(ProductRequest.class)))
                .will(invocation -> {
                     ProductRequest productRequest = invocation.getArgument(0);
                      ProductResponse productResponse= ProductResponse.builder()
                            .name(productRequest.getName())
                            .build();
                    return productResponse;
                });

        mockMvc.perform(post("/products")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"name\":\"snake\",\"maker\":\"shop\",\"price\":\"5000\",\"image\":\"www.google.com\"}")
                )
                .andExpect(status().isCreated())
                .andDo(print())
                .andExpect(content().string(
                        containsString("\"name\":\"snake\"")));

        verify(productService).createProduct(any(ProductRequest.class));
    }
}
