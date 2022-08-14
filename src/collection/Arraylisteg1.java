package collection;

import java.util.ArrayList;

public class Arraylisteg1 {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("velocity");
		al.add(199);
		al.add(100.11);
		al.add(null);
		al.add("velocity");
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.indexOf(null));
		System.out.println(al.lastIndexOf("velocity"));
        System.out.println(al.contains("velocity"));
        System.out.println(al.remove(4));
        System.out.println(al);
        al.add("Pune");
        System.out.println(al);
        System.out.println(al.remove(null));
        System.out.println(al);
        System.out.println("+==============================================");
        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));
        System.out.println(al.get(3));
        System.out.println("+==============================================");
       for(int i=0;i<=3;i++)
       {
    	   System.out.println(al.get(i));
       }
       System.out.println("===============================================");
       
       for(int i=0;i<=al.size()-1;i++)
       {
    	   System.out.println(al.get(i));
       }
       
	}
	

}
