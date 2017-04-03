package com.lgsc.wenda.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.lgsc.wenda.model.User;

public interface UserMapper{
	
	 public static final String TABLE_NAME=" user ";
	
	 public static final String INSERT_FIELDES=" name,password,salt,head_url ";
	 
	 public static final String SELECT_FIELDES=" id,"+INSERT_FIELDES;
	 
	 @Insert({"insert into",TABLE_NAME,"(",INSERT_FIELDES,") "
	 		+ "values(#{userName},#{password},#{salt},#{headUrl})"})
	 public int addUser(User user);
	 
	 @Update({"update",TABLE_NAME,"set password=","#{password}","where id = #{userId}"})
	 public int update(User user);
	 
	 @Select({"select",SELECT_FIELDES,"from user where id =#{userId}"})
	 @Results({@Result(property="userId",column="id"),@Result(property="headUrl",column="head_url")})
	 public User getUserById(Integer userId);
	 
	 @Delete({"delete from user where id=#{userId}"})
	 public int deleteUserById(Integer userId);
}
