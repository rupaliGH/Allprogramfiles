package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Hashseteg2 {

	public static void main(String[] args)
	{
     HashSet hs=new HashSet();
     hs.add("Pune");
     hs.add(true);
     hs.add(123);
     hs.add(null);
     hs.add(null);
     hs.add('A');
     System.out.println(hs);
     System.out.println(hs.size());
     for(Object w:hs)
     {
    	 System.out.println(w);
    	 
     }
    
     Iterator it = hs.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}
	

}
