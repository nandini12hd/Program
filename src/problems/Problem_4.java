package problems;

import java.util.Scanner;

public class Problem_4 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" values");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=1; i<=9;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]%i==0)
				{
					count++;
				}
			}
			System.out.println(i+":"+count);
		}
	}

}
