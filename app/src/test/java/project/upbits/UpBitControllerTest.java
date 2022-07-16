package project.upbits;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import project.upbits.markets.controller.UpBitController;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@DisplayName("UpBitController")
@WebMvcTest(UpBitController.class)
class UpBitControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getList() throws Exception {
        mockMvc.perform(get("/upbits/markets")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(status().isOk());
    }

}
