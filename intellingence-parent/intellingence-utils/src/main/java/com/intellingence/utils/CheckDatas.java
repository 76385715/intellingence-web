package com.intellingence.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.intellingence.entry.AmsuVo;
/**
 * 检验传入手机号码和Email是否合法的方法
 * @author 梦里不知身是客
 *
 */
public class CheckDatas {

	public static boolean checkMobileNO(String mobiles) {

		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");

		Matcher m = p.matcher(mobiles);

		System.out.println(m.matches() + "---");

		return m.matches();

	}

	public static boolean checkEmaile(String email) {
		String RULE_EMAIL = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
		// 正则表达式的模式
		Pattern p = Pattern.compile(RULE_EMAIL);
		// 正则表达式的匹配器
		Matcher m = p.matcher(email);
		// 进行正则匹配
		return m.matches();
	}
//	public static void main(String[] args) {
//		String mail = "76385715@123.com";
//		boolean checkEmaile = checkEmaile(mail);
//		System.out.println(checkEmaile);
//	}
	/**
	 * 校验参数是否为""
	 * @param strs
	 * @return
	 */
	public static boolean checkStringDatas(String... strs){
		for (String str : strs) {
			if(str==null || str.equals("")){
				return true;
			}
		}
		return false;
	}
}
