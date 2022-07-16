package project;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
@EqualsAndHashCode
public class Notion {

    private String id;

    private String title;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private String url;

    private String recording;

    @Builder
    public Notion(String id, String title, LocalDateTime startDate, LocalDateTime endDate, String url, String recording) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.url = url;
        this.recording = recording;
    }
}
