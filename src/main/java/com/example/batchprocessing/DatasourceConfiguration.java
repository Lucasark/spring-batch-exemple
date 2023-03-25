package com.example.batchprocessing;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.batch.core.configuration.annotation.BatchConfigurer;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatasourceConfiguration {

    @Primary
    @Bean(name = "springBatchDataSource")
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost:1522/test;MODE=LEGACY");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }

    @Bean(name = "destino")
    public DataSource dataSourceOrigem() {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setJdbcUrl("jdbc:h2:tcp://localhost:1521/test;MODE=LEGACY");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }


    @Bean("config")
    BatchConfigurer configurer(@Qualifier("springBatchDataSource") DataSource dataSource) {
        return new DefaultBatchConfigurer(dataSource);
    }

}
