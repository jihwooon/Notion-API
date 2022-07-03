package notion.domain;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Notion {

    private String id;
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String url;

    public Notion(String id, String title, LocalDateTime startDate, LocalDateTime endDate, String url) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.url = url;
    }
}
