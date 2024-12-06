package com.devtiro.database;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Slf4j
public class DatabaseApplication implements CommandLineRunner {

	private final DataSource dataSource;

	public DatabaseApplication(DataSource dataSource){
		this.dataSource = dataSource;
	}
	private static final Logger log = LoggerFactory.getLogger(DatabaseApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

		@Override
		public void run(String... args){
			log.info("Datasource: " + dataSource.toString());
			final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
			restTemplate.execute("select 1");

		}
}
