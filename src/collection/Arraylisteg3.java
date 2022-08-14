package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylisteg3 {

	public static void main(String[] args) 
	{
	 ArrayList<Integer> al=new ArrayList();
	 al.add(1);
	 al.add(4);
	 al.add(6);
	 al.add(8);
	 al.add(3);
	 al.add(9);
	 System.out.println(al);
	 System.out.println("for each============");
	 for(Integer i:al)	
	 {
		 System.out.println(i);
	 }
	 System.out.println("Iterator============");
	 Iterator<Integer> it = al.iterator();
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	 System.out.println("list Iterator============");
	 ListIterator<Integer> li = al.listIterator();
	 while(li.hasNext())
	 {
		 System.out.println(li.next());
	 }
	}
	

}
