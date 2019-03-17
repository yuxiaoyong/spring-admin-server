package com.workplat.platform.adminserver;/**
 * Created by atlantisholic on 2019/3/17.
 */

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AdminServerApplication
 * @Description TODO
 * @Author 郁晓勇
 * @Date 2019/3/17 11:28
 * @Version 1.0.0
 **/
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@EnableAdminServer
public class AdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerApplication.class, args);
    }

}
