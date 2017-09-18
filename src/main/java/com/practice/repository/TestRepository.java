/**
 * 
 */
package com.practice.repository;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.model.User;
import com.practice.util.UserObjectMapper;

/**
 * @author AnudeepKumar
 *
 */
public class TestRepository {

	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	public List<User> getUserDeails() {

		String sql = "select * from USERDETAILS";
		List<User> userData = jdbcTemplateObject.query(sql, new UserObjectMapper());
		return userData;
	}

}
