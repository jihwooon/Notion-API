package notion.api.controller;

import notion.controller.NotionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(NotionController.class)
class DatabaseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getDataBases() throws Exception {
        mockMvc.perform(get("/documents/notion")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

}
