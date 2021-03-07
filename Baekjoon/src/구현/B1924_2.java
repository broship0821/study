package 구현;

import java.util.Scanner;

public class B1924_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		for(int i=0;i<month-1;i++) {
			day += months[i];
		}
		//switch문 안쓰고 간결하게 출력 가능
		String[] dates = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		
		System.out.println(dates[day%7]);
	}
}
