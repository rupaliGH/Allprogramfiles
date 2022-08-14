package collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistandHashset
{

	public static void main(String[] args)
	{
      LinkedList li=new LinkedList();
      li.add("Pune");
      li.add('A');
      li.add(123);
      li.add(13.34);
      li.add(true);
      li.add(null);
      li.add(null);
      System.out.println(li);
      System.out.println(li.size());
      System.out.println(li.get(3));
      System.out.println(li.peek());
      System.out.println(li.peekFirst());
      System.out.println(li);
      System.out.println(li.peekLast());
      System.out.println(li);
      System.out.println(li.poll());
      System.out.println(li.pollLast());
      System.out.println(li);
      System.out.println("//for loop// for each// iterator// listIterator ");
      for(Object l:li)
      {
    	  System.out.println(l);
      }
      
      
    ListIterator<Comparable> LL = li.listIterator();
    while(LL.hasNext())
    {
    	System.out.println(LL.next());
    }
    		
	}

}
