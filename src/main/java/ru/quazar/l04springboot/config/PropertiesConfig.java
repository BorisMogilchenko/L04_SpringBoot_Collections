package ru.quazar.l04springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("cycle")
public class PropertiesConfig {

    private int minRange;
    private int maxRange;

    public PropertiesConfig(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public int getMinRange( ) {
        return minRange;
    }

    public int getMaxRange( ) {
        return maxRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }
}