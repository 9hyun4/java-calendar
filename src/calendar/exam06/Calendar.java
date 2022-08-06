package calendar.exam06;


public class Calendar {
	public final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxdayOfMonth(int month) {
		return (MAX_DAYS[month - 1]);
	}

	public void printMonth(int MAX_DAYS) {
		
		switch(MAX_DAYS){
			case 28:
				System.out.println(" 일 월  화 수  목 금 토");
				System.out.println("--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println();
				break;

			case 30:
				System.out.println(" 일 월  화 수  목 금 토");
				System.out.println("--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 ");
				System.out.println();
				break;

			default:
				System.out.println(" 일 월  화 수  목 금 토");
				System.out.println("--------------------");
				System.out.println(" 1  2  3  4  5  6  7");
				System.out.println(" 8  9 10 11 12 13 14");
				System.out.println("15 16 17 18 19 20 21");
				System.out.println("22 23 24 25 26 27 28");
				System.out.println("29 30 31 ");
				System.out.println();
		}
	}

}
