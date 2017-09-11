package com.intellingence.utils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;

/**
 * 用于判断cookie中是否有我想要的键值对  inneed代表的是key
 * @author 梦里不知身是客
 *
 */
public class JudgeCookieUtils {
	public static String JudgeCookieContainsInneed(HttpServletRequest request,String inneed){
		if(StringUtils.isBlank(inneed)){
			return null;
		}
		if(request==null){
			return null;
		}
		Cookie[] cookies = request.getCookies();
		if(cookies==null){
			return null;
		}else if(cookies.length<1){
			return null;
		}
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getValue());
			if(cookie.getName().equals("userid")){
				return cookie.getValue();
			}
		}
		return null;
	}
	
	
	public static String JudgeCookieContainsInneed4Shoepad(HttpServletRequest request,String inneed){
		if(StringUtils.isBlank(inneed)){
			return null;
		}
		if(request==null){
			return null;
		}
		Cookie[] cookies = request.getCookies();
		if(cookies==null){
			return null;
		}else if(cookies.length<1){
			return null;
		}
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals(inneed)){
				return cookie.getValue();
			}
		}
		return null;
	}
	public static String JudgeCookieContainsInneed4KuLang(HttpServletRequest request,String inneed){
		if(StringUtils.isBlank(inneed)){
			return null;
		}
		if(request==null){
			return null;
		}
		Cookie[] cookies = request.getCookies();
		if(cookies==null){
			return null;
		}else if(cookies.length<1){
			return null;
		}
		for (Cookie cookie : cookies) {
			if(cookie.getName().equals(inneed)){
				return cookie.getValue();
			}
		}
		return null;
	}
}
