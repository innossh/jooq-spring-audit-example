package innossh.jooq.spring.audit.example.config;

import innossh.jooq.spring.audit.example.db.tables.daos.UserDao;
import org.jooq.DSLContext;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.postgresql.Driver")
                .url("jdbc:postgresql://localhost:5432/example")
                .username("example")
                .password("example")
                .build();
    }

    @Bean
    public UserDao userDao(DSLContext dslContext) {
        return new UserDao(dslContext.configuration());
    }

}
