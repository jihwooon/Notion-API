package project.notion.client;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "https://api.notion.com", name = "NotionApiClient")
public interface NotionClient {

}
