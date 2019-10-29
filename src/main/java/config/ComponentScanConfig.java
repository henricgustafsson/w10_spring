package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("se.lexicon.henric")
@Configuration
public class ComponentScanConfig {

    //TODO: P2-Make a scanner bean: make a method in config class annotated w Bean returns Scanner obj to be injected

}
