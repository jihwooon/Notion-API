package project.notion.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(DatabaseController.class)
class DatabaseControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getList() throws Exception {

        mockMvc.perform(get("/documents/notions")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"object\" : \"list\"}")
                )
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string(containsString("object\":\"list\",\"next_cursor\":false,\"has_more\":false")));

    }

}
