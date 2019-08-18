package com.tang.spring.security.oauth.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ASUS
 * @create 2019-08-07 20:10
 */
@MapperScan(basePackages = {"com.tang.spring.security.oauth.server.mapper"})
@SpringBootApplication
public class SpringOauthServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringOauthServerApplication.class, args);

    }

}
