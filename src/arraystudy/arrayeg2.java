package arraystudy;

public class arrayeg2 {

	public static void main(String[] args)
	{
		char alpha[][]= {{'A','B','C','D'},
				         {'E','F','G','H'},
		                  {'I','J','K','L'},
				           {'M','N','O','P'}};
		
		for(int i=0;i<=3;i--)
		{
			for(int j=3;j>=i;j--)
				
			System.out.print(alpha[i][j]+ " ");
			
			System.out.println();
		}

	}

}
