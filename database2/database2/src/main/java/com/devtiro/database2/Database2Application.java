package com.devtiro.database2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class Database2Application implements CommandLineRunner {

	private final DataSource dataSource;

	public Database2Application(DataSource dataSource){
		this.dataSource = dataSource;
	}
	private static final Logger log = LoggerFactory.getLogger(Database2Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Database2Application.class, args);
	}
	@Override
	public void run(String... args){
		log.info("Datasource: " + dataSource.toString());
		final JdbcTemplate restTemplate = new JdbcTemplate(dataSource);
		restTemplate.execute("select 1");

	}

}

