package com.intellingence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.UserinfoDao;
import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import com.intellingence.service.UserinfoService;
@Service
public class UserinfoServiceImpl implements UserinfoService {
	@Autowired
	private UserinfoDao userinfoDao;

	@Override
	public List<Userinfo> selectByExample(UserinfoQuery example) {
//		System.out.println(example);
		return userinfoDao.selectByExample(example);
	}

	@Override
	public void insertSelective(Userinfo userinfo) {
		userinfoDao.insertSelective(userinfo);
	}

	@Override
	public void updateByPrimaryKeySelective(Userinfo userinfo) {
		userinfoDao.updateByPrimaryKeySelective(userinfo);
	}
	
	
}
