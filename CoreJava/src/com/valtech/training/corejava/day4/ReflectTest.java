package com.valtech.training.corejava.day4;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

import com.valtech.training.corejava.day1.Point;

public class ReflectTest {
	
	@Test
	public void test() throws Exception, IllegalAccessException {
		Point p = Point.class.newInstance();
		System.out.println(p);
		Method m = Point.class.getMethod("setX", int.class);
		m.invoke(p, 10);
		System.out.println(p);
	}

}
