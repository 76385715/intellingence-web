package com.intellingence.controller;

import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.intellingence.entry.AmsuVo;
import com.intellingence.entry.VerificationStatus;
import com.intellingence.pojo.Userinfo;
import com.intellingence.pojo.UserinfoQuery;
import com.intellingence.pojo.UserinfoQuery.Criteria;
import com.intellingence.service.UserinfoService;
import com.intellingence.utils.VerificationCodeUtils;

@Controller
public class LoginController {
	@Autowired
	private UserinfoService userinfoService;

	/**
	 * 登录方法
	 * 
	 * @param zone
	 *            区号
	 * @param phone
	 *            手机号
	 * @param code
	 *            验证码
	 * @param mobtype
	 *            手机类型 默认是1 1是Android 2是IOS
	 * @return
	 */
	@RequestMapping(value = "/phoneVerify", method = { RequestMethod.POST })
	@ResponseBody
	public AmsuVo phoneVerify(String zone, String phone, String code, @RequestParam(defaultValue = "1") String mobtype,
			HttpServletResponse response, HttpServletRequest request) {
		// 根据mobtype的不同选择不同的appkey
		// http://localhost:8080/intellingence-web/phoneVerify.jsp?zone=86&phone=18689463192&code=4901&mobtype=1
		String appkey = "1976143c3c888";
		if (mobtype.equals("2")) {
			appkey = "197c11b2297fd";
		}
		// 调用短信验证接口工具类进行短信验证
		String result = VerificationCodeUtils.requestData("https://webapi.sms.mob.com/sms/verify",
				"appkey=" + appkey + "&phone=" + phone + "&zone=" + zone + "&&code=" + code);
		VerificationStatus verificationStatus = JSON.parseObject(result, VerificationStatus.class);
		// VerificationStatus verificationStatus = new
		// VerificationStatus();//测试专用
		// verificationStatus.setStatus(200);//测试专用
		// 创建要返回的数据的对象
		AmsuVo am = new AmsuVo();
		if(null==verificationStatus){
			am.setRet("400");
			am.setErrDesc("无效请求");
			return am;
		}
		if (verificationStatus.getStatus() == 400) {
			am.setRet("400");
			am.setErrDesc("无效请求");
		} else if (verificationStatus.getStatus() == 457) {
			am.setRet("457");
			am.setErrDesc("手机号码格式错误");
		} else if (verificationStatus.getStatus() == 468) {
			am.setRet("468");
			am.setErrDesc("验证码错误");
		} else if (verificationStatus.getStatus() == 200) {
			// 说明成功
			UserinfoQuery example = new UserinfoQuery();
			Criteria criteria = example.createCriteria();
			criteria.andUseridEqualTo(phone);
			List<Userinfo> list = userinfoService.selectByExample(example);
			// 如果数据库中有该号码,说明该号码的信息已经填写完毕
			if (list != null && list.size() >0) {
				Userinfo userinfo = list.get(0);
				// 设置cookie用来保持登录
				Cookie cookie1 = new Cookie("uid", userinfo.getUserid());
				Cookie cookie2 = new Cookie("id", userinfo.getId() + "");
				/*
				 * // 下面两个属性肯能用不到 Cookie cookie3 = new Cookie("token",
				 * userinfo.getToken()+""); Cookie cookie4 = new
				 * Cookie("userParam", qRCodeVo.getUserParam());
				 */
				// 持久化cookie
				cookie1.setMaxAge(Integer.MAX_VALUE);
				cookie2.setMaxAge(Integer.MAX_VALUE);
				/*
				 * cookie3.setMaxAge(Integer.MAX_VALUE);
				 * cookie4.setMaxAge(Integer.MAX_VALUE);
				 */
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				/*
				 * response.addCookie(cookie3); response.addCookie(cookie4);
				 */

				// 持久化cookie

				cookie1.setMaxAge(Integer.MAX_VALUE);
				cookie2.setMaxAge(Integer.MAX_VALUE);
				response.addCookie(cookie1);
				response.addCookie(cookie2);
				am.setRet("201");
				am.setErrDesc(userinfo);
			} else {
				// 如果数据库中没有该号码
				Userinfo userinfo = new Userinfo();
				userinfo.setUserid(phone);
				userinfoService.insertSelective(userinfo);

				// 设置cookie用来保持登录
				Cookie cookie1 = new Cookie("uid", userinfo.getUserid());
				Cookie cookie2 = new Cookie("id", userinfo.getId()+"");
				// 持久化cookie
				cookie1.setMaxAge(Integer.MAX_VALUE);
				cookie2.setMaxAge(Integer.MAX_VALUE);
				response.addCookie(cookie1);
				response.addCookie(cookie2);

				// 持久化cookie

				cookie1.setMaxAge(Integer.MAX_VALUE);
				cookie2.setMaxAge(Integer.MAX_VALUE);

				response.addCookie(cookie1);
				response.addCookie(cookie2);

				am.setRet("200");
				am.setErrDesc("验证成功");
			}

		} else {
			am.setRet("444");
			am.setErrDesc("验证失败");
		}
		return am;
	}
}