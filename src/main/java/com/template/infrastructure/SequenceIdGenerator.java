package com.template.infrastructure;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

@Component
public class SequenceIdGenerator {

    private final RedisTemplate<String, String> redisTemplate;

    private static final String SEQUENCE_KEY = "short_url_seq";

    public SequenceIdGenerator(RedisTemplate<String, String> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

    public Long getNextSequenceId() {
        return redisTemplate.opsForValue().increment(SEQUENCE_KEY, 1);
    }
}
