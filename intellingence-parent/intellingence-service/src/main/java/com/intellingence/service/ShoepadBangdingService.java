package com.intellingence.service;

import java.util.List;

import com.intellingence.pojo.ShoepadBangding;
import com.intellingence.pojo.ShoepadBangdingQuery;

public interface ShoepadBangdingService {
	public List<ShoepadBangding> selectBangding(ShoepadBangding record);
	public List<ShoepadBangding> selectByExample(ShoepadBangdingQuery example);
	public int updateBangding(ShoepadBangding record);
	public int insertSelective(ShoepadBangding record);
	public int deleteByExample(ShoepadBangdingQuery example);
}
