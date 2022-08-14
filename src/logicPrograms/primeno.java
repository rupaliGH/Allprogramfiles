package logicPrograms;

public class primeno {

	public static void main(String[] args)
	{
       int num=47;
       int counter=0;
       
       for(int i=2;i<num;i++)
       {
    	   if(num%i==0)
    	   {
    		   counter++;
    		   break;
    	   }
       }
       if(counter==1)
       {
    	   System.out.println("no is prime no");
       }
       else 
       {
		System.out.println("no is not prime no");
	   }
	}

}
