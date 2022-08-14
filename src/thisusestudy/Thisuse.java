package thisusestudy;

public class Thisuse 
{
	int a=10;
	int b=20;
	static int c=30;

	public static void main(String[] args)
	{
		Thisuse t=new Thisuse();
		t.add();
		

	}
   public void add()
   {
	   int a=100;
	   int b=200;
	   int c=300;
	   System.out.println(a);
	   System.out.println(b);
	   System.out.println(c);
	   System.out.println(this.a);
	   System.out.println(this.b);
	   System.out.println(this.c);
	   
	  
	   
   }
}
