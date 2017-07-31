package com.crossoverJie.request.check.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Function:配置类
 *
 * @author crossoverJie
 *         Date: 2017/8/1 01:58
 * @since JDK 1.8
 */
@Component
//定义配置前缀
@ConfigurationProperties(prefix = "sbc.request.check")
public class CheckReqProperties {
    private String redisKey ;//写入redis中的前缀
    private Long redisTimeout ;//redis的过期时间 默认是天

    public String getRedisKey() {
        return redisKey;
    }

    public void setRedisKey(String redisKey) {
        this.redisKey = redisKey;
    }

    public Long getRedisTimeout() {
        return redisTimeout;
    }

    public void setRedisTimeout(Long redisTimeout) {
        this.redisTimeout = redisTimeout;
    }

    @Override
    public String toString() {
        return "CheckReqProperties{" +
                "redisKey='" + redisKey + '\'' +
                ", redisTimeout=" + redisTimeout +
                '}';
    }
}
