package com.intellingence.service;

import java.util.List;

import com.intellingence.pojo.ShoepadData;
import com.intellingence.pojo.ShoepadDataQuery;
import com.intellingence.pojo.ShoepadDataWithBLOBs;

public interface ShoePadDataService {
	public int insert(ShoepadDataWithBLOBs record);
	public List<ShoepadDataWithBLOBs> selectShoepadList(ShoepadDataWithBLOBs record);
	public ShoepadDataWithBLOBs selectByPrimaryKey(Integer id);
	public int deleteByExample(ShoepadDataQuery example);
    public int updateShoepadState(ShoepadData record);

}
