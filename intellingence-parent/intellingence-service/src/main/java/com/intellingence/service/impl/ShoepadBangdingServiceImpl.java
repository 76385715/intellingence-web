package com.intellingence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.ShoepadBangdingDao;
import com.intellingence.pojo.ShoepadBangding;
import com.intellingence.pojo.ShoepadBangdingQuery;
import com.intellingence.service.ShoepadBangdingService;
@Service
public class ShoepadBangdingServiceImpl implements ShoepadBangdingService {

	@Autowired
	private ShoepadBangdingDao shoepadBangdingDao;

	@Override
	public List<ShoepadBangding> selectBangding(ShoepadBangding record) {
		return shoepadBangdingDao.selectBangding(record);
	}

	@Override
	public List<ShoepadBangding> selectByExample(ShoepadBangdingQuery example) {
		return shoepadBangdingDao.selectByExample(example);
	}

	@Override
	public int updateBangding(ShoepadBangding record) {
		return shoepadBangdingDao.updateBangding(record);
	}

	@Override
	public int insertSelective(ShoepadBangding record) {
		return shoepadBangdingDao.insertSelective(record);
	}

	@Override
	public int deleteByExample(ShoepadBangdingQuery example) {
		return shoepadBangdingDao.deleteByExample(example);
	}


	

}
