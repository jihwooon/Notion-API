package project.notion.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NotionRequest {

    private String object;
    private boolean next_cursor;
    private boolean has_more;


    public NotionRequest(String object, Boolean next_cursor, Boolean has_more) {
        this.object = object;
        this.next_cursor = next_cursor;
        this.has_more = has_more;
    }
}
