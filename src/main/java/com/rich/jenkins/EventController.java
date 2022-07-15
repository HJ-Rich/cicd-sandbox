package com.rich.jenkins;

import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rich-event")
public class EventController {

    private final Logger logger = LoggerFactory.getLogger(EventController.class); //merge

    @PostMapping
    public ResponseEntity<Void> response(@RequestBody Map<String, Object> requestBody) {
        logger.info(String.valueOf(requestBody));

        return ResponseEntity.ok().build();
    }
}
