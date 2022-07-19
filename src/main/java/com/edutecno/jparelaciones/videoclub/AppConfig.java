package com.edutecno.jparelaciones.videoclub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.util.Objects;

@Configuration
@ComponentScan("com.edutecno.jparelaciones.videoclub")
@PropertySource("classpath:database.properties")
public class AppConfig {
    @Autowired
    Environment environment;

    @Bean
    DataSource dataSource() {
        DriverManagerDataSource dmds = new DriverManagerDataSource();
        dmds.setUrl(environment.getProperty("url"));
        dmds.setUsername(environment.getProperty("dbuser"));
        dmds.setPassword(environment.getProperty("dbpassword"));
        dmds.setDriverClassName(Objects.requireNonNull(environment.getProperty("driver")));
        return dmds;
    }
}
