package com.antonioalejandro.smlv.smlvback.web;

import java.time.Duration;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.antonioalejandro.smlv.smlvback.model.endpoints.firstuse.FirstUseRequest;
import com.antonioalejandro.smlv.smlvback.model.endpoints.firstuse.FirstUseResponse;

import reactor.core.publisher.Flux;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("v1/first-use")
public class FirstUseController {

    @PostMapping(value = "/")
    public Flux<FirstUseResponse> firstUse(@RequestBody FirstUseRequest request) {
        return Flux.just(new FirstUseResponse("Username", "casa")).repeat(30).delayElements(Duration.ofSeconds(3));
    }
    
    
    
    @GetMapping(value="/test", produces = {MediaType.TEXT_EVENT_STREAM_VALUE})
    public Flux<FirstUseResponse> test() {
        return Flux.just(new FirstUseResponse("Username", "casa")).repeat(5).delayElements(Duration.ofSeconds(4));
    }
    
}
