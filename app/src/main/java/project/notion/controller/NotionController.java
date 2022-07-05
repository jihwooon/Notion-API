//RestController
//@RequestMapping 추가하기
//DatabaseService -> Database
package project.notion.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.notion.dto.NotionRequest;

@RestController
@RequiredArgsConstructor
@RequestMapping("/documents")
public class NotionController {

    
    private String notionSecret;

    @GetMapping("/notions")
    public NotionRequest getLists() {
        return NotionRequest.builder()
                .object("list")
                .build();
    }

}
