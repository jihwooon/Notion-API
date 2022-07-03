package notion.service;

import notion.api.domain.Page;
import notion.domain.Notion;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class NotionService {

    public static Notion mapPageToTalk(Page page) {
        return new Notion(
                page.getId(),
                page.getProperties().get("Title").get("title").get(0).get("text").get("content").asText(),
                LocalDateTime.parse(page.getProperties().get("StartDate").get("date").get("start").asText(), DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                LocalDateTime.parse(page.getProperties().get("EndDate").get("date").get("start").asText(), DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                page.getProperties().get("URL").get("url").asText()
        );
    }
}
