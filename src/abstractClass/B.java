package abstractClass;

public class B extends A
{
public static void main (String args[])
{
	B b=new B();
	b.add();
	b.sub();
	b.multi();
	b.divi();
}

@Override
public void multi() {
	System.out.println(" The multi");
	
}

@Override
public void divi() {
	System.out.println(" The divi");
	
}
	

}
