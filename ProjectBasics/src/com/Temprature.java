package com;

import java.util.*;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		float f,c,cel,far;
		
		System.out.print("Enter temperature in Farenheit:");
		f=s.nextFloat();
		cel=((f-32)*5)/9;
		
		System.out.print("Enter temperature in Celsius:");
		c = s.nextFloat();
		far = ((9*c)/5)+32;
		
		System.out.println("\nFarenheit to Celsius is :"+cel);
		
		System.out.println("\nCelsius to Farenheit is :"+far);
		
		
		

	}

}
