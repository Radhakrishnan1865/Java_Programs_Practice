package numbers;

public class WeekNumber {

	public static void main(String[] args) {
		// find week number using switch case condition
		
		String weekname= "friday";
		
		switch(weekname) {
		
		case "sunday": System.out.println(" day 1"); break;
		case "monday": System.out.println(" day 2"); break;
		case "tuesday": System.out.println(" day 3"); break;
		case "wendesday": System.out.println(" day 4"); break;
		case "thursday": System.out.println(" day 5"); break;
		case "friday": System.out.println(" day 6"); break;
		case "saturday": System.out.println(" day 7"); break;
		
		default : System.out.println(" Its not a week days");
		}

	}

}
