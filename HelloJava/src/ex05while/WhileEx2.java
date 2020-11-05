package ex05while;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		int jum;
		int count = 0;
		int total = 0;
		int max;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수: "); //two-read 중 one-read
		jum = sc.nextInt();
		max = jum;
		
		while(jum != -1) { //eof 체크
			count++; //과목수
			
			total += jum; //평균을 구하기 위한 총점
			if(jum>max) //최고 점수
				max = jum;
			
			System.out.print("점수: "); //two-read 중 two-read
			jum = sc.nextInt();
			//똑같은걸 2번 입력받는다고 해서 two-read 방식
			//몇개를 받을지 모를때, 배열을 못쓰면 이 방법을 많이 씀
			//one-read 방식은 break 위치를 어디다 넣어야 할지 따져봐야됨
			//two-read 방식은 좀 더 자연스럽게 만들 수 있음
		}
		System.out.println("최고점: " + max);
		System.out.println("과목수: " + count);
		System.out.printf("점수 평균: %.2f", (double)total/count);
		
	}

}
