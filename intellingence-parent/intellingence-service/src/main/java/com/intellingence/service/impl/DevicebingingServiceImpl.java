package com.intellingence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.DevicebingingDao;
import com.intellingence.pojo.Devicebinging;
import com.intellingence.pojo.DevicebingingQuery;
import com.intellingence.service.DevicebingingService;

@Service
public class DevicebingingServiceImpl implements DevicebingingService{
	@Autowired
	private DevicebingingDao devicebingingDao;

	@Override
	public List<Devicebinging> selectByExample(DevicebingingQuery example) {
		return devicebingingDao.selectByExample(example);
	}

	@Override
	public int insertSelective(Devicebinging record) {
		return devicebingingDao.insertSelective(record);
	}

	@Override
	public int updateByPrimaryKeySelective(Devicebinging record) {
		return devicebingingDao.updateByPrimaryKeySelective(record);
	}
	
	
} 
        