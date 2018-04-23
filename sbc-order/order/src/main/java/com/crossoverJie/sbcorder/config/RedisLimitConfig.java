package com.crossoverJie.sbcorder.config;

import com.crossoverjie.distributed.limit.RedisLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 23/04/2018 23:45
 * @since JDK 1.8
 */
@Configuration
public class RedisLimitConfig {


    @Value("${redis.limit}")
    private int limit ;

    @Autowired
    private JedisCluster jedisCluster ;

    @Bean
    public RedisLimit build(){
        RedisLimit redisLimit = new RedisLimit.Builder<>(jedisCluster)
                .limit(limit)
                .build();
        return redisLimit;
    }
}
