package com.tang.oauth;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author ASUS
 * @create 2019-08-13 21:55
 */
public class TestMain {

    public static void main(String[] args) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        System.out.println( passwordEncoder.encode("123456"));

    }

}
