package notion.config;

import notion.api.config.NotionConfigProperties;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class NotionConfigPropertiesTest {

    @Autowired
    private NotionConfigProperties notionConfigProperties;

    @Test
    @DisplayName("@Value 를 properties bind")
    void valueBindTest() {
        assertThat(notionConfigProperties.getApiUrl()).isEqualTo( "https://api.notion.com");
        assertThat(notionConfigProperties.getApiVersion()).isEqualTo( "2022-02-22");
        assertThat(notionConfigProperties.getDatabaseId()).isEqualTo( "828b4bab95f0409eb6326d31c3bb3682");

    }

}
