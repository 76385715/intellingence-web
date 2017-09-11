package com.intellingence.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.ShoepadResultDao;
import com.intellingence.pojo.ShoepadResult;
import com.intellingence.service.ShoepadResultService;
@Service
public class ShoepadResultServiceImpl implements ShoepadResultService{
	@Autowired 
	private ShoepadResultDao shoepadResultDao;

	@Override
	public int insertSelective(ShoepadResult record) {
		return shoepadResultDao.insertSelective(record);
	}

	@Override
	public ShoepadResult selectByPrimaryKey(Integer id) {
		return shoepadResultDao.selectByPrimaryKey(id);
	}

}
