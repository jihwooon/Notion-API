package project.notion.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PageTest {

    private Page page;

    @BeforeEach
    void setUp() {
        page = new Page();
        page.setId("1L");
        page.setCreated_time("2022-06-30");
        page.setObject("list");
    }


    @Test
    void result() {
        assertThat(page.getId()).isEqualTo(1L);
        assertThat(page.getCreated_time()).isEqualTo("2022-06-30");
        assertThat(page.getObject()).isEqualTo("list");
    }

}
