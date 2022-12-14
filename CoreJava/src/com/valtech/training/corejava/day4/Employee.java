package com.valtech.training.corejava.day4;

public class Employee {
	
	private int id;
    private String name;
    private int age;
    private int gender;
    private float salary;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, int age, int gender, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
	}
	public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
}
