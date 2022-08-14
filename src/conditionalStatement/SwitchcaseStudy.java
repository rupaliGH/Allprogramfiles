package conditionalStatement;

public class SwitchcaseStudy {

	public static void main(String[] args) {
		//if today is Monday --> this is 1st day of week
		//sunday--> this is 7th day of week
		
        String day;
        day="sunday";
        
        switch (day)
        
        {
		case "sunday":System.out.println("this day is sunday");
		break;
		case "monday" :	System.out.println("this day is monday");
		break;
		case "tuesday" :System.out.println("this day is tuesday");
		break;
		case "wenesday" :System.out.println("this day is wenesday");
		break;
		case "thusday" :System.out.println("this day is thusday");
		break;
		case "friday" :	System.out.println("this day is friday");
		break;
		case "saterday" :System.out.println("this day is saterday");
		break;
		
		default:System.out.println("please enter valid date:");
			break;
		}
        


	}

}
