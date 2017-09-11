package com.intellingence.service;

import java.util.List;

import com.intellingence.pojo.Paging;
import com.intellingence.pojo.Planning;
import com.intellingence.pojo.PlanningPlus;

public interface PlanningService {
	public int insert(Planning record);
	public void updateByPrimaryKey(Planning record);
	public List<PlanningPlus> selectPlanningsByUserID(Integer userID);
	public List<PlanningPlus> selectPlanningsByUserIDLimit(Paging paging);
	public PlanningPlus selectPlanningById(Integer id);
	public List<PlanningPlus> selectOneDayPlanningsByUserIDAndDate(Planning planning);
}
