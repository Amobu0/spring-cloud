
package kr.co.springcloudservice3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MainController {

    @GetMapping(value = {"/", "/index"})
    public String index() {

        log.info("service3 index");
        return "service3";
    }

}
