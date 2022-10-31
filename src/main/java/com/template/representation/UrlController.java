package com.template.representation;

import com.template.representation.dto.GenerateShortUrlReq;
import com.template.service.ShortUrlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
public class UrlController {

    private final ShortUrlService urlService;

    public UrlController(ShortUrlService urlService) {
        this.urlService = urlService;
    }

    @GetMapping("/url/{id}")
    public void redirect(@PathVariable("id") String id, HttpServletResponse httpServletResponse) {
        log.info("[Redirect] get redirect id {}", id);
        httpServletResponse.setHeader("Location", "https://google.com");
        httpServletResponse.setStatus(302);
    }

    @PostMapping("/url")
    public String generateShortUrl(@RequestBody GenerateShortUrlReq req) {
        return urlService.generateShortUrl(req.getOriginUrl());
    }
}
