/**
 * 
 */
package com.practice.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.practice.model.User;

/**
 * @author AnudeepKumar
 *
 */
public class UserObjectMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet resultSet, int arg1) throws SQLException {
		User user = new User();
		user.setUserId(resultSet.getInt("USERID"));
		user.setFirstName(resultSet.getString("FIRSTNAME"));
		user.setLastName(resultSet.getString("LASTNAME"));
		user.setAddress(resultSet.getString("ADDRESS"));
		user.setCity(resultSet.getString("CITY"));
		return user;
	}

}
