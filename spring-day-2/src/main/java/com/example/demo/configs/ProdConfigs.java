package com.example.demo.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("file:prod.properties")
@Profile("prod")
public class ProdConfigs {

}
