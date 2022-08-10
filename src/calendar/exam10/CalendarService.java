package calendar.exam10;

import java.text.*;
import java.util.*;

public class CalendarService {
	Scanner scanner = new Scanner(System.in);
	private static Set<Schedule> s = new HashSet<Schedule>();
	
	public static Set<Schedule> getS() {
		return s;
	}

	public void addSchedule() {
		while(true) {
			System.out.println("날짜를 입력해주세요.(yyyyMMdd) exit:-1");
			System.out.print(">");
			Schedule schedule = new Schedule();
			String date = scanner.nextLine();
			if(date.equals("-1")) return;
			if(schedule.setDate(date)) {
				Iterator<Schedule> i = s.iterator();
				
				while(true) {
					if(i.hasNext()) {
						Schedule oldSchedule = i.next();
						if(oldSchedule.equals(schedule)) {
							oldSchedule.addContent();
							break;
						}	
					} else {
						schedule.addContent();
						s.add(schedule);
						break;
					}
				}
			} else {
				System.out.println("날짜를 정확히 입력해주세요.(yyyyMMdd)");
				continue;
			}
			
			System.out.println();
			System.out.println("일정을 추가 등록하시겠습니까?(y/n)");
			String str = scanner.nextLine();
			if(str.equals("y")) {
				System.out.println();
				continue;
			}
			System.out.println(); 
			return;
		}
	}
	
	public void search() {
		while(true) {
			System.out.println("날짜를 입력해주세요.(yyyyMMdd) exit:-1");
			System.out.print(">");
			
			String date = scanner.nextLine();
			if(date.equals("-1")) return;
			
			Schedule getItem = new Schedule();
			getItem.setDate(date);
			
			Iterator<Schedule> i = s.iterator();
			while(true) {
				if(i.hasNext()==true) {
					Schedule schedule = i.next();
					if(schedule.equals(getItem)) {
						schedule.printContent();
						break;
					}
				} else {
					System.out.println("입력한 날짜에 일정이 검색되지않습니다.");
					break;
				}
			}
				System.out.println();
				System.out.println("일정을 추가 검색하시겠습니까?(y/n)");
				String str = scanner.nextLine();
				if(str.equals("y"))	{
					System.out.println();
					continue;
				}
				System.out.println();
				return;
		}
	}
	
	public void removeSchedule() {
		while(true) {
			System.out.println("날짜를 입력해주세요.(yyyyMMdd) exit:-1");
			System.out.print(">");
			
			String date = scanner.nextLine();
			if(date.equals("-1")) return;
			
			Schedule getItem = new Schedule();
			getItem.setDate(date);
			
			Iterator<Schedule> i = s.iterator();
			
			A:while(true) {
				if(i.hasNext()==true) {
					Schedule schedule = i.next();
					if(schedule.equals(getItem)) {
						while(true) {
							System.out.println("삭제할 일정의 번호를 입력해주세요.");
							System.out.print(">");
							String str = scanner.nextLine();
							if(str.equals("")) {
								System.out.println("번호 미입력");
								continue;
							}
							int num = Integer.parseInt(str);
							if(num<1 || num>schedule.sizeSchedule()) {
								System.out.println("입력 범위 초과(1~" + schedule.sizeSchedule() + ")");
								continue;
							}
							schedule.removeContent(num);
							System.out.println("삭제 완료");
							break A;	
						}
					}
				} else {
					System.out.println("입력한 날짜에 삭제할 수 있는 일정이 검색되지않습니다.");
					break;
				}
			}
				System.out.println();
				System.out.println("일정을 추가 삭제하시겠습니까?(y/n)");
				String str = scanner.nextLine();
				if(str.equals("y")) {
					System.out.println();
					continue;
				}
				System.out.println();
				return;
		}
	}
	
	public void viewCalendar() {
		CalendarObject co = new CalendarObject();
		co.runPrompt();
	}
	
	public void help() {
		System.out.println("+-------------+");
		System.out.println("[1]일정 등록");
		System.out.println("[2]일정 검색");
		System.out.println("[3]일정 삭제");
		System.out.println("[4]달력 보기");
		System.out.println("[h]도움말");
		System.out.println("[q]종료");
		System.out.println("+-------------+");
	}
	
	public void run() {
		String value;
		help();
		while(true) {
			System.out.println("명령(1, 2, 3, 4, h, q)");
			System.out.print("> ");
			value = scanner.nextLine();
			
			switch (value) {
				case "1": {
					addSchedule();
					break;
				}
				case "2": {
					search();
					break;
				}
				case "3": {
					removeSchedule();
					break;
				}
				case "4": {
					viewCalendar();
					break;
				}
				case "h": {
					help();
					break;
				}
				case "q": {
					System.out.println("Have a nice day!");
					scanner.close();
					return;
				}
				default: {
					System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) throws ParseException {
		CalendarService cs = new CalendarService();
		cs.run();

	}
}
		

