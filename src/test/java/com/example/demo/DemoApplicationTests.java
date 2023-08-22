package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	static {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe",
				"c##seungjin", "seungjin"
		)) {
			System.out.println(con);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
