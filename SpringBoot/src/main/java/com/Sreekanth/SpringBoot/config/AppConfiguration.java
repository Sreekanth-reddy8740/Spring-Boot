package com.Sreekanth.SpringBoot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.Sreekanth.SpringBoot")
public class AppConfiguration {

}
