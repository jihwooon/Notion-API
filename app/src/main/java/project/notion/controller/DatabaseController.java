//RestController
//@RequestMapping 추가하기
//DatabaseService -> Database
package project.notion.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import project.Notion;
import project.config.NotionConfigProperties;
import project.notion.client.NotionClient;
import project.notion.domain.Page;
import project.notion.service.NotionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class DatabaseController {

    private NotionClient notionClient;
    private NotionConfigProperties notionConfigProperties;

    public DatabaseController(NotionClient notionClient, NotionConfigProperties notionConfigProperties) {
        this.notionClient = notionClient;
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping("/notions")
    public List<Notion> findAll() {
        List<Page> pages = notionClient.databaseService.query(notionConfigProperties.getDatabaseId());

        return pages.stream()
                .map(NotionService::mapPageToNotion)
                .collect(Collectors.toList());
    }
}
