package project.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@Getter
@Setter
@ConstructorBinding
@ConfigurationProperties("project")
public class NotionConfigProperties {
    private String apiUrl;
    private String apiVersion;
    private String authToken;
    private String databaseId;

    public NotionConfigProperties(String apiUrl, String apiVersion, String authToken, String databaseId) {
        this.apiUrl = apiUrl;
        this.apiVersion = apiVersion;
        this.authToken = authToken;
        this.databaseId = databaseId;
    }

}
