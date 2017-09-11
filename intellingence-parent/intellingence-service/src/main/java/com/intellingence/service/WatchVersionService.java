package com.intellingence.service;

import com.intellingence.pojo.VersionWatchWithBLOBs;

public interface WatchVersionService {
	public int insertSelective(VersionWatchWithBLOBs record);
	public VersionWatchWithBLOBs selectLastVersion();
}
