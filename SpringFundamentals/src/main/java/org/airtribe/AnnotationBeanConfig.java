package org.airtribe;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = "org.airtribe")
@PropertySource("classpath:application.properties")
public class AnnotationBeanConfig {
}
