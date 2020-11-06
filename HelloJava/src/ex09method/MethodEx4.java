package ex09method;

import java.util.Scanner;

public class MethodEx4 {

	public static void main(String[] args) {
		
		/*
		 키와 몸무게는 main()에서 입력
		 bmi 값과 비만들의 결과는 정의문에서 계산
		 최종 결과는 main()에서 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		int height = Integer.parseInt(sc.next());
		
		System.out.print("몸무게를 입력하시오: ");
		int weight = Integer.parseInt(sc.next());
		
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		
		System.out.println("당신은 " + printBmi(height, weight) + "입니다.");
	}
	
	public static String printBmi(int height, int weight) {
		double mHeight = height / 100.0;
		double bmi = weight / Math.pow(mHeight, 2);
		System.out.println("bmi: " + bmi);
		String result;
		if(bmi >= 30.0) result = "비만";
		else if(bmi >= 25.0) result = "과체중";
		else if(bmi >= 20.0) result = "정상";
		else result = "저체중";
		return result;
	}
}
