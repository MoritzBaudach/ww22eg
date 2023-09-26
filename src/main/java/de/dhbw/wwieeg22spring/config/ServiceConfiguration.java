package de.dhbw.wwieeg22spring.config;

import de.dhbw.wwieeg22spring.services.GreetingService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public GreetingService greetingService(){
        return new GreetingService();
    }


}
