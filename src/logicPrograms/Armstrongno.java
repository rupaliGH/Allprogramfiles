package logicPrograms;

public class Armstrongno
{

	public static void main(String[] args) 
	{
      int no=1232;
      int sum=0;
      for(int i=no;i>0;i=i/10)
      {
    	  int rem=i%10;
    	  sum=sum+(rem*rem*rem);
      }
      if(no==sum)
      {
    	  System.out.println("no is armstrong no");
      }
      else
      {
    	  System.out.println("no is not armstrong no");
      }
	}

}
