package com.intellingence.utils;
/**
 * 根据月份来计算季度
 * @author 梦里不知身是客
 *
 */
public class QuarterUtils {
	//根据月份计算季度
	public static int getQuarter(int month){
		if(1<=month && month<=3){
			return 1;
		}else if(4<=month && month<=6){
			return 2;
		}else if(7<=month && month<=9){
			return 3;
		}else if(10<=month && month<=12){
			return 4;
		}else{
			return -1;
		}
	}
}
  