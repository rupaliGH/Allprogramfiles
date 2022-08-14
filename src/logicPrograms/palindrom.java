package logicPrograms;

import java.util.Scanner;

public class palindrom 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter string");
	       String s=sc.next();
	       String r="";
	       
	       for(int i=s.length()-1;i>=0;i--)
	       {
	    	   r=r+s.charAt(i);
	       }
	       System.out.println("Reverse string is" + r);
		
	       if(s.equals(r))
	       {
	    	   System.out.println("no is palindrom");
	       }
	       else
	       {
	    	   System.out.println("no is not palindrom");
	       }
	}

	

}
