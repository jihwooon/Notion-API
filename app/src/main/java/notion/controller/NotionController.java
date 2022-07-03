//RestController
//@RequestMapping 추가하기
//DatabaseService -> Database
package notion.controller;

import notion.api.config.NotionConfigProperties;
import notion.api.NotionClient;
import notion.api.domain.Page;
import notion.domain.Notion;
import notion.service.NotionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/documents")
public class NotionController {

    private NotionClient client;
    private NotionConfigProperties notionConfigProperties;

    public NotionController(NotionClient client, NotionConfigProperties notionConfigProperties) {
        this.client = client;
        this.notionConfigProperties = notionConfigProperties;
    }

    @GetMapping("/notion")
    public List<Notion> getNotions() {
        List<Page> pages = client.databases.query(notionConfigProperties.getDatabaseId());
        return pages.stream().map(NotionService::mapPageToTalk).collect(Collectors.toList());
    }

}
