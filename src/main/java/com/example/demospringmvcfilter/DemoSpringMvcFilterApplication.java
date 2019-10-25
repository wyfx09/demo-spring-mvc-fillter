package com.example.demospringmvcfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DemoSpringMvcFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringMvcFilterApplication.class, args);
    }

}
