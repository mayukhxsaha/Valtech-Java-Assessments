package com.valtech.training.corejava.day1;

public class Dog implements Animal {
	
	@Override
	public void makeSound() 
	{
		System.out.println("Bark");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a=new Dog();
		a.makeSound();
	}

}
