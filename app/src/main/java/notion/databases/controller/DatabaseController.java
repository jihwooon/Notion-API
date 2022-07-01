package notion.databases.controller;

import notion.config.NotionConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {

    private final NotionConfigProperties notionConfigProperties;

    public DatabaseController(NotionConfigProperties notionConfigProperties) {
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping("/documents")
    public String getNotion() {
        return null;
    }

}
