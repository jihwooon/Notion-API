package project.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

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

    public String getApiUrl() {
        return apiUrl;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getAuthToken() {
        return authToken;
    }

    public String getDatabaseId() {
        return databaseId;
    }

    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }
}
