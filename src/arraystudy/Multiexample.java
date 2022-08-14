package arraystudy;

public class Multiexample
{

	public static void main(String[] args)
	{
		int no[][]=new int[3][3];
		no[0][0]=10;
		no[0][1]=20;
		no[0][2]=30;
		no[1][0]=40;
		no[1][1]=50;
		no[1][2]=60;
		no[2][0]=70;
		no[2][1]=80;
		no[2][2]=90;
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(no[i][j]+" ");
			}
				System.out.println();
		}

	}

}
