package project.todo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductResponse {

    private String name;

    public ProductResponse(String name) {
        this.name = name;
    }
}
