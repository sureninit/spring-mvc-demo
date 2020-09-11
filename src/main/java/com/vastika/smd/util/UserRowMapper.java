package com.vastika.smd.util;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.vastika.smd.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserRowExtractor extractor=new UserRowExtractor();
		User user = extractor.extractData(rs);
		return user;
	}

}
 