package com.aoao.common.utils;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test1() {
		for(int i=0;i<10000;i++){
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 130));
			p.setAbout(StringUtil.randomChineseString(140));
			System.out.println(p);
		}
	}

	
}
