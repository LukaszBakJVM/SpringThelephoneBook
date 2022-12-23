package com.example.thelephonebook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class ThelephoneBookApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ThelephoneBookApplication.class, args);

        Loop loop =run.getBean(Loop.class,PhoneService.class);
        loop.controlLoop();






    }
    @Bean
    Scanner sc (){
        return new Scanner(System.in);
    }




}
