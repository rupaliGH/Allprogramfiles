package methodwithparameter;

public class StudentInfo {

	public static void main(String[] args)
	{
		StudentInfo SI=new StudentInfo();
		SI.info("rupali",29,'F',46.85F,15);
		SI.info("Rohan",27,'M',72.6f,28);
	    examdetais("Swapnil",30,'M',60.2f,10);
	    studentMarks.otherinfo("DBMS", 60, "C++", 70);
	    
	}

	public void info(String name,int age,char gender, float weight,int rollno)
	{
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("my name is : "+name);
		System.out.println("my age is : "+age);
		System.out.println("my gender is : "+gender);
		System.out.println("my weight is : "+weight);
		System.out.println("my rollno is : "+rollno);
		
	}
	public static void examdetais(String name,int age,char gender, float weight,int rollno)
	{
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("my name is : "+name);
		System.out.println("my age is : "+age);
		System.out.println("my gender is : "+gender);
		System.out.println("my weight is : "+weight);
		System.out.println("my rollno is : "+rollno);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
	}
	
	
}
