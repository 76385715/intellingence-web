package com.intellingence.utils;
/**
 * 用于计算页数的方法(主要用于给定总数据数和每页显示的数据数量来得出总页数)
 * @author 梦里不知身是客
 *
 */
public class CalculatePagesUtils {
	public static int calculatePages(int rows,int totalCount){
		int pages = -1;
		if(totalCount%rows!=0){
			pages = totalCount/rows+1;
		}else{
			pages = totalCount/rows;
		}
		return pages;
	}
}
