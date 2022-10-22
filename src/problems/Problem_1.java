package problems;

import java.util.Scanner;

public class Problem_1 
{
	public static void main(String[] args) 
	{
		double result;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first num :");
		double a=sc.nextDouble();
		System.out.println("enter second num :");
		double b=sc.nextDouble();
		System.out.println("Choose an operator: +, -, * or /");
		String operator=sc.next();
		
		switch(operator)
		{
			case "+":
				result=a+b;
				System.out.println(a+" + "+b+" = "+result);
				break;
				
			case "-":
				result=a-b;
				System.out.println(a+" - "+b+" = "+result);
				break;
				
			case "*":
				result=a*b;
				System.out.println(a+" * "+b+" = "+result);
				break;
			
			case "/":
				result=a/b;
				System.out.println(a+" / "+b+" = "+result);
				break;
				
			default:System.out.println("Invalid operator!");
				break;
		}
		
	}

}
