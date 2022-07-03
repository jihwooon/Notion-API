package notion.api.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@EqualsAndHashCode
@Getter @Setter
public class Database {

    private String object;

    @JsonProperty("result")
    private List<Page> pages = new ArrayList<>();

    @JsonProperty("next_cursor")
    private boolean next_cursor;

    @JsonProperty("has_more")
    private boolean hasMore;

}
