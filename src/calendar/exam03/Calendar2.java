package calendar.exam03;

import java.util.*;

public class Calendar2 {
	public static void main(String[] args) {
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		int month;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("달을 입력하세요.: ");
		month = scanner.nextInt();
		
		int[] maxDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.printf("%d월은 %d일까지 있습니다.", month, maxDays[month-1]);

		 
		
	}
	
}
