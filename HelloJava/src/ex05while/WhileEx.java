package ex05while;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		/*
		 while(조건) {
		 	문장들;
		 }
		 while문은 정확히 몇번 반복해야 되는지 모를 때 사용
		 
		 flag 기법(switch 기법)
		 int sw = 0;
		 while(sw==0){
		 	문장들(STMT);
		 	sw=1;
		 }
		 
		 break; -> while 문 빠져나옴
		 continue; -> 다시 while문 처음으로 돌아감
		 
		 
		 Q) 점수를 입력받아 max값, 과목수, 평균 값을 출력하는 프로그램을 작성하시오
		 (단 과목수는 모름, 점수 입력시 -1이 들어오면 EOF(프로그램 종료)를 의미한다)
		 
		 점수 : 100
		 점수 : 78
		 점수 : 96
		 점수 : -1
		 최고점: 100
		 과목수 : 3
		 점수 평균 = 91.0
		 
		 */
	
		
		Scanner sc = new Scanner(System.in);
		int count = 0; //과목 수
		int sum = 0; //총점
		int max = 0; //최고점
		
//		while(true) {
//			
//			System.out.print("점수: ");
//			int num = sc.nextInt();
//			
//			if(num>max) max = num;
//			
//			if(num==-1) break;
//			count++; //누적스텝
//			sum += num;
//			
//		}
		
		int num = 0;
		
		while(num>=0) {
			
			System.out.print("점수: ");
			num = sc.nextInt();
			
			if(num>max) max = num;
			
			if(num>=0) {
				count++;
				sum += num;
			}
			
		}

		System.out.println("최고점: " + max);
		System.out.println("과목수: " + count);
		System.out.printf("점수 평균: %.2f", (double)sum/count);
		
	}

}
