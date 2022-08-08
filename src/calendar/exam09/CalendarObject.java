package calendar.exam09;

import java.util.*;

public class CalendarObject {
	
	public void printCalendar(int year, int month) {
		System.out.printf("    <<%d년%2d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("----------------------");
		/*
		 * @param week 요일명
		 * @return 0 ~ 6 (0 = Sunday, 6 = Saturday)
		 * 
		 */
		
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(year, month-1, 1);
		
		int lastDayOfMonth = date.getActualMaximum(Calendar.DATE);
		int dayOfMontn = date.get(Calendar.DAY_OF_WEEK);
		
		for (int i=0; i<dayOfMontn-1; i++) {
			System.out.print("   ");
		}
		
		int count = dayOfMontn-1;
		for(int i=0; i<lastDayOfMonth; i++) {
			System.out.printf("%3d", i+1);
			count++;
			if(count%7==0) {
				System.out.println();
			}
		}
		System.out.println("\n");
	}
	
	public void runPrompt() {
		Scanner scanner = new Scanner(System.in);
		int month;
		int year;
		
		while(true) {
			//year변수 버그 체크
			System.out.println("연도를 입력하세요.(exit: -1)");
			System.out.print("YEAR: ");
			String strYear = scanner.nextLine();
			if (strYear.equals("")) {
				System.out.println("The value entered is a year that does not exist.\n");
				continue;
			} else {
				year = Integer.parseInt(strYear);
				if (year == -1) {
					break;
				} 
			}
			
			//month변수 버그체크
			System.out.println("월을 입력하세요.(exit: -1)");
			System.out.print("MONTH: ");
			String strMonth = scanner.nextLine();
			if (strMonth.equals("")) {
				System.out.println("The value entered is a month that does not exist.\n");
				continue;
			} else {
				month = Integer.parseInt(strMonth);
				if (month == -1) {
					break;
				} else if (month < 1 || month > 12) {
					System.out.println("The value entered is a month that does not exist.\n");
					continue;
				}
			}
			printCalendar(year, month);
		}
		
		System.out.println("Have a nice day!");
		scanner.close();
		
	}
}
		



