package variableTypes;

public class Globalandlocalvariables 

{

	int a=100;  //non static global variable
    static int b=200;  //static global variable
    
	public static void main(String[] args) 
	{
		Globalandlocalvariables GV=new Globalandlocalvariables();
		GV.test();  //non static method from same class
		test1();  //static method from same class
		System.out.println("global value of a is " +GV.a); //non static global variable from same class
		System.out.println("global value of b is " +b);
				
        int sum=100+GV.a;  //non static global variable from same class
        int sub=100-b;	
        System.out.println("value of sum is"+sum);
        System.out.println("value of sub is"+sub);
        
        sample s=new sample();
        System.out.println("value of non static variable from sample class is"+s.p);
        System.out.println("value of static variale from sample class is"+sample.q);
	}
 
	public void test()
	{
		a=2000;  //local variable
		int sum=a+1000;
		System.out.println("sum="+sum);
		
	}
	public static void test1()
	{
		int a=1000;
	     System.out.println("running static test1 method");
		
	}
	
}

