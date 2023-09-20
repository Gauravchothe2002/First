package com;

package com;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(int i = 0;i<n;i++)
		{
			for(int j = 0;j<=i;j++)
			{
				for(int k=1;k<=n-j;k++)
				{
					System.out.print("\t");
				}
				System.out.print(j+1);
			}
			System.out.print("\n");
		}
		

	}

}

