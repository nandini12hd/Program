package problems;

import java.util.Scanner;

public class Problem_3 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number : ");
		int a=sc.nextInt();
		int temp=a;
		if(a%2==0)
		{
			temp--;
		}
		for(int i=1;i<=2*temp-1;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
