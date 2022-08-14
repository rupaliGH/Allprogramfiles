package collection;

import java.util.Vector;

public class Vector2 {

	public static void main(String[] args)
	{
	  Vector<Character> vc=new Vector();
	  vc.add('A');
	  vc.add('B');
	  vc.add('C');
	  vc.add('D');
	  vc.add('E');
	  vc.add('A');
	  vc.add('B');
	  vc.add('C');
	  vc.add('D');
	  vc.add('E');
	  vc.add('z');
	  System.out.println(vc);
	  System.out.println(vc.size());
	  System.out.println(vc.capacity());
	  System.out.println(vc.indexOf('D'));
	  System.out.println(vc.isEmpty());
	  System.out.println(vc.retainAll(vc));
	  System.out.println(vc);
	  
	  

	}

}
