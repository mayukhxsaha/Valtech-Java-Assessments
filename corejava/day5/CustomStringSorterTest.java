package com.valtech.training.corejava.day5;

import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;
import org.junit.Test;

public class CustomStringSorterTest{
    @Test
    public void testAlphabeticOrder() {
        String[] names= {"Abc","Pqr","Lmno","Too","Abz","z"};
        Arrays.sort(names,new CustomStringSorter());
        assertArrayEquals(new String[] {"z","Pqr","Abc","Abz","Too","Lmno"},names);
    }
    
    @Test
    public void testVowelLength() {
        String[] names= {"Abc","pqr","Lmno","Ab","z"};
        Arrays.sort(names,new CustomStringSorter());
        assertArrayEquals(new String[] {"z","Ab","Abc","Lmno"},names);
    }
    
    @Test
    public void testLength() {
        String[] names= {"Abc","pqr","Lmno","Ab","z"};
        Arrays.sort(names,new CustomStringSorter());
        assertArrayEquals(new String[] {"z","Ab","Abc","Lmno"},names);
}
}