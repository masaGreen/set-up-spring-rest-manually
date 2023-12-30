package com.masaGreen;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
scans for all controllers present so that dispatcher servlet can form a
WebApplicationContext that it will use to dispatch requests to available controllers
 */
@Configuration
@ComponentScan("com.masaGreen")
public class GreetingsHanlderConfig {
}
