package varibalestudy;

public class GlobalandLocal
{
  int a=10;
  static int b=20;
  
	public static void main(String[] args)
	{
      
	GlobalandLocal g=new GlobalandLocal();
	g.test();
	test1();
	System.out.println("the global value of a is"+g.a);
	System.out.println("global value of bis "+b);
	System.out.println("================================");
	int sum=100+g.a;
	int sub=50-b;
	System.out.println("sum is"+sum);
	System.out.println("sub is"+sub);
	}
	public void test()
	{
		int a=30;
		int sum=a+40;
		System.out.println("sum is :"+sum);
		System.out.println("================================");
	}
  public static void test1()
  {
	  int a=50;
	  int sub=a-20;
	  System.out.println("sub is"+sub);
	  System.out.println("================================");
	  
  }
}
