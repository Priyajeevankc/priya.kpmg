package EnumExample;

public class Test {

	public static void main(String[] args) {
		Day day =Day.THURSDAY;
		switch(day) {
		case MONDAY:
			System.out.println("Working Day");
			break;
		case TUESDAY:
			System.out.println("2ND Working Day");
			break;
		case WEDNESDAY:
			System.out.println("MID WEEK");
			break;
		case THURSDAY:
			System.out.println("CLOSER TO WEEKEND");
			break;
	   case FRIDAY:
				System.out.println("WEEKEND STARTS");
				break;
	   case SATURDAY:
			System.out.println("Yahoo Weekend Day");
			break;
	   case SUNDAY:
			System.out.println("Yahoo Weekend Day");
			break;
		}
	}

}
