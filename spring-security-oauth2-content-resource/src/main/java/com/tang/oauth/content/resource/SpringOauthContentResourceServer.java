package com.tang.oauth.content.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author ASUS
 * @create 2019-08-17 16:28
 */
@MapperScan(basePackages = {"com.tang.oauth.content.resource.mapper"})
@SpringBootApplication
public class SpringOauthContentResourceServer {

    public static void main(String[] args) {

        SpringApplication.run(SpringOauthContentResourceServer.class, args);

    }

}
