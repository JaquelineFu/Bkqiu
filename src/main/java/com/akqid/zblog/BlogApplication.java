package com.akqid.zblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * com.akqid.zblog.Application.java
 *
 * @desc 不积跬步无以至千里, 不积小流无以至千里
 * @author:akqid
 * @year: 2017
 * @month: 04
 * @day: 02
 * @time: 2017/4/2
 */
@SpringBootApplication
@EnableScheduling
public class BlogApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApplication.class,args);
    }
}
