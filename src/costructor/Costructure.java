package costructor;

public class Costructure 
  {
    int a;
    int b;
    int sum;
    
    public Costructure()
    {
    	a=40;
    	b=30;
    	System.out.println("constructor called");
    }
	
	public static void main(String[] args)
	{
		Costructure CO=new Costructure();
		CO.add();		
	}

	public void add()
	{
		sum=a+b;
		System.out.println("addition is :" +sum);
	}
}
