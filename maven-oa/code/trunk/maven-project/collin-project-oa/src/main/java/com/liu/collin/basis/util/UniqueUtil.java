package com.liu.collin.basis.util;

import java.util.Calendar;

/**
 * @desc 获取唯一标志工具类
 * @author Liuweian
 * @createTime 2017年12月27日 下午2:19:52
 * @version 1.0
 */
public class UniqueUtil {
	
	/**
	 * @desc 通过获得系统当前时间的毫米数，来获取唯一主键
	 * @author Liuweian
	 * @createTime 2017年12月27日 下午2:23:47
	 * @return long
	 */
	public static long getLongPrimaryKey() {
		Calendar calendar = Calendar.getInstance();
		return calendar.getTimeInMillis();
	}
	
	/**
	 * @desc 通过获得系统当前时间的毫米数，来获取唯一主键
	 * @author Liuweian
	 * @createTime 2017年12月27日 下午2:23:47
	 * @return String
	 */
	public static String getStringPrimaryKey() {
		Calendar calendar = Calendar.getInstance();
		return String.valueOf(calendar.getTimeInMillis());
	}
	
}
