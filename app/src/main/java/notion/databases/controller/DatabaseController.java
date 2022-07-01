//RestController
//@RequestMapping 추가하기
package notion.databases.controller;

import notion.config.NotionConfigProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DatabaseController {

    private final NotionConfigProperties notionConfigProperties;

    public DatabaseController(NotionConfigProperties notionConfigProperties) {
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping("/notion")
    public String getNotion() {
        return "안녕하세요";
    }

}
