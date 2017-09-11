package com.intellingence.utils;
/**
 * 用于判断参数种类
 * 如果传入的参数是FULL,HRrep,ECrep,HRRrep,HRVrep,HRlist中的一种,那么返回他们本身,否则返回null
 * @author 梦里不知身是客
 *
 */
public class CheckParameterUtils {
	//如果传入的参数是FULL,HRrep,ECrep,HRRrep,HRVrep,HRlist中的一种,那么返回他们本身,否则返回null
	public static String checkReportType(String reportType){
		if(reportType.equals("FULL")||reportType.equals("HRrep")||reportType.equals("ECrep")||reportType.equals("HRRrep")||reportType.equals("HRVrep")||reportType.equals("HRlist")){
			return reportType;
		}
		return null;
	}
}
