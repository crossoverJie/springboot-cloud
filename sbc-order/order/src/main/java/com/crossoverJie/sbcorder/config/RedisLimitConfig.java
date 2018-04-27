package com.crossoverJie.sbcorder.config;

import com.crossoverjie.distributed.limit.RedisLimit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisClusterConnection;
import org.springframework.data.redis.connection.jedis.JedisClusterConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;

/**
 * Function: 限流 bean
 *
 * @author crossoverJie
 *         Date: 23/04/2018 23:45
 * @since JDK 1.8
 */
@Configuration
public class RedisLimitConfig {


    @Value("${redis.limit}")
    private int limit;


    @Autowired
    private JedisConnectionFactory jedisConnectionFactory;

    @Bean
    public RedisLimit build() {
        RedisClusterConnection clusterConnection = jedisConnectionFactory.getClusterConnection();
        JedisCluster jedisCluster = (JedisCluster) clusterConnection.getNativeConnection();
        RedisLimit redisLimit = new RedisLimit.Builder<>(jedisCluster)
                .limit(limit)
                .build();

        return redisLimit;
    }
}
