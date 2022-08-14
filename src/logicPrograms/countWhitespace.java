package logicPrograms;

public class countWhitespace
{

	public static void main(String[] args) 
	{
      String s="Ru pa l";
      int counter=0;
     
	for(int i=0;i<=s.length()-1;i++)
    	  
	{
		char blank = s.charAt(i);
		//if(blank='')
		{
			counter++;
		}
	}
	System.out.println("no of blank spaces in " +s +counter);

	}

}
