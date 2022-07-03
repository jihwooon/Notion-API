package notion.api.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class DatabaseDto {

    private String id;
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String url;

    @Builder
    public DatabaseDto(String id, String title, LocalDateTime startDate, LocalDateTime endDate, String url) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.url = url;
    }
}
