package com;

import java.util.*;

public class mainClass {
	int num1,num2;
	void input()
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter two numbers:");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
	}
	int sum()
	{
		int sum = num1 + num2;
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mainClass  m = new mainClass();
		m.input();
		System.out.print("Sum is "+m.sum());
		

	}

}