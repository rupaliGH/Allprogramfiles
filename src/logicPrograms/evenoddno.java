package logicPrograms;

import java.util.Scanner;

public class evenoddno
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter no");
		
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.println("even no");
		}
		else
		{
			System.out.println("odd no");
		}

	}

}
