package com;

import java.util.Scanner;

public class MenuDriven {
	
	int countDigit(int no)
	{
		int cnt=0;
		while(no>0)
		{
		  int digit=no % 10;
		  cnt++;
		  no=no/10;
		}
		
		return cnt;
	}

	int Power(int no1,int no2)
	{
		int pow=1;
		for(int i=0;i<no2;i++)
		{
			pow*= no1;
		}
		return pow;
	}
	
	long Factorial(long num3)
	{
		long fact = 1;
		for(int i=1;i<=num3;i++)
		{
			fact*=i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		
		MenuDriven m1 = new MenuDriven();
		Scanner sc = new Scanner(System.in);
		int s = 1,num1,num2,ans;
		long num3=0;
		do
		{
			System.out.print("*****  Menu Driven Program ********  \n Choose following options \n 1.Count Digit \n 2.Power of given number \n 3.Factorial of number");
			int n=sc.nextInt();
			switch(n)
			{
				case 1:
					System.out.println("Enter a number: ");
					num1=sc.nextInt();
					ans=m1.countDigit(num1);
					System.out.println("Count of digit is:"+ans);
					break;
					
				case 2:
					System.out.println("Enter two numbers: ");
					num1=sc.nextInt();
					num2 = sc.nextInt();
					ans=m1.Power(num1,num2);
					System.out.println("Power of a number is :"+ans);
					break;
					
				case 3:
					System.out.println("Enter a number: ");
					num3=sc.nextLong();
					System.out.println("Factorial is:"+m1.Factorial(num3));
					break;
					
				default:
					System.out.println("Wrong choice,Better Luck next time :) ");
			}
			System.out.print("\nDo you wan to continue");
			s=sc.nextInt();
		}while(s==1);

	}

}
