package com.crossoverJie.sbcuser.config;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.*;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 26/04/2018 00:41
 * @since JDK 1.8
 */
@Configuration
public class ThreadConfig {

    @Value("${concurrent.core.size}")
    private int coreSize ;

    @Value("${concurrent.max.size}")
    private int maxSize ;

    @Value("${concurrent.blockqueue.size}")
    private int blockQueueSize;



    @Bean(value = "concurrentTestThread")
    public ExecutorService build(){
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("concurrent-thread-%d").build();
        ThreadPoolExecutor executorServicePool = new ThreadPoolExecutor(coreSize, maxSize, 0L, TimeUnit.MILLISECONDS,
                new ArrayBlockingQueue<Runnable>(blockQueueSize), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

        return executorServicePool ;
    }

}
