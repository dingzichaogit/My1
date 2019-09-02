package com.hyxy.Dao;

import com.hyxy.entity.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);



	List<User> selectUser(Map<String, String> map);

	

	
}