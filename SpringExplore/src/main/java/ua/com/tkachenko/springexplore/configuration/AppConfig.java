package ua.com.tkachenko.springexplore.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ua.com.tkachenko.springexplore.service.Copier;
import ua.com.tkachenko.springexplore.service.Xerox;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    public Copier getCopier () {
        return new Xerox();
    }

}
