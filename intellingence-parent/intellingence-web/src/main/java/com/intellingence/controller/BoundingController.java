package com.intellingence.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.intellingence.entry.AmsuVo;
import com.intellingence.pojo.Devicebinging;
import com.intellingence.pojo.DevicebingingQuery;
import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import com.intellingence.pojo.UserinfoQuery.Criteria;
import com.intellingence.service.DevicebingingService;
import com.intellingence.service.UserinfoService;
import com.intellingence.utils.JudgeCookieUtils;

@Controller
public class BoundingController {
	@Autowired
	private UserinfoService userinfoService;
	@Autowired
	private DevicebingingService devicebingingService;

	/**
	 * 绑定设备
	 * 
	 * @param request
	 * @param deviceMAC
	 * @return
	 */
	@RequestMapping(value = "/bindingDevice", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo bindingDevice(HttpServletRequest request, String deviceMAC) {
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
		// String phone = "13522731203";//测试专用
		// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
		// criteria.andUseridEqualTo("13522731203");//测试
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 取出用户的userid
			String userid = list.get(0).getUserid();
			// 创建查询条件,查询指定deviceMAC是否已经被绑定
			DevicebingingQuery devicebingingQueryExample = new DevicebingingQuery();
			com.intellingence.pojo.DevicebingingQuery.Criteria createCriteria = devicebingingQueryExample
					.createCriteria();
			createCriteria.andDevicemacEqualTo(deviceMAC);
			List<Devicebinging> bingdingList = devicebingingService.selectByExample(devicebingingQueryExample);
			// 说明已经被绑定了
			if (bingdingList != null && list.size() > 0) {
				amsuVo.setRet("2");
				amsuVo.setErrDesc("该设备已经被绑定");
			} else {
				Devicebinging devicebinging = new Devicebinging();
				devicebinging.setUserid(Integer.parseInt(userid));
				devicebinging.setDevicemac(deviceMAC);
				devicebinging.setUpdatetime(new Date());
				devicebingingService.insertSelective(devicebinging);
				amsuVo.setRet("0");
				amsuVo.setErrDesc("绑定成功!");
			}
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
		}
		return amsuVo;
	}

	/**
	 * 获取绑定的编号
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/getBindingDeviceMac", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo getBindingDeviceMac(HttpServletRequest request) {
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
		// String phone = "13522731203";//测试专用
		// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
		// criteria.andUseridEqualTo("13522731203");//测试
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 取出用户的userid
			String userid = list.get(0).getUserid();
			// 创建查询条件,查询指定deviceMAC是否已经被绑定
			DevicebingingQuery devicebingingQueryExample = new DevicebingingQuery();
			com.intellingence.pojo.DevicebingingQuery.Criteria createCriteria = devicebingingQueryExample
					.createCriteria();
			createCriteria.andUseridEqualTo(Integer.parseInt(userid));
			List<Devicebinging> bingdingList = devicebingingService.selectByExample(devicebingingQueryExample);
			// 说明已经被绑定了
			if (bingdingList != null && list.size() > 0) {
				amsuVo.setRet("0");
				amsuVo.setErrDesc(bingdingList.get(0).getDevicemac());
			} else {
				amsuVo.setRet("-20001");
				amsuVo.setErrDesc("0");
			}
		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
		}
		return amsuVo;
	}

	/**
	 * 修改绑定
	 * 
	 * @param request
	 * @param deviceMAC
	 * @return
	 */
	@RequestMapping(value = "/updateDeviceMac", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo updateDeviceMac(HttpServletRequest request, String deviceMAC) {
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "userid");
		// String phone = "13522731203";//测试专用
		// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
		// criteria.andUseridEqualTo("13522731203");//测试
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 判断用户传上来的设备码是否已经被其他设备所绑定,如果是则不能绑定
			DevicebingingQuery devicebingingQueryExample1 = new DevicebingingQuery();
			com.intellingence.pojo.DevicebingingQuery.Criteria createCriteria2 = devicebingingQueryExample1
					.createCriteria();
			createCriteria2.andDevicemacEqualTo(deviceMAC);
			List<Devicebinging> list2 = devicebingingService.selectByExample(devicebingingQueryExample1);
			if (list2 != null && list2.size() > 0) {
				// 说明该设备码已经被绑定,因此不能再进行绑定
				amsuVo.setRet("-20005");
				amsuVo.setErrDesc("该设备已经被绑定!");
			} else {
				// 取出用户的userid
				String userid = list.get(0).getUserid();
				// 创建查询条件,查询指定deviceMAC是否已经被绑定
				DevicebingingQuery devicebingingQueryExample = new DevicebingingQuery();
				com.intellingence.pojo.DevicebingingQuery.Criteria createCriteria = devicebingingQueryExample
						.createCriteria();
				createCriteria.andUseridEqualTo(Integer.parseInt(userid));
				List<Devicebinging> bingdingList = devicebingingService.selectByExample(devicebingingQueryExample);
				// 说明已经被绑定了
				if (bingdingList != null && bingdingList.size() > 0) {
					Devicebinging devicebinging = bingdingList.get(0);
					devicebinging.setDevicemac(deviceMAC);
					devicebingingService.updateByPrimaryKeySelective(devicebinging);
					amsuVo.setRet("0");
					amsuVo.setErrDesc("修改成功!");
				} else {
					Devicebinging devicebinging = new Devicebinging();
					devicebinging.setUserid(Integer.parseInt(userid));
					devicebinging.setDevicemac(deviceMAC);
					devicebinging.setUpdatetime(new Date());
					devicebingingService.insertSelective(devicebinging);
					amsuVo.setRet("2");
					amsuVo.setErrDesc("绑定成功!");
				}
			}

		} else {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
		}
		return amsuVo;
	}

	/**
	 * 鞋垫绑定
	 * 
	 * @param request
	 * @param leftMac
	 * @param rightMac
	 * @return
	 */
	@RequestMapping(value = "/bangdingShoepadMac", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo bangdingShoepadMac(HttpServletRequest request, String leftMac, String rightMac) {
		AmsuVo amsuVo = new AmsuVo();
		if (JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid") == null) {
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("请先登录!");
			return amsuVo;
		}
		String phone = JudgeCookieUtils.JudgeCookieContainsInneed(request, "uid");
		// String phone = "13522731203";//测试专用
		// 从数据库中 查找对应的电话号码是否存在(用户是否存在)
		UserinfoQuery example = new UserinfoQuery();
		Criteria criteria = example.createCriteria();
		criteria.andUseridEqualTo(phone);
		// criteria.andUseridEqualTo("13522731203");//测试
		List<Userinfo> list = userinfoService.selectByExample(example);
		if (list != null && list.size() > 0) {
				
		}    
		return null;
	}
}
