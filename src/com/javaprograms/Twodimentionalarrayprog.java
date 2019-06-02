package com.javaprograms;

public class Twodimentionalarrayprog {

	public static void main(String[] args) {
		
		int i[][]=new int[1][2];
		System.out.println(i.length);
		System.out.println(i[0].length);
		i[0][0]=2;
		i[0][1]=4;
		
		System.out.println(i[0][1]);
		
		for(int row=0;row<i.length;row++)
		{
			for(int col=0;col<i[0].length;col++)
			{
				System.out.println(i[row][col]);
			}
		}
		
		
		

	}

}
