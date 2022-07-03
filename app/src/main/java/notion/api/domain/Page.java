package notion.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Page {

    private String object;
    private String id;
    @JsonProperty("created_time")
    private LocalDateTime createTime;
    @JsonProperty("last_edited_time")
    private LocalDateTime lastEditedTime;
    private Boolean archived;
    private String url;
    private JsonNode properties;


    public Page(String object, String id, LocalDateTime createTime, LocalDateTime lastEditedTime, Boolean archived, String url, JsonNode properties) {
        this.object = object;
        this.id = id;
        this.createTime = createTime;
        this.lastEditedTime = lastEditedTime;
        this.archived = archived;
        this.url = url;
        this.properties = properties;
    }

}
