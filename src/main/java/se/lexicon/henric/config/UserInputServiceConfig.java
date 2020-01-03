package se.lexicon.henric.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class UserInputServiceConfig {

     @Bean
     public Scanner scanner(){
          Scanner scanner = new Scanner(System.in);
          return  scanner;
     }

}
