package walsam.demo.of.spring.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import walsam.demo.of.spring.boot.common.Coach;
import walsam.demo.of.spring.boot.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean("aquaticCoach")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
