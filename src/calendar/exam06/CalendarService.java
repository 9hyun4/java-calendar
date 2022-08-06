package calendar.exam06;

import java.util.*;

//요구사항
//월을 입력하면 해당월의 달력을 출력한다.
//달력은 모양은 1단계에서 작성한 모양으로 만든다.
//1일은 일요일로 정해도 무방하다.
//-1을 입력받기 전까지 반복 입력받는다.
//프롬프트를 출력한다.

public class CalendarService {
	private final static String PROMPT = "cal> ";
	
	public void runPrompt() {
		Calendar cal = new Calendar();
		Scanner scanner = new Scanner(System.in);
		int Month = 0;
		
		while(true) {
			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			String str = scanner.nextLine();
			if(str.equals("")) {
				System.out.println("값을 입력해주세요.\n");
				continue;
			}
			Month = Integer.parseInt(str);
			if(Month == -1) {
				break;
			} else if (Month<1 || Month>12) {
					System.out.println("The value entered is a month that does not exist.\n");
					continue;
			}
			int MAX_DAYS = cal.getMaxdayOfMonth(Month);
			cal.printMonth(MAX_DAYS);
		}
		System.out.println("Have a nice day!");
		scanner.close();

		
	}

	public static void main(String[] args) {
		CalendarService cs = new CalendarService();
		cs.runPrompt();
	}
}
		

