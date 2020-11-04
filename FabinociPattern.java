package com.jnit;

public class FabinociPattern {
	public static void main(String[] args) {
		int i,j,sum=0,x=-1,y=1;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				sum=x+y;
				x=y;
				y=sum;
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}

}
