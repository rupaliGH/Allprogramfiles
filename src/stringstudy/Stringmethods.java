package stringstudy;

public class Stringmethods 
{

	public static void main(String[] args) 
	{
     String s="Hello";  //without new keyword
     String s1=new String("Welcome");    //with new keyword
     System.out.println("length()use");
     
     System.out.println(s.length());
     System.out.println("#############################################");
     
     System.out.println(s1.length());
     System.out.println("#############################################");
     
     int mylength1=s.length();
     System.out.println(mylength1);
     System.out.println("#############################################");
     
     int mylength=s1.length();
     System.out.println(mylength);
     System.out.println("#############################################");
     
     System.out.println("touppercase()()use");
     String a="Automation";
     System.out.println(a);
     System.out.println("#############################################");
    System.out.println(a.toUpperCase());
     System.out.println("#############################################");
     
     System.out.println("tolowercase()()use");
     System.out.println(a.toLowerCase());
     System.out.println("#############################################");
     
     String b=a.toUpperCase();    
     System.out.println(b);
     System.out.println("#############################################");
     String b1=a.toLowerCase();
     System.out.println(b1);
     System.out.println("#############################################");
     
     System.out.println("equals() use ");
     String r0="Confident";
     String r1="Confident";
     String r2 =new String("Confident");
     String r3=new String("Confident");
     String r4=new String("Confident");
     System.out.println(r0.equals(r1));
     System.out.println(r1.equals(r2));
     System.out.println(r2.equals(r3));
     System.out.println(r3.equals(r4));
     System.out.println("#############################################");
     System.out.println("==() use ");
     System.out.println(r0==r1);
     System.out.println(r1==r2);
     System.out.println(r2==r3);
     System.out.println(r3==r4);
     System.out.println("#############################################");
     System.out.println("equalsIgnoreCase() use");
     System.out.println(r3.equalsIgnoreCase(r4));
     System.out.println("#############################################");
     System.out.println("contains() method use");
     String c="Classes";
     System.out.println(c.contains("asses"));
     System.out.println("#############################################");
     System.out.println("isEmpty() method use Returns true if, and only if, length() is 0.");
     String p0="Pune";
     String p1="    ";
     //String p2=null;
     String p3="";
     System.out.println(p0.isEmpty());
     System.out.println(p1.isEmpty());
    // System.out.println(p2.isEmpty()); 
     System.out.println(p3.isEmpty());
     System.out.println("#############################################");
     System.out.println("isEmpty() use");
     System.out.println(p0.isBlank());
     System.out.println(p1.isBlank());
     System.out.println(p3.isBlank());
     //System.out.println(p2.isBlank());
     System.out.println("#############################################");
     System.out.println("//charAt method use");
     String q="Rupali";
     System.out.println(q.charAt(0));
     System.out.println(q.charAt(5));
    // System.out.println(q.charAt(-1));
     System.out.println("#############################################");

     System.out.println("endsWith ()");
     String l="Tarade";
     System.out.println(l.endsWith("ade"));
     System.out.println(l.endsWith("ara"));
     System.out.println("#############################################");

    System.out.println("startsWith() use"); 
    String w="India";
    System.out.println(w.startsWith("Ind"));
    System.out.println(w.startsWith("dia"));
    System.out.println("#############################################");

     System.out.println("substring () use");
     String e="Maharashtra";
     System.out.println(e.substring(4));
     System.out.println(e.substring(1));
     
     
	}

}
