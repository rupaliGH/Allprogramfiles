package stringpractice;

public class string6_11
{

	public static void main(String[] args) 
	{
		String r="rupali";
		System.out.println(r);
		
		String r1=new String();
		r1="velocity";
		System.out.println(r1);
		
		System.out.println("length");
		String s=new String();
	     s="Velocity";
	     System.out.println(s.length());
	     
	     System.out.println(s.toUpperCase()+" "+ s.toLowerCase());
	     System.out.println(s.toLowerCase());
	     
	    String p=new String();
	    String l=new String();
	    String u=new String();
	    
	 
	   String p0="  ";
	  
	    
	  System.out.println(p0.length());
	  
	int rupali=p0.length();
	  System.out.println(rupali);
		
	  r="rupali";
	  r1="";
	  System.out.println(r.equals(r1));
	  
	  System.out.println(r1.isEmpty());
	  
	  System.out.println(r.contains("Rup"));
	  
	  System.out.println(r.charAt(2));
	  
      System.out.println(r.indexOf('p'));
      
      System.out.println(r.endsWith("Ali"));
      System.out.println(r.startsWith("ali"));
      
      System.out.println("**************************************");
      
      String g="rupali ";
      String g1=" Tarade";
      System.out.println(g.concat(g1));
      System.out.println(g.concat("from Phaltan"));
      
      String t="testingclasses";
      String t1="Testingclasses";
      System.out.println(t.substring(0));
      System.out.println(t.substring(0, 7));
      System.out.println("aprilclass".substring(2, 5));
      
      System.out.println(t.equalsIgnoreCase(t1));
      System.out.println("************************************");
      String t2="Testingclasses";
      
     //System.out.println(t2.replace("Testing ","Automation"));
     System.out.println(t2.replace("Testing", " Automation"));
     
     System.out.println(t2.lastIndexOf('s'));
     System.out.println(t2.indexOf('s'));
     System.out.println(t2.indexOf('s',10));
     
	}

}
