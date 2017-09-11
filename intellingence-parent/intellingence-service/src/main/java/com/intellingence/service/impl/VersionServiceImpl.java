package com.intellingence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.VersionDao;
import com.intellingence.pojo.Version;
import com.intellingence.pojo.VersionWithBLOBs;
import com.intellingence.service.VersionService;
@Service
public class VersionServiceImpl implements VersionService{
	@Autowired
	private VersionDao versionDao;

	@Override
	public int insertSelective(VersionWithBLOBs record) {
		return versionDao.insertSelective(record);
	}

	@Override
	public VersionWithBLOBs selectLastVersion() {
		return versionDao.selectLastVersion();
	}
	
}
