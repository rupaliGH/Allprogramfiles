
public class countnoofupperandlowerletter {

	public static void main(String[] args)
	{
    String s="Welcome to Automation Testing";
    int upper=0;
    int lower=0;
    for(int i=0;i<s.length();i++)
    {
    char ch=s.charAt(i);
    if(ch>=65 && ch<=90)
    {
    	upper++;
    }
    else
    {
    	lower++;
    }
    System.out.println("no of lower-"+lower);
    System.out.println("no of upper is-"+upper);
    }
	}

}
