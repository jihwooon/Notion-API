package project.notion.client;

import org.springframework.stereotype.Component;
import project.notion.service.DatabaseService;

@Component
public class NotionClient {

    public final DatabaseService databaseService;

    public NotionClient(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }
}
