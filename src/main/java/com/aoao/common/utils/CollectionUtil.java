package com.aoao.common.utils;

import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 判断集合是否有值
 * @author: Administrator
 * @date: 2020年3月26日 上午10:44:56
 */
public class CollectionUtil {

	public static boolean hasValue(Collection<?> collection){
		return collection==null ||collection.isEmpty();
	}
}
