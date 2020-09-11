package com.vastika.smd.util;

public class QueryUtil {
	public static final String INSERT_USER="insert into user_tbl2(user_name,password,gender,email,hobbies,nationality,"
			+ "city_name,country_name,comments,mobile_no,dob)values(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String LIST_USER="select * from user_tbl2";
	public static final String UPDATE_USER="update user_tbl2 set user_name=?,password=?,gender=?,email=?,hobbies=?,nationality=?,city_name=?,country_name=?,comments=?,mobile_no=?,dob=? where id =?";
	public static final String DELECT_USER="delete from user_tbl2 where id=?";
	public static final String GET_USER_BY_ID="select * from user_tbl2 where id=?";

}
