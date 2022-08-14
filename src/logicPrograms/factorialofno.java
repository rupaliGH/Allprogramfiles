package logicPrograms;

import java.util.Scanner;

public class factorialofno {

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("please enter no");
     int number = sc.nextInt();
     int fact=1;
     for(int i=number;i>=1;i--)
     {
    	 fact=fact*i;
     }
     System.out.println("factorial of " +number+ "is "+fact);
	}

}
