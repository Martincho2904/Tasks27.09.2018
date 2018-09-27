package edu.school;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		int sum = 0;
		for(int i=0;i<array.length;i++) 
		{
			array[i]=input.nextInt();
			sum = sum + array[i];
			
		}
		float average = sum/n;
		float Min1 = array[0]-average;
		if(Min1<0) {Min1 = Min1 - Min1*2;}
		float Min2 = array[0]-average;
		if(Min2<0) {Min2 = Min2 - Min2*2;}
		int print = 0;
		for(int i=0;i<array.length;i++)
		{
			
			if(array[i]<average)
			{
				Min2 = average-array[i];
			}
			else 
			{
				Min2 = array[i]-average;
			}
			if(Min2<=Min1) {
				Min1 = Min2;
				print = array[i];
			}
		}
		System.out.println(print);
		
		
		
		
		
		
		
		
		
		
	}

}
