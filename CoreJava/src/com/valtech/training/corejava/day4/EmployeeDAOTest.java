package com.valtech.training.corejava.day4;

import java.sql.Connection;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeDAOTest {
	
//	@Test
//	public void test() throws Exception {
//		EmployeeDAO dao = new EmployeeDAO();
////		Connection conn = dao.getConnection();
////		conn.close();
////		assertEquals(4, dao.count());
//		int count = dao.count();
//		dao.saveEmployee(new Employee(5,"Three",27,0,10000));
//		assertEquals(count+1, dao.count());
//	}
	
//	@Test
//	public void testSaveEmployee()throws Exception {
//		EmployeeDAO dao = new EmployeeDAO();
//		Employee e = dao.getEmployee(3);
//		assertEquals(3, e.getId());
//		assertEquals(34, e.getAge());
//	}
	
	@Test
	public void testUpdateEmployee()throws Exception{           //insertion test case
        EmployeeDAO dao=new  EmployeeDAO();
        dao.updateEmployee(new Employee(3,"new three",25,1,121212));
        Employee e=dao.getEmployee(3);
        assertEquals(e.getId(), 3);
        assertEquals(e.getName(), "new three");
        assertEquals(25,e.getAge());
        assertEquals(1, e.getGender());
        assertEquals(121212,e.getSalary(),0.00001);
	}
	
//	public void testGetEmployees()throws Exception {
//        EmployeeDAO dao=new EmployeeDAO();
//        assertEquals(dao.count(), dao.getEmployees().size());
//    }	
}
