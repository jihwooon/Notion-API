package notion.api.service;

import notion.api.config.NotionConfigProperties;
import notion.api.domain.Database;
import notion.api.domain.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class DatabaseService {

    private final Logger log = LoggerFactory.getLogger(DatabaseService.class);
    private final NotionConfigProperties notionConfigProperties;
    private final RestTemplate restTemplate;

    public DatabaseService(NotionConfigProperties notionConfigProperties, RestTemplate restTemplate) {
        this.notionConfigProperties = notionConfigProperties;
        this.restTemplate = restTemplate;
    }

    public List<Page> query(String databaseId) {
        String url = notionConfigProperties.getApiUrl() + "/v1/databases/" + databaseId + "/query";
        log.info("Querying notion database : {}",url);

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
