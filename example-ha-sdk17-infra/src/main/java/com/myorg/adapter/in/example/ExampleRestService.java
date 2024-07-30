package com.myorg.adapter.in.example;

import com.myorg.adapter.in.util.GenericResponse;
import com.myorg.handler.example.ExampleHandler;
import jakarta.validation.constraints.NotEmpty;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/test")
@CrossOrigin(origins = "*") //Review CORS and XHR
@RequiredArgsConstructor
@Slf4j
@Validated
public class ExampleRestService {
    // Current Service Path :/example

    private final ExampleHandler handler;
    @GetMapping("/get-iso-date")
    public Mono<ResponseEntity<GenericResponse>> getIsoDate(
            @NotEmpty(message = "message-uuid cannot be empty")
            @RequestHeader("message-uuid")  String messageUuid,
            @NotEmpty(message = "request-app-id cannot be empty")
            @RequestHeader("request-app-id") String requestAppId
    ) {
        log.info("ExampleRestService.getIsoDate, get iso date");
        return handler.execute(messageUuid, requestAppId);
    }
}
