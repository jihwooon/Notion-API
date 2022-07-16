package project.notion.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Page {
    private String object;

    private String id;

    @JsonProperty("created_time")
    private String created_time;

    @JsonProperty("last_edited_time")
    private String last_edited_time;

    private boolean archived;

    private String url;

    private JsonNode properties;

}
