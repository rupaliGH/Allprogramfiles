package logicPrograms;

public class reverseno {

	public static void main(String[] args) 
	{
      int number=45678;
      String s=Integer.toString(number);
      String r="";
      for(int i=s.length()-1;i>=0;i--)
      {
    	  r=r+s.charAt(i);
      }
      int revnumber=Integer.parseInt(r);
      System.out.println("original no is "+number);
      System.out.println("reverse no is " +revnumber);
	}
	

}
