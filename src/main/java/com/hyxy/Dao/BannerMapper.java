package com.hyxy.Dao;

import com.hyxy.entity.Picture;
import com.hyxy.entity.User;
import java.util.List;
import java.util.Map;

public interface BannerMapper {

	void insert(Map<String, Object> map);

	List<Picture> select();

	void delete(int id);

	List<Picture> selectid(int id);

	void update(Map<String, Object> map);


    

	

	
}