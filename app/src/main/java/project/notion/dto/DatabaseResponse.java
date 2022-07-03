package project.notion.dto;

import lombok.Getter;

@Getter
public class DatabaseResponse {

    private String object;
    private boolean next_cursor;
    private boolean has_more;

    public DatabaseResponse(String object, boolean next_cursor, boolean has_more) {
        this.object = object;
        this.next_cursor = next_cursor;
        this.has_more = has_more;
    }


}
