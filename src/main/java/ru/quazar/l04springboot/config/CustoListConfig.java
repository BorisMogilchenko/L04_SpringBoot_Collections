package ru.quazar.l04springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.quazar.l04springboot.model.CustomList;

@Configuration
public class CustoListConfig {

    @Bean
    public CustomList<Integer> customListConfigurer() {
        return new CustomList<>();
    }
}
