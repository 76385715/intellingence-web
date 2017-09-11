package com.intellingence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.HealthdataDao;
import com.intellingence.entry.ZaoboLouboTimes;
import com.intellingence.pojo.HealthDataQueryVo;
import com.intellingence.pojo.HealthdataQuery;
import com.intellingence.pojo.HealthdataQueryAndUserId;
import com.intellingence.pojo.HealthdataWithBLOBs;
import com.intellingence.service.HealthDataService;
@Service
public class HealthDataServiceImpl implements HealthDataService {
	@Autowired
	private HealthdataDao healthdataDao;

	@Override
	public void insertSelective(HealthdataWithBLOBs record) {
		healthdataDao.insertSelective(record);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRrepHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRrepHealthDataByParameter(queryVo);
	}

	@Override
	public int selectCountHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountHealthDataByParameter(queryVo);
	}

	@Override
	public int selectCountNormalHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountNormalHealthDataByParameter(queryVo);
	}

	@Override
	public int selectCountAbnormalHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountAbnormalHealthDataByParameter(queryVo);
	}

	@Override
	public int selectCountLouboHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountLouboHealthDataByParameter(queryVo);
	}

	@Override
	public int selectCountZaoboHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountZaoboHealthDataByParameter(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRRrepHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRRrepHealthDataByParameter(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRVrepHealthDataByParameter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRVrepHealthDataByParameter(queryVo);
	}

	@Override
	public int selectCountHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public int selectCountNormalHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountNormalHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public int selectCountAbnormalHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountAbnormalHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public int selectCountLouboHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountLouboHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public int selectCountZaoboHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountZaoboHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRRrepHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRRrepHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRVrepHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRVrepHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRrepHealthDataByParameterQuarter(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRrepHealthDataByParameterQuarter(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRrepHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRrepHealthDataByParameterYear(queryVo);
	}

	@Override
	public int selectCountHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountHealthDataByParameterYear(queryVo);
	}

	@Override
	public int selectCountNormalHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountNormalHealthDataByParameterYear(queryVo);
	}

	@Override
	public int selectCountAbnormalHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountAbnormalHealthDataByParameterYear(queryVo);
	}

	@Override
	public int selectCountLouboHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountLouboHealthDataByParameterYear(queryVo);
	}

	@Override
	public int selectCountZaoboHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectCountZaoboHealthDataByParameterYear(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRRrepHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRRrepHealthDataByParameterYear(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHRVrepHealthDataByParameterYear(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHRVrepHealthDataByParameterYear(queryVo);
	}

	@Override
	public HealthdataWithBLOBs selectByPrimaryKey(Integer id) {
		return healthdataDao.selectByPrimaryKey(id);
	}

	@Override
	public List<HealthdataWithBLOBs> selectByExampleWithBLOBs(HealthdataQuery example) {
		return healthdataDao.selectByExampleWithBLOBs(example);
	}

	@Override
	public int selectTotalCountByUserId(Integer id) {
		return healthdataDao.selectTotalCountByUserId(id);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHealthDataByPage(HealthdataQueryAndUserId page) {
		return healthdataDao.selectHealthDataByPage(page);
	}

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return healthdataDao.deleteByPrimaryKey(id);
	}

	@Override
	public int updateAlivenessById(Integer id) {
		return healthdataDao.updateAlivenessById(id);
	}

	@Override
	public int selectSportTimesByWeek(HealthDataQueryVo queryVo) {
		return healthdataDao.selectSportTimesByWeek(queryVo);
	}

	@Override
	public List<ZaoboLouboTimes> selectZaoBoLouBoTimesByWeek(HealthDataQueryVo queryVo) {
		return healthdataDao.selectZaoBoLouBoTimesByWeek(queryVo);
	}

	@Override
	public List<Integer> selectAHRByWeek(HealthDataQueryVo queryVo) {
		return healthdataDao.selectAHRByWeek(queryVo);
	}

	@Override
	public List<Integer> selectFIByWeek(HealthDataQueryVo queryVo) {
		return healthdataDao.selectFIByWeek(queryVo);
	}

	@Override
	public List<Integer> selectRAByWeek(HealthDataQueryVo queryVo) {
		return healthdataDao.selectRAByWeek(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHealthDatasByWeek(HealthDataQueryVo queryVo) {
		return healthdataDao.selectHealthDatasByWeek(queryVo);
	}

	@Override
	public List<HealthdataWithBLOBs> selectDatasToAmerica() {
		return healthdataDao.selectDatasToAmerica();
	}

	@Override
	public HealthdataWithBLOBs selectHealthdataWithBLOBsByUserIDANDTimestamp(HealthdataWithBLOBs blobs) {
		return healthdataDao.selectHealthdataWithBLOBsByUserIDANDTimestamp(blobs);
	}

	@Override
	public List<HealthdataWithBLOBs> selectHealthdataByIdAndUserid(HealthdataWithBLOBs b) {
		return healthdataDao.selectHealthdataByIdAndUserid(b);
	}
}
