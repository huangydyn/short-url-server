package com.template.representation;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
public class UrlController {

    public UrlController() {
    }

    @GetMapping("/url/{id}")
    public void redirect(@PathVariable("id") String id, HttpServletResponse httpServletResponse) {
        log.info("[Redirect] get redirect id {}", id);
        httpServletResponse.setHeader("Location", "https://google.com");
        httpServletResponse.setStatus(302);
    }
}
