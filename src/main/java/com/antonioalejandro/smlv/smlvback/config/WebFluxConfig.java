package com.antonioalejandro.smlv.smlvback.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurerComposite;

@Configuration
@EnableWebFlux
public class WebFluxConfig extends WebFluxConfigurerComposite {
    
}
