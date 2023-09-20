package com;

import java.util.*;
public class TestSum {
	int x,y,sum;
	void getSum()
	{
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		sum = x + y;
		System.out.print("Sum of two number"+sum);
	}
	public static void main(String args[])
	{
		TestSum t1 = new TestSum();
		t1.getSum();
		
	}

}
