package com.intellingence.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellingence.dao.PlanningDao;
import com.intellingence.pojo.Paging;
import com.intellingence.pojo.Planning;
import com.intellingence.pojo.PlanningPlus;
import com.intellingence.service.PlanningService;
@Service
public class PlanningServiceImpl implements PlanningService {
	@Autowired
	private PlanningDao planningDao;

	@Override
	public int insert(Planning record) {
		return planningDao.insert(record);
	}

	@Override
	public void updateByPrimaryKey(Planning record) {
		planningDao.updateByPrimaryKey(record);
	}

	@Override
	public List<PlanningPlus> selectPlanningsByUserID(Integer userID) {
		return planningDao.selectPlanningsByUserID(userID);
	}

	@Override
	public List<PlanningPlus> selectPlanningsByUserIDLimit(Paging paging) {
		return planningDao.selectPlanningsByUserIDLimit(paging);
	}

	@Override
	public PlanningPlus selectPlanningById(Integer id) {
		return planningDao.selectPlanningById(id);
	}

	@Override
	public List<PlanningPlus> selectOneDayPlanningsByUserIDAndDate(Planning planning) {
		return planningDao.selectOneDayPlanningsByUserIDAndDate(planning);
	}
}
