package com.intellingence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.VersionWatchDao;
import com.intellingence.pojo.VersionWatchWithBLOBs;
import com.intellingence.service.WatchVersionService;
@Service
public class WatchVersionServiceImpl implements WatchVersionService {

	@Autowired
	private VersionWatchDao versionWatchDao;
	
	@Override
	public int insertSelective(VersionWatchWithBLOBs record) {
		return versionWatchDao.insertSelective(record);
	}

	@Override
	public VersionWatchWithBLOBs selectLastVersion() {
		return versionWatchDao.selectLastVersion();
	}

}
