package com.valtech.training.corejava.day3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.*;

public class IOExample {
	
	public void writeCharsToFile(String fileName, String data) throws Exception {
		File file = new File(fileName);
		Writer out = new FileWriter(file);
		out.write(data);
		out.close();
	}
	
	public String readCharsFromFile(String fileName) throws Exception {
		char[] buffer = new char[4]; //16K or 32K buffer size is ideal
		File file = new File(fileName);
		Reader in = new FileReader(file);
		int i = -1;
		StringBuffer result = new StringBuffer();
		while ((i = in.read(buffer))!=-1) {
			result.append(buffer,0,i);
		}
		in.close();
		return result.toString();
	}
	
	public String readFromFile(String filename) throws Exception {
		byte [] buffer = new byte[4]; //16K or 32K buffer size is ideal
		File file = new File(filename);
		InputStream is = new FileInputStream(file);
		int i = -1;
		StringBuffer sb = new StringBuffer();
		while ((i = is.read(buffer))!=-1) {
			System.out.println("Size of Read = " + i);
			sb.append(buffer);
		}
		is.close();
		return sb.toString();
	}
	
	public void writeToFile(String filename, String contents) throws Exception {
		byte[] data = contents.getBytes();
		File file = new File (filename);
		OutputStream os = new FileOutputStream(file);
		os.write(data);
		os.close(); // Always should be written in finally
	}
	
	public static void main(String[] args) throws Exception {
        IOExample ex = new IOExample();
        ex.writeToFile("hello.txt", "Hello World");
        System.out.println(ex.readFromFile("hello.txt"));
        ex.writeCharsToFile("hello.txt", "Hello How are You");
        System.out.println(ex.readCharsFromFile("hello.txt"));
    }
}
