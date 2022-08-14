package arraystudy;

public class Multiexamplestring {

	public static void main(String[] args) 
	{
		String name[][]=new String[3][3];
		name[0][0]="Tanmay";
		name[0][1]="Rupali";
		name[0][2]="Krishna";
		name[1][0]="Adhira";
		name[1][1]="Pihu";
		name[1][2]="Swara";
		name[2][0]="Akshay";
		name[2][1]="Chiu";
		name[2][2]="Soni";
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				System.out.print(name[i][j] + " ");
			}
				System.out.println();
		}


	}

}
