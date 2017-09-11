package com.intellingence.controller;

import java.io.File;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.intellingence.entry.AmsuVo;
import com.intellingence.entry.ZaoboLouboTimes;
import com.intellingence.pojo.HealthDataQueryVo;
import com.intellingence.pojo.HealthdataQuery;
import com.intellingence.pojo.HealthdataQueryAndUserId;
import com.intellingence.pojo.HealthdataWithBLOBs;
import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import com.intellingence.pojo.UserinfoQuery.Criteria;
import com.intellingence.service.HealthDataService;
import com.intellingence.service.UserinfoService;
import com.intellingence.utils.CalculatePagesUtils;
import com.intellingence.utils.CheckParameterUtils;
import com.intellingence.utils.JudgeCookieUtils;
import com.intellingence.utils.QuarterUtils;
import com.intellingence.utils.TranscodingUtils;

/**
 * 关于报告的controller
 * 
 * @author 梦里不知身是客
 *
 */
@Controller
public class ReportController {
	@Autowired
	private UserinfoService userinfoService;
	@Autowired
	private HealthDataService healthDataService;

	/**
	 * 上传健康数据 此处多一个需要上传的参数 inuse
	 * 
	 * @param request
	 * @param healthdataWithBLOBs
	 * @throws Exception
	 */
	@RequestMapping(value = "/uploadReport")
	@ResponseBody
	public AmsuVo uploadReport(HttpServletRequest request, HealthdataWithBLOBs healthdataWithBLOBs) {
		AmsuVo amsuVo = new AmsuVo();
		// System.out.println(healthdataWithBLOBs);
		try {
			if (null == healthdataWithBLOBs.getInuse()) {
				// 默认为有用数据
				healthdataWithBLOBs.setInuse(1);
			}
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13522731203";//测试专用
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			// criteria.andUseridEqualTo("13522731203");//测试
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				// =====================测试使用get请求
				// 需要进行转码=================================//
				// String hrvs = healthdataWithBLOBs.getHrvs();
				// String newHrvs = new
				// String(hrvs.getBytes("iso859-1"),"utf-8");
				// healthdataWithBLOBs.setHrvs(newHrvs);
				//
				// String hrvr = healthdataWithBLOBs.getHrvr();
				// String newHrvr = new
				// String(hrvr.getBytes("iso8859-1"),"utf-8");
				// healthdataWithBLOBs.setHrvr(newHrvr);
				//
				// String hrr = healthdataWithBLOBs.getHrr();
				// String newHrr = new
				// String(hrr.getBytes("iso8859-1"),"utf-8");
				// healthdataWithBLOBs.setHrr(newHrr);
				//
				// String hrs = healthdataWithBLOBs.getHrs();
				// String newHrs = new
				// String(hrs.getBytes("iso8859-1"),"utf-8");
				// healthdataWithBLOBs.setHrs(newHrs);
				//
				// String ecs = healthdataWithBLOBs.getEcs();
				// String newEcs = new
				// String(ecs.getBytes("iso8859-1"),"utf-8");
				// healthdataWithBLOBs.setEcs(newEcs);
				// =====================测试使用get请求
				// 需要进行转码=================================//
				// 拿到登录用户
				Userinfo userinfo = list.get(0);

				HealthdataWithBLOBs hblobs = new HealthdataWithBLOBs();
				hblobs.setUserid(userinfo.getId());
				hblobs.setTimestamp(healthdataWithBLOBs.getTimestamp());
				// 查询是否已经上传
				HealthdataWithBLOBs healthBlobs = healthDataService
						.selectHealthdataWithBLOBsByUserIDANDTimestamp(hblobs);
				if (null == healthBlobs) {
					// 设置healthdataWithBLOBs的具体值
					healthdataWithBLOBs.setUserid(userinfo.getId());
					healthdataWithBLOBs.setUpdatetime(new Date());
					// 获取指定的毫秒值
					// String timestamp = healthdataWithBLOBs.getTimestamp();
					Calendar calendar = Calendar.getInstance();
					// Date date = new Date(Long.parseLong(timestamp));
					Long timestamp = healthdataWithBLOBs.getTimestamp();
					String timestampStr = timestamp + "000";
					// System.out.println(timestampStr);
					Long stamp = Long.parseLong(timestampStr);
					Date date = new Date(stamp);
					// 设置日历类
					calendar.setTime(date);
					// 获得当前年
					int nowyear = calendar.get(Calendar.YEAR);
					// 获得当前月
					int nowmonth = (calendar.get(Calendar.MONTH) + 1);
					// 获得当前季度
					int quarter = QuarterUtils.getQuarter(nowmonth);
					// 获取当前是第几个星期
					int week = calendar.get(Calendar.WEEK_OF_YEAR);
					// 获取当前是这个月的第几天
					int day = calendar.get(Calendar.DAY_OF_MONTH);

					healthdataWithBLOBs.setYear(nowyear);
					healthdataWithBLOBs.setMonth(nowmonth);
					healthdataWithBLOBs.setQuarter(quarter);
					healthdataWithBLOBs.setDate(day);
					healthdataWithBLOBs.setWeek(week);
					// 新增状态码两个
					// healthdataWithBLOBs.setInuse(1);
					healthdataWithBLOBs.setAliveness(1);

					healthDataService.insertSelective(healthdataWithBLOBs);

				}
				amsuVo.setRet("0");
				amsuVo.setErrDesc("数据上传完成");
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("没有这个用户");
			}
		} catch (Exception e) {
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			e.printStackTrace();
			return amsuVo;
		}
		return amsuVo;
	}

	/**
	 * 显示月度健康报告
	 * 
	 * @param request
	 * @param reportType
	 * @param reportTime
	 * @return
	 */
	@RequestMapping(value = "/downloadMonthReport", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo downloadMonthReport(HttpServletRequest request, String reportType, String reportTime) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			// 设置年 月 条件
			String year = null;
			String month = null;
			// 获得条件
			String condition = CheckParameterUtils.checkReportType(reportType);
			if (reportTime == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("参数不符合要求");
			} else {
				String[] split = reportTime.split("-");
				year = split[0];
				month = split[1];
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13421376717";//测试专用
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			// criteria.andUseridEqualTo("13522731203");//测试
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				Map<String, Object> dataMap = new HashMap<String, Object>();
				HealthDataQueryVo queryVo = new HealthDataQueryVo();
				queryVo.setUserid(list.get(0).getId());
				queryVo.setYear(year);
				queryVo.setMonth(month);
				queryVo.setAliveness(1);
				if (condition == null) {
					amsuVo.setRet("-20001");
					amsuVo.setErrDesc("参数不符合要求");
				} else if (condition.equals("FULL")) {
					// 说明要全部查询
					// 先查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService.selectHRrepHealthDataByParameter(queryVo);
					dataMap.put("HRrep", hRrep);
					// 查询ECrep
					// 心电总数
					int count = healthDataService.selectCountHealthDataByParameter(queryVo);
					// 正常心电数据
					int normal = healthDataService.selectCountNormalHealthDataByParameter(queryVo);
					// 异常心电数据
					int abnormal = healthDataService.selectCountAbnormalHealthDataByParameter(queryVo);
					// 漏搏心电数据
					int loubo = healthDataService.selectCountLouboHealthDataByParameter(queryVo);
					// 早搏心电数据
					int zaobo = healthDataService.selectCountZaoboHealthDataByParameter(queryVo);
					// 计算百分比
					// 创建一个数值格式化对象
					NumberFormat numberFormat = NumberFormat.getInstance();
					// 设置精确到小数点后2位
					numberFormat.setMaximumFractionDigits(2);
					String normalResult = numberFormat.format((float) normal / (float) count * 100);
					String abnormalResult = numberFormat.format((float) abnormal / (float) count * 100);
					String louboResult = numberFormat.format((float) loubo / (float) count * 100);
					String zaoboResult = numberFormat.format((float) zaobo / (float) count * 100);
					List<String> dataList = new ArrayList<String>();
					dataList.add(normalResult);
					dataList.add(abnormalResult);
					dataList.add(louboResult);
					dataList.add(zaoboResult);
					dataMap.put("ECrep", dataList);

					// HRRrep
					List<HealthdataWithBLOBs> hRRrep = healthDataService.selectHRRrepHealthDataByParameter(queryVo);
					dataMap.put("HRRrep", hRRrep);

					// HRVrep
					List<HealthdataWithBLOBs> hRVrep = healthDataService.selectHRVrepHealthDataByParameter(queryVo);
					dataMap.put("HRVrep", hRVrep);

					// HRlist
					List<List<Object>> HRDataList = new ArrayList<List<Object>>();
					if (hRrep != null && hRrep.size() > 0) {
						for (HealthdataWithBLOBs healthdataWithBLOBs : hRrep) {
							List<Object> dList = new ArrayList<Object>();
							Date datatime = healthdataWithBLOBs.getDatatime();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String format = sdf.format(datatime);
							dList.add(format);
							dList.add(healthdataWithBLOBs.getAhr());
							HRDataList.add(dList);
						}
					}
					dataMap.put("HRlist", HRDataList);
				} else if (condition.equals("HRrep")) {
					// 查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService.selectHRrepHealthDataByParameter(queryVo);
					dataMap.put("HRrep", hRrep);
				} else if (condition.equals("ECrep")) {
					// ECrep
					// 心电总数
					int count = healthDataService.selectCountHealthDataByParameter(queryVo);
					// 正常心电数据
					int normal = healthDataService.selectCountNormalHealthDataByParameter(queryVo);
					// 异常心电数据
					int abnormal = healthDataService.selectCountAbnormalHealthDataByParameter(queryVo);
					// 漏搏心电数据
					int loubo = healthDataService.selectCountLouboHealthDataByParameter(queryVo);
					// 早搏心电数据
					int zaobo = healthDataService.selectCountZaoboHealthDataByParameter(queryVo);
					// 计算百分比
					// 创建一个数值格式化对象
					NumberFormat numberFormat = NumberFormat.getInstance();
					// 设置精确到小数点后2位
					numberFormat.setMaximumFractionDigits(2);
					String normalResult = numberFormat.format((float) normal / (float) count * 100);
					String abnormalResult = numberFormat.format((float) abnormal / (float) count * 100);
					String louboResult = numberFormat.format((float) loubo / (float) count * 100);
					String zaoboResult = numberFormat.format((float) zaobo / (float) count * 100);
					List<String> dataList = new ArrayList<String>();
					dataList.add(normalResult);
					dataList.add(abnormalResult);
					dataList.add(louboResult);
					dataList.add(zaoboResult);
					dataMap.put("ECrep", dataList);
				} else if (condition.equals("HRRrep")) {
					// HRRrep
					List<HealthdataWithBLOBs> hRRrep = healthDataService.selectHRRrepHealthDataByParameter(queryVo);
					dataMap.put("HRRrep", hRRrep);
				} else if (condition.equals("HRVrep")) {
					// HRVrep
					List<HealthdataWithBLOBs> hRVrep = healthDataService.selectHRVrepHealthDataByParameter(queryVo);
					dataMap.put("HRVrep", hRVrep);
				} else if (condition.equals("HRlist")) {
					// 查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService.selectHRrepHealthDataByParameter(queryVo);
					// HRlist
					List<List<Object>> HRDataList = new ArrayList<List<Object>>();
					if (hRrep != null && hRrep.size() > 0) {
						for (HealthdataWithBLOBs healthdataWithBLOBs : hRrep) {
							List<Object> dList = new ArrayList<Object>();
							Date datatime = healthdataWithBLOBs.getDatatime();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String format = sdf.format(datatime);
							dList.add(format);
							dList.add(healthdataWithBLOBs.getAhr());
							HRDataList.add(dList);
						}
					}
					dataMap.put("HRlist", HRDataList);
				}
				amsuVo.setRet("0");
				amsuVo.setErrDesc(dataMap);
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("无此用户");
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		// 创建存储数据的map
		return amsuVo;
	}

	/**
	 * 显示季度健康报告
	 * 
	 * @param request
	 * @param reportType
	 * @param quarter
	 * @param year
	 * @return
	 */
	@RequestMapping(value = "/downloadQuarterReport", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo downloadQuarterReport(HttpServletRequest request, String reportType, String quarter, String year) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13421376717";// 测试专用
			// 获得条件
			String condition = CheckParameterUtils.checkReportType(reportType);
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			// criteria.andUseridEqualTo("13522731203");//测试
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				Map<String, Object> dataMap = new HashMap<String, Object>();
				HealthDataQueryVo queryVo = new HealthDataQueryVo();
				queryVo.setUserid(list.get(0).getId());
				queryVo.setYear(year);
				queryVo.setQuarter(quarter);
				queryVo.setAliveness(1);
				if (condition == null) {
					amsuVo.setRet("-20001");
					amsuVo.setErrDesc("参数不符合要求");
				} else if (condition.equals("FULL")) {
					// 说明要全部查询
					// 先查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService
							.selectHRrepHealthDataByParameterQuarter(queryVo);
					dataMap.put("HRrep", hRrep);
					// 查询ECrep
					// 心电总数
					int count = healthDataService.selectCountHealthDataByParameterQuarter(queryVo);
					// 正常心电数据
					int normal = healthDataService.selectCountNormalHealthDataByParameterQuarter(queryVo);
					// 异常心电数据
					int abnormal = healthDataService.selectCountAbnormalHealthDataByParameterQuarter(queryVo);
					// 漏搏心电数据
					int loubo = healthDataService.selectCountLouboHealthDataByParameterQuarter(queryVo);
					// 早搏心电数据
					int zaobo = healthDataService.selectCountZaoboHealthDataByParameterQuarter(queryVo);
					// 计算百分比
					// 创建一个数值格式化对象
					NumberFormat numberFormat = NumberFormat.getInstance();
					// 设置精确到小数点后2位
					numberFormat.setMaximumFractionDigits(2);
					String normalResult = numberFormat.format((float) normal / (float) count * 100);
					String abnormalResult = numberFormat.format((float) abnormal / (float) count * 100);
					String louboResult = numberFormat.format((float) loubo / (float) count * 100);
					String zaoboResult = numberFormat.format((float) zaobo / (float) count * 100);
					List<String> dataList = new ArrayList<String>();
					dataList.add(normalResult);
					dataList.add(abnormalResult);
					dataList.add(louboResult);
					dataList.add(zaoboResult);
					dataMap.put("ECrep", dataList);

					// HRRrep
					List<HealthdataWithBLOBs> hRRrep = healthDataService
							.selectHRRrepHealthDataByParameterQuarter(queryVo);
					dataMap.put("HRRrep", hRRrep);

					// HRVrep
					List<HealthdataWithBLOBs> hRVrep = healthDataService
							.selectHRVrepHealthDataByParameterQuarter(queryVo);
					dataMap.put("HRVrep", hRVrep);

					// HRlist
					List<List<Object>> HRDataList = new ArrayList<List<Object>>();
					if (hRrep != null && hRrep.size() > 0) {
						for (HealthdataWithBLOBs healthdataWithBLOBs : hRrep) {
							List<Object> dList = new ArrayList<Object>();
							Date datatime = healthdataWithBLOBs.getDatatime();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String format = sdf.format(datatime);
							dList.add(format);
							dList.add(healthdataWithBLOBs.getAhr());
							HRDataList.add(dList);
						}
					}
					dataMap.put("HRlist", HRDataList);
				} else if (condition.equals("HRrep")) {
					// 查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService
							.selectHRrepHealthDataByParameterQuarter(queryVo);
					dataMap.put("HRrep", hRrep);
				} else if (condition.equals("ECrep")) {
					// ECrep
					// 心电总数
					int count = healthDataService.selectCountHealthDataByParameterQuarter(queryVo);
					// 正常心电数据
					int normal = healthDataService.selectCountNormalHealthDataByParameterQuarter(queryVo);
					// 异常心电数据
					int abnormal = healthDataService.selectCountAbnormalHealthDataByParameterQuarter(queryVo);
					// 漏搏心电数据
					int loubo = healthDataService.selectCountLouboHealthDataByParameterQuarter(queryVo);
					// 早搏心电数据
					int zaobo = healthDataService.selectCountZaoboHealthDataByParameterQuarter(queryVo);
					// 计算百分比
					// 创建一个数值格式化对象
					NumberFormat numberFormat = NumberFormat.getInstance();
					// 设置精确到小数点后2位
					numberFormat.setMaximumFractionDigits(2);
					String normalResult = numberFormat.format((float) normal / (float) count * 100);
					String abnormalResult = numberFormat.format((float) abnormal / (float) count * 100);
					String louboResult = numberFormat.format((float) loubo / (float) count * 100);
					String zaoboResult = numberFormat.format((float) zaobo / (float) count * 100);
					List<String> dataList = new ArrayList<String>();
					dataList.add(normalResult);
					dataList.add(abnormalResult);
					dataList.add(louboResult);
					dataList.add(zaoboResult);
					dataMap.put("ECrep", dataList);
				} else if (condition.equals("HRRrep")) {
					// HRRrep
					List<HealthdataWithBLOBs> hRRrep = healthDataService
							.selectHRRrepHealthDataByParameterQuarter(queryVo);
					dataMap.put("HRRrep", hRRrep);
				} else if (condition.equals("HRVrep")) {
					// HRVrep
					List<HealthdataWithBLOBs> hRVrep = healthDataService
							.selectHRVrepHealthDataByParameterQuarter(queryVo);
					dataMap.put("HRVrep", hRVrep);
				} else if (condition.equals("HRlist")) {
					// 查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService
							.selectHRrepHealthDataByParameterQuarter(queryVo);
					// HRlist
					List<List<Object>> HRDataList = new ArrayList<List<Object>>();
					if (hRrep != null && hRrep.size() > 0) {
						for (HealthdataWithBLOBs healthdataWithBLOBs : hRrep) {
							List<Object> dList = new ArrayList<Object>();
							Date datatime = healthdataWithBLOBs.getDatatime();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String format = sdf.format(datatime);
							dList.add(format);
							dList.add(healthdataWithBLOBs.getAhr());
							HRDataList.add(dList);
						}
					}
					dataMap.put("HRlist", HRDataList);
				}
				amsuVo.setRet("0");
				amsuVo.setErrDesc(dataMap);
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("无此用户");
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		// 创建存储数据的map
		return amsuVo;
	}

	/**
	 * 显示年度健康报告
	 * 
	 * @param request
	 * @param reportType
	 * @param year
	 * @return
	 */
	@RequestMapping(value = "/downloadYearReport", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo downloadYearReport(HttpServletRequest request, String reportType, String year) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13421376717";// 测试专用
			// 获得条件
			String condition = CheckParameterUtils.checkReportType(reportType);
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				Map<String, Object> dataMap = new HashMap<String, Object>();
				HealthDataQueryVo queryVo = new HealthDataQueryVo();
				queryVo.setUserid(list.get(0).getId());
				queryVo.setYear(year);
				queryVo.setAliveness(1);
				if (condition == null) {
					amsuVo.setRet("-20001");
					amsuVo.setErrDesc("参数不符合要求");
				} else if (condition.equals("FULL")) {
					// 说明要全部查询
					// 先查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService.selectHRrepHealthDataByParameterYear(queryVo);
					dataMap.put("HRrep", hRrep);
					// 查询ECrep
					// 心电总数
					int count = healthDataService.selectCountHealthDataByParameterYear(queryVo);
					// 正常心电数据
					int normal = healthDataService.selectCountNormalHealthDataByParameterYear(queryVo);
					// 异常心电数据
					int abnormal = healthDataService.selectCountAbnormalHealthDataByParameterYear(queryVo);
					// 漏搏心电数据
					int loubo = healthDataService.selectCountLouboHealthDataByParameterYear(queryVo);
					// 早搏心电数据
					int zaobo = healthDataService.selectCountZaoboHealthDataByParameterYear(queryVo);
					// 计算百分比
					// 创建一个数值格式化对象
					NumberFormat numberFormat = NumberFormat.getInstance();
					// 设置精确到小数点后2位
					numberFormat.setMaximumFractionDigits(2);
					String normalResult = numberFormat.format((float) normal / (float) count * 100);
					String abnormalResult = numberFormat.format((float) abnormal / (float) count * 100);
					String louboResult = numberFormat.format((float) loubo / (float) count * 100);
					String zaoboResult = numberFormat.format((float) zaobo / (float) count * 100);
					List<String> dataList = new ArrayList<String>();
					dataList.add(normalResult);
					dataList.add(abnormalResult);
					dataList.add(louboResult);
					dataList.add(zaoboResult);
					dataMap.put("ECrep", dataList);

					// HRRrep
					List<HealthdataWithBLOBs> hRRrep = healthDataService.selectHRRrepHealthDataByParameterYear(queryVo);
					dataMap.put("HRRrep", hRRrep);

					// HRVrep
					List<HealthdataWithBLOBs> hRVrep = healthDataService.selectHRVrepHealthDataByParameterYear(queryVo);
					dataMap.put("HRVrep", hRVrep);

					// HRlist
					List<List<Object>> HRDataList = new ArrayList<List<Object>>();
					if (hRrep != null && hRrep.size() > 0) {
						for (HealthdataWithBLOBs healthdataWithBLOBs : hRrep) {
							List<Object> dList = new ArrayList<Object>();
							Date datatime = healthdataWithBLOBs.getDatatime();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String format = sdf.format(datatime);
							dList.add(format);
							dList.add(healthdataWithBLOBs.getAhr());
							HRDataList.add(dList);
						}
					}
					dataMap.put("HRlist", HRDataList);
				} else if (condition.equals("HRrep")) {
					// 查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService.selectHRrepHealthDataByParameterYear(queryVo);
					dataMap.put("HRrep", hRrep);
				} else if (condition.equals("ECrep")) {
					// ECrep
					// 心电总数
					int count = healthDataService.selectCountHealthDataByParameterYear(queryVo);
					// 正常心电数据
					int normal = healthDataService.selectCountNormalHealthDataByParameterYear(queryVo);
					// 异常心电数据
					int abnormal = healthDataService.selectCountAbnormalHealthDataByParameterYear(queryVo);
					// 漏搏心电数据
					int loubo = healthDataService.selectCountLouboHealthDataByParameterYear(queryVo);
					// 早搏心电数据
					int zaobo = healthDataService.selectCountZaoboHealthDataByParameterYear(queryVo);
					// 计算百分比
					// 创建一个数值格式化对象
					NumberFormat numberFormat = NumberFormat.getInstance();
					// 设置精确到小数点后2位
					numberFormat.setMaximumFractionDigits(2);
					String normalResult = numberFormat.format((float) normal / (float) count * 100);
					String abnormalResult = numberFormat.format((float) abnormal / (float) count * 100);
					String louboResult = numberFormat.format((float) loubo / (float) count * 100);
					String zaoboResult = numberFormat.format((float) zaobo / (float) count * 100);
					List<String> dataList = new ArrayList<String>();
					dataList.add(normalResult);
					dataList.add(abnormalResult);
					dataList.add(louboResult);
					dataList.add(zaoboResult);
					dataMap.put("ECrep", dataList);
				} else if (condition.equals("HRRrep")) {
					// HRRrep
					List<HealthdataWithBLOBs> hRRrep = healthDataService.selectHRRrepHealthDataByParameterYear(queryVo);
					dataMap.put("HRRrep", hRRrep);
				} else if (condition.equals("HRVrep")) {
					// HRVrep
					List<HealthdataWithBLOBs> hRVrep = healthDataService.selectHRVrepHealthDataByParameterYear(queryVo);
					dataMap.put("HRVrep", hRVrep);
				} else if (condition.equals("HRlist")) {
					// 查询HRrep
					List<HealthdataWithBLOBs> hRrep = healthDataService.selectHRrepHealthDataByParameterYear(queryVo);
					// HRlist
					List<List<Object>> HRDataList = new ArrayList<List<Object>>();
					if (hRrep != null && hRrep.size() > 0) {
						for (HealthdataWithBLOBs healthdataWithBLOBs : hRrep) {
							List<Object> dList = new ArrayList<Object>();
							Date datatime = healthdataWithBLOBs.getDatatime();
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String format = sdf.format(datatime);
							dList.add(format);
							dList.add(healthdataWithBLOBs.getAhr());
							HRDataList.add(dList);
						}
					}
					dataMap.put("HRlist", HRDataList);
				}
				amsuVo.setRet("0");
				amsuVo.setErrDesc(dataMap);
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("无此用户");
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		// 创建存储数据的map
		return amsuVo;
	}

	/**
	 * 根据id查询对应的历史健康报告(实际是根据id和用户id进行查询的)
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/getDetail"/* , method = { RequestMethod.POST } */)
	@ResponseBody
	public AmsuVo getDetail(HttpServletRequest request, Integer id) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			// if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request,
			// "uid") == null) {
			// amsuVo.setRet("-20001");
			// amsuVo.setErrDesc("请先登录!");
			// return amsuVo;
			// }
			if (id == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("id为null");
				return amsuVo;
			}
			// String phone =
			// JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request,
			// "uid");
			String phone = "13428986193";// 测试专用
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				// HealthdataQuery healthdataQuery = new HealthdataQuery();
				// com.intellingence.pojo.HealthdataQuery.Criteria
				// createCriteria = healthdataQuery.createCriteria();
				// createCriteria.andIdEqualTo(id);
				// createCriteria.andUseridEqualTo(list.get(0).getId());
				// List<HealthdataWithBLOBs> HealthdataWithBLOBsList =
				// healthDataService
				// .selectByExampleWithBLOBs(healthdataQuery);

				HealthdataWithBLOBs b = new HealthdataWithBLOBs();
				b.setId(id);
				b.setUserid(list.get(0).getId());
				List<HealthdataWithBLOBs> HealthdataWithBLOBsList = healthDataService.selectHealthdataByIdAndUserid(b);

				if (HealthdataWithBLOBsList != null && HealthdataWithBLOBsList.size() > 0) {
					amsuVo.setRet("0");
					amsuVo.setErrDesc(HealthdataWithBLOBsList.get(0));
				} else {
					amsuVo.setRet("-20001");
					amsuVo.setErrDesc("无此数据");
				}
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("用户id不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		return amsuVo;
	}

	/**
	 * 获取历史健康数据总页数
	 * 
	 * @param request
	 * @param recordNumber
	 * @return
	 */
	@RequestMapping(value = "/getReportListPage", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo getReportListPage(HttpServletRequest request,
			@RequestParam(name = "record_number") Integer recordNumber) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			if (recordNumber == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("record_number为null");
				return amsuVo;
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13421376717";// 测试专用
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				Integer id = list.get(0).getId();
				int count = healthDataService.selectTotalCountByUserId(id);
				Map<String, Integer> dataMap = new HashMap<String, Integer>();
				dataMap.put("record_number", recordNumber);
				dataMap.put("page", CalculatePagesUtils.calculatePages(recordNumber, count));
				amsuVo.setRet("0");
				amsuVo.setErrDesc(dataMap);
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("用户id不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		return amsuVo;
	}

	/**
	 * 获取指定id下的报告列表
	 * 
	 * @param request
	 * @param recordNumber
	 * @param page
	 * @return
	 */
	@RequestMapping(value = "/getReportList", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo getReportList(HttpServletRequest request, @RequestParam(name = "record_number") Integer recordNumber,
			@RequestParam(name = "page", defaultValue = "1") Integer page) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13421376717";// 测试专用
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				Integer id = list.get(0).getId();
				HealthdataQueryAndUserId pqauid = new HealthdataQueryAndUserId();
				pqauid.setUserId(id);
				pqauid.setPageNo(page);
				pqauid.setPageSize(recordNumber);
				pqauid.setAliveness(1);
				List<HealthdataWithBLOBs> dataList = healthDataService.selectHealthDataByPage(pqauid);
				amsuVo.setRet("0");
				amsuVo.setErrDesc(dataList);
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("用户id不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		return amsuVo;
	}

	/**
	 * 根据id对数据进行删除(修改状态)
	 * 
	 * @param request
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/deleteById", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo deleteById(HttpServletRequest request, Integer id) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13421376717";// 测试专用
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				if (null != id) {
					healthDataService.updateAlivenessById(id);
					amsuVo.setRet("0");
					amsuVo.setErrDesc("删除成功");
				} else {
					amsuVo.setRet("-20001");
					amsuVo.setErrDesc("id为null");
				}
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("用户id不存在");
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		return amsuVo;
	}

	/**
	 * 查询一周统计数据
	 * 
	 * @param request
	 * @param year
	 * @param week
	 * @return
	 */
	@RequestMapping(value = "/downloadWeekReport", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo downloadWeekReport(HttpServletRequest request, String year, String week) {
		AmsuVo amsuVo = new AmsuVo();
		try {
			if (JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid") == null) {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("请先登录!");
				return amsuVo;
			}
			String phone = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
			// String phone = "13522731203";// 测试专用
			// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			List<Userinfo> list = userinfoService.selectByExample(example);
			if (list != null && list.size() > 0) {
				HealthDataQueryVo queryVo = new HealthDataQueryVo();
				queryVo.setUserid(list.get(0).getId());
				queryVo.setYear(year);
				queryVo.setWeek(week);
				queryVo.setAliveness(1);
				int chubeijiankang = healthDataService.selectSportTimesByWeek(queryVo);
				List<ZaoboLouboTimes> zaoboloubo = healthDataService.selectZaoBoLouBoTimesByWeek(queryVo);
				List<Integer> guosuguohuan = healthDataService.selectAHRByWeek(queryVo);
				List<Integer> kangpilaozhishu = healthDataService.selectFIByWeek(queryVo);
				List<Integer> huifuxinlv = healthDataService.selectRAByWeek(queryVo);
				List<HealthdataWithBLOBs> list2 = healthDataService.selectHealthDatasByWeek(queryVo);
				Map<String, Object> resultMap = new HashMap<String, Object>();
				resultMap.put("chubeijiankang", chubeijiankang);
				resultMap.put("zaoboloubo", zaoboloubo);
				resultMap.put("guosuguohuan", guosuguohuan);
				resultMap.put("kangpilaozhishu", kangpilaozhishu);
				resultMap.put("huifuxinlv", huifuxinlv);
				resultMap.put("list", list2);
				amsuVo.setRet("0");
				amsuVo.setErrDesc(resultMap);
			}
		} catch (Exception e) {
			e.printStackTrace();
			String message = e.getMessage();
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc(message);
			return amsuVo;
		}
		return amsuVo;
	}

	/**
	 * 获取数据(给美国)
	 * 
	 * @param request
	 */
	@RequestMapping(value = "/getAmericaDatas", method = { RequestMethod.POST })
	public void getAmericaDatas(HttpServletRequest request) {
		List<HealthdataWithBLOBs> list = healthDataService.selectDatasToAmerica();
		for (HealthdataWithBLOBs healthdataWithBLOBs : list) {
			String path = request.getSession().getServletContext().getRealPath("/AmericaData");
			System.out.println(path);
			File files = new File(path);
			if (!files.exists()) {
				files.mkdirs();
			}
			String filename = healthdataWithBLOBs.getUserid() + "-" + UUID.randomUUID().toString();
			String file = healthdataWithBLOBs.getEc();
			if (file.length() > 100) {
				TranscodingUtils.base64ToFile(file, path + "/" + filename);
			}
		}
	}
}
