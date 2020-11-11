package ex17pacman;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] answer = {"a", "p", "p", "l", "e"};
		String[] a = {"_", "_", "_", "_", "_"};
		
		
		int count = 0;
		boolean flag = true;
		String q;
		int max = 10;
		
		while(flag) {
			//도전 횟수 모두 소진시 탈락
			count++;
			if(count==max+1) {
				System.out.println("못 맞췄으!");
				break;
			}
			
			//______ 이거 출력
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			
			
			int x = 0;
			System.out.println();
			System.out.println(count + "번째 시도"); //1번 시도마다 ++됨
			System.out.print("예상글자입력: ");
			q = sc.next();
			//만약 맞췄으면 값 들어감
			for (int i = 0; i < answer.length; i++) {
				if(answer[i].equals(q)) {
					a[i] = q;
				}
			}
			
			//다 맞췄는지 확인
			for (int i = 0; i < a.length; i++) {
				
				if(a[i].equals(answer[i])) {
					x++;
//					System.out.println(x);
				}
				if(x==5) flag = false;
			}
			
			
			
		}
		if(count!=max+1) System.out.println("참 잘했어요!");
	}

}
