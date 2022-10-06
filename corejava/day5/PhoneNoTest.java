package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;



public class PhoneNoTest {



   @Test
    public void test() {
         PhoneNo p =new PhoneNo();
            long num1=9999999965L;
    
            assertEquals(80,p.order(num1));
            assertEquals(100,p.order(9999999999L));
            assertEquals(false,p.check(1234567890L));
            assertEquals(true,p.check(9876543210L));
            assertEquals(100,p.order(9876543210L));
            assertEquals(70,p.order(9999995394L));
            assertEquals(64,p.order(6363707229L));
            assertEquals(18,p.order(7676378569L));
            assertEquals(false,p.check(12457896L));
            assertEquals(false,p.check(123456789L));
            
    }



}
