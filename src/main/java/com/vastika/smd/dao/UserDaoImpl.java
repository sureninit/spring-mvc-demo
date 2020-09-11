package com.vastika.smd.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vastika.smd.model.User;
import com.vastika.smd.util.QueryUtil;
import com.vastika.smd.util.UserRowMapper;

public class UserDaoImpl implements UserDao {

	@Autowired
	private DataSource dataSource; 
	
	@Override
	public void saveUser(User user) {
		getJdbcTemplate().update(QueryUtil.INSERT_USER, new Object[] {user.getUserName(),
				user.getPassword(),user.getGender(),user.getEmail(),user.getHobbies(),user.getNationality(),
				user.getAddress().getCityName(),user.getAddress().getCountryName(),user.getComments(),
				user.getMobileNo(),user.getDob()});

	}
	
	

	@Override
	public void updateUser(User user) {
		getJdbcTemplate().update(QueryUtil.UPDATE_USER, new Object[] {user.getUserName(),
				user.getPassword(),user.getGender(),user.getEmail(),user.getHobbies(),user.getNationality(),
				user.getAddress().getCityName(),user.getAddress().getCountryName(),user.getComments(),
				user.getMobileNo(),user.getDob(),user.getId()});
		
	}

	@Override
	public void deleteUser(int id) {
		getJdbcTemplate().update(QueryUtil.DELECT_USER, new Object[] {id});
		
	}

	@Override
	public List<User> getAllUser() {
		return getJdbcTemplate().query(QueryUtil.LIST_USER, new UserRowMapper());
	}

	@Override
	public User getUserById(int id) {
		return getJdbcTemplate().query(QueryUtil.GET_USER_BY_ID, new Object[] {id},new UserRowMapper()).get(0);
	}
	
	private JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(dataSource);
	}

}
