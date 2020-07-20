package kapadokia.nyandoro.server.database;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class IdeaDb {
    @Value("${spring.datasource.url}")
    private String dbUrl;

    public IdeaDb(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    @Bean
    public DataSource dataSource() {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(dbUrl);
        return new HikariDataSource(config);
    }
}
