package notion.api.dto;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.json.JacksonTester;

@JsonTest
class DatabaseDtoTest {

    private DatabaseDto databaseDto;

    @Autowired
    private JacksonTester<DatabaseDto> json;

    @BeforeEach
    void setUp() {
        DatabaseDto.builder()
                .id("1L")
                .build();

        this.databaseDto = databaseDto;
    }
}
