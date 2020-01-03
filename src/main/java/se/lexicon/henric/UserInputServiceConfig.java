package se.lexicon.henric;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class UserInputServiceConfig {

     @Bean
     Scanner getScanner(){
          Scanner scanner = new Scanner(System.in);
          return  scanner;
     }

}
