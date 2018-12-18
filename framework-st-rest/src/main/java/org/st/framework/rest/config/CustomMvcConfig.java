package org.st.framework.rest.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;

@Configuration
public class CustomMvcConfig implements WebMvcConfigurer {
    @PostConstruct
    public void init(){

    }
}
