package com.intellingence.service;

import java.util.List;

import com.intellingence.pojo.Devicebinging;
import com.intellingence.pojo.DevicebingingQuery;

public interface DevicebingingService {
	public List<Devicebinging> selectByExample(DevicebingingQuery example);
	public int insertSelective(Devicebinging record);
	public int updateByPrimaryKeySelective(Devicebinging record);
}
