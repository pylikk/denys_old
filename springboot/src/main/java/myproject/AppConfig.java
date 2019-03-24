package myproject;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("production")
public class AppConfig {

    static {
        Example.message = "prod";
    }
}
