package com.springBoot;

import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot05JdbcApplicationTests {

	@Resource(name="druidDataSource")
	DataSource dataSource;
	
	@Test
	public void contextLoads() throws SQLException {
		System.err.println(dataSource.hashCode());
		System.err.println(dataSource.getClass());
		System.err.println(dataSource.getConnection());
	}

}

