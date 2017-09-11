package com.intellingence.service;

import com.intellingence.pojo.VersionWithBLOBs;

public interface VersionService {
	public int insertSelective(VersionWithBLOBs record);
	public VersionWithBLOBs selectLastVersion();
}
