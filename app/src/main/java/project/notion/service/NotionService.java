package project.notion.service;

import org.springframework.stereotype.Service;
import project.Notion;
import project.notion.domain.Page;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Service
public class NotionService {

    public static Notion mapPageToNotion(Page page) {
        return new Notion(
                page.getId(),
                page.getProperties().get("title").get(0).get("text").get("content").asText(),
                LocalDateTime.parse(page.getProperties().get("StartDate").get("date").get("start").asText(), DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                LocalDateTime.parse(page.getProperties().get("EndDate").get("date").get("start").asText(), DateTimeFormatter.ISO_OFFSET_DATE_TIME),
                page.getProperties().get("URL").get("url").asText(),
                page.getProperties().get("Recording").get("url").asText());
    }
}
