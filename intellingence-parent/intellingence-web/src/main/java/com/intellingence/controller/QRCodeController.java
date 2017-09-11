package com.intellingence.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.google.zxing.WriterException;
import com.intellingence.entry.AmsuVo;
import com.intellingence.entry.QRCodeVo;
import com.intellingence.utils.JudgeCookieUtils;
import com.intellingence.utils.QRUtils;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
 
@Controller
public class QRCodeController {
	@Autowired
	private JedisPool jedisPool;
	 
	@Value("${QRCOED_FILE_SAVE_PATH}")
	private String QRCOED_FILE_SAVE_PATH;
	
	/**
	 * 获得二维码图片
	 * @param request
	 * @param model
	 * @return
	 * @throws WriterException
	 * @throws IOException
	 */
	@RequestMapping(value = "/getQRCode")
	@ResponseBody
	public List<String> getQRCode(HttpServletRequest request) throws WriterException, IOException {
		String path = request.getSession().getServletContext().getRealPath("/QRCode");
		String filePath = path + "/";
		// 上传图片
		File files = new File(path);
//		System.out.println(path);
		// 如果该路径不存在就创建一个  
		if (!files.exists()) {
			files.mkdirs(); 
		} 
		String qRCodeName = UUID.randomUUID().toString() + ".png";
		String url = "http://119.29.201.120:8081/intellingence-web/getOnlyPassToken.do";
//		String url = "http://192.168.0.106:8080/intellingence-web/getOnlyPassToken.do";
		String key = UUID.randomUUID().toString();
		QRUtils.testEncode(filePath, qRCodeName, url, key);
		//将其存入缓存中
		Jedis jedis = jedisPool.getResource();
		jedis.set(key, "0");
		//设置过期时间2分钟
		jedis.expire(key, 120);
		jedis.close();
		List<String> list = new ArrayList<String>();
		list.add(QRCOED_FILE_SAVE_PATH+qRCodeName);
		list.add(key);
		return list;
	}
	
	/**
	 * 手机扫码请求的唯一标识(用来将手表和手机一一对应)
	 * @param request
	 * @param passToken
	 * @return
	 */
	@RequestMapping(value = "/getOnlyPassToken")
	@ResponseBody
	public AmsuVo getOnlyToken(HttpServletRequest request,String passToken){
		AmsuVo amsuVo = new AmsuVo();
		String ci_session = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "ci_session");
		String uid = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "uid");
//		uid="13923475272";
		String id = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "id");
//		id="35";
		String token = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "token");
		String userParam = JudgeCookieUtils.JudgeCookieContainsInneed4KuLang(request, "userParam");
		if(uid==null||id==null){
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("登陆失败");
			return amsuVo;
		}
		QRCodeVo qRCodeVo = new QRCodeVo(uid, id, token, userParam,ci_session);
		String jsonString = JSON.toJSONString(qRCodeVo);
		Jedis jedis = jedisPool.getResource();
//		System.out.println(jsonString);
		jedis.set(passToken, jsonString);
		jedis.close();
		amsuVo.setRet("0");
		amsuVo.setErrDesc("登陆成功");
		return amsuVo;
	}
	
	/**
	 * 手表轮询请求
	 * @param response
	 * @param request
	 * @param passToken
	 * @return
	 */
	@RequestMapping(value = "/lunxun")
	@ResponseBody
	public AmsuVo lunxun(HttpServletResponse response,HttpServletRequest request,String passToken){
		AmsuVo amsuVo = new AmsuVo();
		Jedis jedis = jedisPool.getResource();
		String jsonStr = jedis.get(passToken);
		if(null==jsonStr){
			amsuVo.setRet("-20001");
			amsuVo.setErrDesc("登陆失败");
			return amsuVo;
		}
		jedis.close();
		if(!jsonStr.equals("0")){
			QRCodeVo qRCodeVo = JSON.parseObject(jsonStr, QRCodeVo.class);
			//设置cookie用来保持登录
			Cookie cookie1 = new Cookie("uid", qRCodeVo.getUid());
			Cookie cookie2 = new Cookie("id", qRCodeVo.getId());
			Cookie cookie5 = new Cookie("ci_session", qRCodeVo.getCi_session());
			//下面两个属性肯能用不到
			Cookie cookie3 = new Cookie("token", qRCodeVo.getToken());
			Cookie cookie4 = new Cookie("userParam", qRCodeVo.getUserParam());
			//持久化cookie
			cookie1.setMaxAge(Integer.MAX_VALUE);
			cookie2.setMaxAge(Integer.MAX_VALUE);
			cookie3.setMaxAge(Integer.MAX_VALUE);
			cookie4.setMaxAge(Integer.MAX_VALUE);
			cookie5.setMaxAge(Integer.MAX_VALUE);
			response.addCookie(cookie1);
			response.addCookie(cookie2);
			response.addCookie(cookie3);
			response.addCookie(cookie4);
			response.addCookie(cookie5);
			amsuVo.setRet("0");
			amsuVo.setErrDesc("登陆成功");
			return amsuVo;
		}
		amsuVo.setRet("-20001");
		amsuVo.setErrDesc("登陆失败");
		return amsuVo;
	}
}
