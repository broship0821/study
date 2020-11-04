package ex02bmi;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		/*
		 bmi ==> 몸무게 / 미터키 의 제곱
		 		  70  /  (1.75^2)
		 		  
		 30 이상이면 비만
		 25~30 과체중
		 20~25 보통
		 20 미만 저체중
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하시오: ");
		int height = Integer.parseInt(sc.next());
		
		System.out.print("몸무게를 입력하시오: ");
		int weight = Integer.parseInt(sc.next());
		
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
		
		double mHeight = height / 100.0;
		
//		double bmi = weight / (mHeight*mHeight);
		double bmi = weight / Math.pow(mHeight, 2);		
		System.out.println("bmi: " + bmi);
		
		String result;
		if(bmi >= 30.0) result = "비만"; //System.out.println("당신은 비만입니다!");
		else if(bmi >= 25.0) result = "과체중";
		else if(bmi >= 20.0) result = "정상";
		else result = "저체중";
		
		System.out.println(result + "입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
