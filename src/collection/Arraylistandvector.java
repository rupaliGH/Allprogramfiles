package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylistandvector {
//made some changes
	public static void main(String[] args)
	{
	ArrayList al=new ArrayList();
	al.add("Velocity");
	al.add(199);
	al.add(122.20);
	al.add(null);
	al.add(null);
	al.add("Velocity");
	al.add(true);
	al.add('A');
	System.out.println(al);
	System.out.println(al.size());
	System.out.println(al.get(2));
	System.out.println(al.indexOf('A'));
	System.out.println(al.indexOf("Velocity"));
	System.out.println(al.lastIndexOf("Velocity"));
    System.out.println(al.contains(199));
    System.out.println(al.remove(3));
    System.out.println(al);
    al.add("Pune");
    System.out.println(al);
    System.out.println(al.remove(null));
    System.out.println(al);
    
    for(int i=0;i<=6;i++)
    {
    	System.out.println(al.get(i));
    }
    System.out.println("dynamic O/p==================================");
    for(int i=0;i<=al.size()-1;i++)
    {
    	System.out.println(al.get(i));
    }
    System.out.println("=================for each loop=================");
    for(Object m:al)
    {
    	System.out.println(m);
    }
    System.out.println("Iterator=============");
    Iterator it = al.iterator();
    
    while(it.hasNext())
    {
    	System.out.println(it.next());
    }
    System.out.println("list Iterator======================");
    ListIterator li = al.listIterator();
    
    while(li.hasNext())
    {
    	System.out.println(li.next());
    }
	}

}
