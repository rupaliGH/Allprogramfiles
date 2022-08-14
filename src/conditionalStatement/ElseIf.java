package conditionalStatement;

public class ElseIf {

	public static void main(String[] args) {
		// if its summer then its very hot
		// if its rainy then its raining heavily 
		// if its winter then its very cold
		// invalid season
      String season;
      season="winter"; 
    	
      if (season=="summer")
      
       {
	     System.out.println("its very hot");	
	   } 
      else if(season=="rainy") 
        {
      System.out.println("its raining heavily");
	     }
      else if (season=="winter") 
      {
		System.out.println("its very cold");
	   }
	}

}
