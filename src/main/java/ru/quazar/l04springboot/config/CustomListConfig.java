package ru.quazar.l04springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.quazar.l04springboot.model.CustomList;
import ru.quazar.l04springboot.service.MaximumClassService;
import ru.quazar.l04springboot.service.MinimumClassService;

@Component
public class CustomListConfig {

    @Bean
    public CustomList<Integer> customListConfigurer() {
        return new CustomList<>();
    }

    @Bean
    public MaximumClassService<Integer> maximumClassServiceConfig() {
        return new MaximumClassService<Integer>();
    }

    @Bean
    public MinimumClassService<Integer> minimumClassServiceConfig() {
        return new MinimumClassService<Integer>();
    }
}

