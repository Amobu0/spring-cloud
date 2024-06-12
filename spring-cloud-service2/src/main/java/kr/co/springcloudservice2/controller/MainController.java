package kr.co.springcloudservice2.controller;


import brave.Span;
import brave.Tracer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@RestController
public class MainController {

    private final WebClient webClient;
    private final Tracer tracer;
    @GetMapping(value = {"/", "/index"})
    public Mono<String> index() {

        log.info("service2 index..........");
        return webClient
                .get()
                .uri("/index")
                .retrieve()
                .bodyToMono(String.class);// service3한테 쏘움
    }

    @GetMapping("/user")
    public Mono<String> user() {

        log.info("service2 index..........");
        return webClient
                .get()
                .uri("/user")
                .retrieve()
                .bodyToMono(String.class);// service3한테 쏘움
    }

    @GetMapping("/sleuth")
    public String sleuth() {

        Span currentSpan = tracer.currentSpan();

        String s = currentSpan.context().traceIdString();
        String s1 = currentSpan.context().spanIdString();


        return "";
    }

}
