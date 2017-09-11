package com.intellingence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.ShoepadDataDao;
import com.intellingence.pojo.ShoepadData;
import com.intellingence.pojo.ShoepadDataQuery;
import com.intellingence.pojo.ShoepadDataWithBLOBs;
import com.intellingence.pojo.ShoepadResult;
import com.intellingence.service.ShoePadDataService;
@Service
public class ShoePadServiceImpl implements ShoePadDataService {

	@Autowired 
	private ShoepadDataDao shoepadDataDao;
	@Override
	public int insert(ShoepadDataWithBLOBs record){
		return shoepadDataDao.insert(record);
	}
	@Override
	public List<ShoepadDataWithBLOBs> selectShoepadList(ShoepadDataWithBLOBs record) {
		return shoepadDataDao.selectShoepadList(record);
	}
	@Override
	public ShoepadDataWithBLOBs selectByPrimaryKey(Integer id) {
		return shoepadDataDao.selectByPrimaryKey(id);
	}
	@Override
	public int deleteByExample(ShoepadDataQuery example) {
		return shoepadDataDao.deleteByExample(example);
	}
	@Override
	public int updateShoepadState(ShoepadData record) {
		return shoepadDataDao.updateShoepadState(record);
	}

}
