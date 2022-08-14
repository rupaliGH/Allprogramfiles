package thisusestudy;

public class B extends A
{
    int b=200;
 
	public static void main(String[] args)
	{
      B b=new B();
      b.display();
	}
	public void display()
	{
		int a=100;
		System.out.println("local value of  same class is " +a );
		System.out.println("global value from same class is " +this.b);
		System.out.println("global value from super class " +super.a);
	}

}
