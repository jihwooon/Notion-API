//RestController
//@RequestMapping 추가하기
//DatabaseService -> Database
package notion.databases.controller;

import notion.config.NotionConfigProperties;
import notion.databases.service.DatabaseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/documents")
public class DatabaseController {

    private final NotionConfigProperties notionConfigProperties;
    private final DatabaseService databaseService;

    public DatabaseController(NotionConfigProperties notionConfigProperties, DatabaseService databaseService) {
        this.notionConfigProperties = notionConfigProperties;
        this.databaseService = databaseService;
    }

    @GetMapping("/notion")
    public String getNotions() {
        return databaseService.getNotions();
    }

}
