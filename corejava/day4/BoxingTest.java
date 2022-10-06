package com.valtech.training.corejava.day4;

import org.junit.Assert.*;
import org.junit.Test;

public class BoxingTest {
	
	@Test
	public void test() {
		Integer i = new Integer(5);
		Integer j = 5;
		int k = j.intValue();
		int l = j; 
	}
	
}
