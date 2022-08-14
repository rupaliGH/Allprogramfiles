package logicPrograms;

import java.util.Scanner;

public class userinput 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
		int no1=sc.nextInt();
		System.out.println("enter 2st no");
		int no2=sc.nextInt();
		int sum=no1+no2;
		System.out.println("sum is"+sum);
		
		System.out.println("please enter name");
		String name=sc.next();
		System.out.println(name);

	}

}
