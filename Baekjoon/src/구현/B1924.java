package 구현;

import java.util.Scanner;

public class B1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		for(int i=0;i<month-1;i++) {
			day += months[i];
		}
		
		switch(day%7) {
		case 1: System.out.println("MON"); break;
		case 2: System.out.println("TUE"); break;
		case 3: System.out.println("WED"); break;
		case 4: System.out.println("THU"); break;
		case 5: System.out.println("FRI"); break;
		case 6: System.out.println("SAT"); break;
		case 0: System.out.println("SUN"); break;
		}

	}

}
