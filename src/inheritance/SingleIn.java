package inheritance;

public class SingleIn {

	public static void main(String[] args) {
		
		Mother M=new Mother();
		Daughter D=new Daughter();
		 
		 M.featues();
		 D.laptop();
		 Daughter.looks();
		 
		 Mother.looks();
		 Daughter.looks();
		 Daughter.mobile();
		 
		 //Variables
		 
		 int sum=M.a+D.b;
		 System.out.println("The sum is "+sum);
		 int sub=Mother.a1-Daughter.b1;
		 System.out.println("The sub is = "+sub);
				 

	}

}
