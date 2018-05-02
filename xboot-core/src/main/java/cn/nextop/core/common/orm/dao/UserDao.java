package cn.nextop.core.common.orm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import cn.nextop.core.common.orm.po.User;

@Mapper
public interface UserDao {
	
	@Insert("INSERT INTO PUBLIC.USER(USERNAME,PASSWORD,EMAIL) VALUES(#{userName}, #{password}, #{email})")
    void insert(User user);
	
	@Select("SELECT * FROM PUBLIC.USER")
    @Results({
        @Result(property = "userName",  column = "USERNAME"),
        @Result(property = "password", column = "PASSWORD"),
        @Result(property = "email", column = "EMAIL")
    })
    List<User> getAll();
}
