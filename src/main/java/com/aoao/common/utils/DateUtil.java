package com.aoao.common.utils;

import java.util.Date;
/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author: Administrator
 * @date: 2020年3月27日 上午8:57:04
 */
public class DateUtil {

	//随机产生一个日期类
	public static Date randomDate(Date startDate,Date endDate){
		//从1970年到start的毫秒数
		long t1 = startDate.getTime();
		//从1970年到endDate的毫秒数
		long t2 = endDate.getTime();
		if(t2<t1){
			throw new RuntimeException("参数异常");
		}
		//随机产生一个在t1和t2之间的毫秒数
		long t=(long) ((Math.random()*(t2-t1+1))+t1);
		return new Date(t);

	}
}
