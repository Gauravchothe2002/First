package com;
import java.util.Scanner;

class Discount
{
	double dis,netprice;
	int cost;
	double calculate(int t)
	{
		cost = t;
		if(cost<2000)
		{
			dis=t*(0.05);
			return dis;
		}
		else  if(cost>2000 && cost<5000)
		{
			dis=t*(0.25);
			return dis;
		}
		else  if(cost>5000 && cost<10000)
		{
			dis=t*(0.35);
			return dis;
		}
		else
		{
			dis=t*(0.50);
			return dis;
		}
	}
	void display()
	{
		System.out.println("The discount of product is "+dis);
		System.out.println("The netprice is "+(cost-dis));
	}
	
}
public class Items {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Discount d=new Discount();
		System.out.print("Enter the  cost");
		int t=sc.nextInt();
		d.calculate(t);
		d.display();
	}

}
