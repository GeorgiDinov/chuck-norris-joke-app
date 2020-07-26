package com.georgidinov.chucknorrisjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ImportResource("classpath:chuck-config.xml")
public class ChuckNorrisJokeAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChuckNorrisJokeAppApplication.class, args);
    }

}
