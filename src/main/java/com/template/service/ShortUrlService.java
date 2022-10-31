package com.template.service;

import com.template.infrastructure.Base62;
import com.template.infrastructure.SequenceIdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ShortUrlService {

    private final SequenceIdGenerator generator;

    public ShortUrlService(SequenceIdGenerator generator) {
        this.generator = generator;
    }

    public String generateShortUrl(String originUrl) {
        Long sequenceId = generator.getNextSequenceId();
        String id = Base62.encode10To62(sequenceId);
        log.info("generate {}, sequenceId {} id {}", originUrl, sequenceId, id);
        // sava id to cassadra
        return id;
    }
}
