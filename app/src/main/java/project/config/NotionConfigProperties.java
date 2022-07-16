package project.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("project")
@NoArgsConstructor
@RequiredArgsConstructor
public class NotionConfigProperties {
    private String apiUrl;
    private String apiVersion;
    private String authToken;
    private String databaseId;


}
