package arraystudy;

public class arraypractice1 
{

	public static void main(String[] args)
	{
		String name[][]= {{"1","Rupali","30","-","she is a Tester".toUpperCase()},
				          {"2","Tanmay","20","-","he is a chef".replace("chef", "student").toUpperCase()},
				          {"3","Krishna","16","-","he is a student".concat(" but also good in sports")},
				          {"4","Adhira","7","-","She is a student"},
				          {"5","Pihu","2","-","She is in junior KG"}};
		{
			for(int i=0;i<=name.length-1;i++)
		
		{
			for(int j=0;j<=name.length-1;j++)
				
			System.out.print(name[i][j]+" ");
			System.out.println();
		}
	}
	}
}
