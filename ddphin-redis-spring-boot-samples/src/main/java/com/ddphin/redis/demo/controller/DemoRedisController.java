package com.ddphin.redis.demo.controller;

import com.ddphin.redis.helper.RedisHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.Duration;

/**
 * DemoRedisController
 *
 * @Date 2019/8/15 下午2:40
 * @Author ddphin
 */
@RestController
@RequestMapping("/redis")
public class DemoRedisController {
    @Autowired
    private RedisHelper redisHelper;

    @PutMapping("/{k}/{v}/{t}")
    public Object hello(@PathVariable String k, @PathVariable String v, @PathVariable Long t) {
        redisHelper.forValue().set(k, v, Duration.ofMillis(t));
        return  true;
    }

    @GetMapping("/{k}")
    public Object hello(@PathVariable String k) {
        return redisHelper.forValue().get(k);
    }
}
