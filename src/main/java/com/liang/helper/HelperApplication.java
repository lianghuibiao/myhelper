package com.liang.helper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@CrossOrigin
public class HelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelperApplication.class, args);
    }

}
