package collection;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorstudy {

	public static void main(String[] args) 
	{
	 Vector v=new Vector();
	 v.add(199);
	 v.add("pune");
	 v.add("G");
	 v.add(123);
	 v.add(null);
	 v.add(null);
	 v.add(123.45);
	 System.out.println(v);
	 System.out.println(v.size());
	 v.add(0,"Velocity");
	 System.out.println(v);
	 System.out.println(v.contains("pune"));
	 System.out.println(v.remove(5));
	 System.out.println(v);
      System.out.println("enumerator=================================");
      Enumeration ele = v.elements();
      while(ele.hasMoreElements())
     {
    	  System.out.println(ele.hasMoreElements());
      }
	}

}
