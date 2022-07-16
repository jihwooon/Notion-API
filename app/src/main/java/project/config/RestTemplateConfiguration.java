package project.config;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateConfiguration {

    @Bean
    RestTemplate restTemplate() {

        Log log = LogFactory.getLog(getClass());

        ClientHttpRequestInterceptor interceptor = (HttpRequest request, byte[] body, ClientHttpRequestExecution execution) -> {
            log.info(String.format("request to URI %s with HTTP verb '%s", request.getURI(), request.getMethod().toString()));
            return execution.execute(request, body);
        };

        return new RestTemplateBuilder()
                .additionalInterceptors(interceptor)
                .build();
    }
}
