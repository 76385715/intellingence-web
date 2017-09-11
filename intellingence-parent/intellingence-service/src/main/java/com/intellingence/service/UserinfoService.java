package com.intellingence.service;

import java.util.List;

import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;

public interface UserinfoService {
	List<Userinfo> selectByExample(UserinfoQuery example);
	void insertSelective(Userinfo userinfo);
	void updateByPrimaryKeySelective(Userinfo userinfo);
}
