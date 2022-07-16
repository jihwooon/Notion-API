package project.notion.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import project.config.NotionConfigProperties;
import project.notion.domain.Database;
import project.notion.domain.Page;

import java.util.List;

@Component
public class DatabaseService {

    private final Logger log = LoggerFactory.getLogger(DatabaseService.class);
    private NotionConfigProperties notionConfigProperties;
    private RestTemplate restTemplate;

    public DatabaseService(NotionConfigProperties notionConfigProperties, RestTemplate restTemplate) {
        this.notionConfigProperties = notionConfigProperties;
        this.restTemplate = restTemplate;
    }

    public List<Page> query(String databaseId) {
        String url = notionConfigProperties.getApiUrl() + "/v1/databases/" + databaseId + "/query";

        log.info("Querying Notion database: {}", url);

        ResponseEntity<Database> db = restTemplate.exchange(
                url,
                HttpMethod.POST,
                new HttpEntity<>(getDefaultHeaders()),
                Database.class
        );

        return db.getBody().getPages();
    }

    private HttpHeaders getDefaultHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        headers.set("Notion-Version", notionConfigProperties.getApiVersion());
        headers.set("Authorization", notionConfigProperties.getAuthToken());
        return headers;
    }

}
