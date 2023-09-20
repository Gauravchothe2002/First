package com;

import java.util.Scanner;

class Stock
{
	private long  code;
	int qty;
	private double price,netprice,total,discount;
	
	Stock(long n,int q,double p)
	{
		code = n;
		qty=q;
		price = p;
	}
	
	public void compute()
	{
		total = price * qty;
		discount=total*(0.25);
		netprice=total-discount;	
	}
	
	void Display()
	{
		System.out.println("Product details: ");
		System.out.println("Code :\t"+code+"\nQuantity :"+qty+"\nPrice :\t"+price+"\nDiscount:"+discount+"\nNetPrice:"+netprice);
	}

}

public class TechStock {
	
	public static void main(String[] args) {
		long code;
		int qty;
		double price;
		
		System.out.println("Enter the product details: ");
		Scanner sc = new Scanner(System.in);
		code=sc.nextLong();
		qty = sc.nextInt();
		price = sc.nextDouble();
		
		Stock s1 = new Stock(code,qty,price);
		s1.compute();
		s1.Display();

	}

}

