package com.georgidinov.chucknorrisjokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.georgidinov")
public class WebConfig {


    //== bean methods ==
    @Bean
    public ChuckNorrisQuotes quotes() {
        return new ChuckNorrisQuotes();
    }

}//end of class WebConfig
