package se.lexicon.henric;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Configuration
public class UserInputServiceConfig {

     @Bean
     public Scanner scannerBean(){
          Scanner scanner = new Scanner(System.in);
          return  scanner;
     }

}
