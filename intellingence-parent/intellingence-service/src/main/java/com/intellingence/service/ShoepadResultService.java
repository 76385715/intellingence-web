package com.intellingence.service;

import java.util.List;

import com.intellingence.pojo.ShoepadResult;

public interface ShoepadResultService {
	public int insertSelective(ShoepadResult record);
	public ShoepadResult selectByPrimaryKey(Integer id);
}
