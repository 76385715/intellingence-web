package com.intellingence.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.intellingence.entry.AmsuVo;
import com.intellingence.pojo.Paging;
import com.intellingence.pojo.Planning;
import com.intellingence.pojo.PlanningPlus;
import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import com.intellingence.pojo.UserinfoQuery.Criteria;
import com.intellingence.service.PlanningService;
import com.intellingence.service.UserinfoService;
import com.intellingence.utils.JudgeCookieUtils;

/**
 * 健康计划方法
 * @author 梦里不知身是客
 *
 */
@Controller
public class PlanningController {
	@Autowired
	private PlanningService planningService;
	@Autowired
	private UserinfoService userinfoService;

	/**
	 * 设置健康计划
	 * 
	 * @param title
	 * @param content
	 * @param date
	 * @param request
	 * @return
	 * @throws Exception
	 */

	@RequestMapping(value="/setPlanning",method={RequestMethod.POST})
	@ResponseBody
	public AmsuVo setPlanning(String title, String content, String date, HttpServletRequest request) throws Exception {
		AmsuVo amsuVo = new AmsuVo();
		// 对参数进行校验
		if (StringUtils.isBlank(title) || StringUtils.isBlank(content)) {
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("标题或内容不能为空!");
			return amsuVo;
		}
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
		// 从数据库中查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
		
		// criteria.andUseridEqualTo("13522731203");//测试
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
			Userinfo userinfo = list.get(0);
			Planning record = new Planning();
			// 将userInfo里的id插入到planning表中
			record.setUserid(userinfo.getId());
			String utfTitle = new String(title.getBytes("iso8859-1"), "utf-8");
			record.setTitle(utfTitle);
			String utfContent = new String(content.getBytes("iso8859-1"), "utf-8");
			record.setContent(utfContent);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			String s = date;
			Date d = null;
			try {
				d = formatter.parse(s);
			} catch (ParseException e) {
				amsuVo.setRet("-20002");
				amsuVo.setErrDesc("日期格式错误!");
				e.printStackTrace();
				return amsuVo;
			}
			record.setDate(d);
			record.setUpdatatime(new Date());
			planningService.insert(record);
			Integer id = record.getId();
			// 成功
			amsuVo.setRet("0");
			amsuVo.setErrDesc(id);
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
		}
		return amsuVo;
	}
	
	/** 修改健康计划
	 * 
	 * @param id
	 * @param title
	 * @param content
	 * @param date
	 * @param request
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/modifyPlanning",method={RequestMethod.POST})
	@ResponseBody
	public AmsuVo modifyPlanning(String id, String title, String content, String date, HttpServletRequest request)
			throws Exception {
		AmsuVo amsuVo = new AmsuVo();
		// 对参数进行校验
		if (StringUtils.isBlank(title) || StringUtils.isBlank(content)) {
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("标题或内容不能为空!");
			return amsuVo;
		}
		if (StringUtils.isBlank(id)) {
			amsuVo.setRet("-20004");
			amsuVo.setErrDesc("id不能为空!");
			return amsuVo;
		}
		//使用cookie工具类从cookie中获取手机号
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
		// 从数据库中查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
//		criteria.andUseridEqualTo("13522731203");//测试
		// 查询出对应用户的信息
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
			Userinfo userinfo = list.get(0);
			Planning record = new Planning();
			// 将userInfo里的id插入到planning表中
			record.setUserid(userinfo.getId());
			String utfTitle = new String(title.getBytes("iso8859-1"), "utf-8");
			record.setTitle(utfTitle);
			String utfContent = new String(content.getBytes("iso8859-1"), "utf-8");
			record.setContent(utfContent);
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date d = null;
			try  {
				d = formatter.parse(date);
			} catch (ParseException e) {
				amsuVo.setRet("-20002");
				amsuVo.setErrDesc("日期格式错误!");
				e.printStackTrace();
				return amsuVo;
			}
			record.setDate(d);
			record.setUpdatatime(new Date());
			try {
				record.setId(Integer.parseInt(id));
			} catch (Exception e) {
				amsuVo.setRet("-20004");
				amsuVo.setErrDesc("id格式错误!");
				e.printStackTrace();
				return amsuVo;
			}
			planningService.updateByPrimaryKey(record);
			// 成功
			amsuVo.setRet("0");
			amsuVo.setErrDesc("修改成功!");
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
		}

		return amsuVo;
	}
	
	/**
	 * 获取历史20条健康计划列表
	 */
	@RequestMapping(value="/planningPastList",method={RequestMethod.POST})
	@ResponseBody
	public AmsuVo planningPastList(HttpServletRequest request){
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		//获取当前用户的id(手机号)
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
		// 从数据库中查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
//		criteria.andUseridEqualTo("13522731203");//测试
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
			Userinfo userinfo = list.get(0);
			//通过userinfo中的userid作为条件,查询planning表中的数据
			List<PlanningPlus> pList = planningService.selectPlanningsByUserID(userinfo.getId());
			if(pList==null || pList.size()<1){
				amsuVo.setRet("0");
				amsuVo.setErrDesc("没有数据");
				return amsuVo;
			}
			// 成功
			amsuVo.setRet("0");
			amsuVo.setErrDesc(pList);
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
		}
		return amsuVo;
	}
	
	/**
	 * 获取健康计划列表(带分页)
	 */
	@RequestMapping(value="/planningList",method={RequestMethod.POST})
	@ResponseBody
	public AmsuVo planningList(@RequestParam(defaultValue="1") Integer page,@RequestParam(defaultValue="10") Integer numbers,HttpServletRequest request){
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		//获取当前用户的id(手机号)
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
		// 从数据库中查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
//		criteria.andUseridEqualTo("13522731203");//测试
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
			Userinfo userinfo = list.get(0);
			Integer preNumbers = (page-1)*numbers;
			Paging paging = new Paging(preNumbers, numbers, userinfo.getId());
			//通过userinfo中的userid作为条件,查询planning表中的数据
			List<PlanningPlus> pList = planningService.selectPlanningsByUserIDLimit(paging);
			if(pList==null || pList.size()<1){
				amsuVo.setRet("0");
				amsuVo.setErrDesc("没有数据");
				return amsuVo;
			} 
			// 成功
			amsuVo.setRet("0");
			amsuVo.setErrDesc(pList);
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
		}
		return amsuVo;
	}
	/**
	 * 获取计划内容
	 * @param id
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/planningCont",method={RequestMethod.POST})
	@ResponseBody
	public AmsuVo planningCont(Integer id,HttpServletRequest request){
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		PlanningPlus planning = planningService.selectPlanningById(id);
		if(planning==null){
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("无此数据!");
		}else{
			amsuVo.setRet("0"); 
			amsuVo.setErrDesc(planning);
		}
		return amsuVo;
	}
	
	/**
	 * 获取一天计划列表
	 * @param date
	 * @param request
	 * @return
	 */
	@RequestMapping(value="/planningDateList",method={RequestMethod.POST})
	@ResponseBody
	public AmsuVo planningDateList(String date,HttpServletRequest request){
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001"); 
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		// 对参数进行校验
		if (StringUtils.isBlank(date) || StringUtils.isBlank(date)) {
			amsuVo.setRet("-20003");
			amsuVo.setErrDesc("查询日期不能为空!");
			return amsuVo;
		}
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date d = null;
		try  {
			d = formatter.parse(date);
			//获取当前用户的id(手机号)
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
			// 从数据库中查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
//			criteria.andUseridEqualTo("13522731203");//测试
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				Userinfo userinfo = list.get(0);
				//通过userinfo中的userid和date作为条件,查询planning表中的数据
				Planning pl = new Planning();
				pl.setUserid(userinfo.getId());
				pl.setDate(d);
				List<PlanningPlus> pList = planningService.selectOneDayPlanningsByUserIDAndDate(pl);
				if(pList==null || pList.size()<1){
					amsuVo.setRet("0");
					amsuVo.setErrDesc("没有数据");
					return amsuVo;
				} 
				// 成功
				amsuVo.setRet("0");
				amsuVo.setErrDesc(pList);
				
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
			}
			
		} catch (ParseException e) {
			amsuVo.setRet("-20002");
			amsuVo.setErrDesc("日期格式错误!");
			e.printStackTrace();
			return amsuVo;
		}
		return amsuVo;
	}
}
