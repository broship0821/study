package ex17pacman;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String pacman = "apple";
		StringBuilder mine = new StringBuilder("_____");
		int size = pacman.length();
		
		
		int j;
		for(j=1;j<=10;j++) {//10번 기회
			System.out.println(mine);
			
			System.out.println(j + "번째 시도");
			
			String s = "";
			while(s.length()!=1) {//2개 이상 들어오면 다시 입력
				System.out.print("예상 글자 입력: ");
				s = sc.next();
			}
			char c = s.charAt(0);
			Character.toLowerCase(c); //대문자 소문자 전환
			
			for(int i=0;i<size;i++) {
				if(pacman.charAt(i)==c) {
					mine.setCharAt(i, c);
				}
			}
			
			//다 맞췄는지 확인
			int check = 0;
			for(int i=0;i<size;i++) { 
				if(pacman.charAt(i)==mine.charAt(i))
					check++;
			}
			if(check==size) {
				System.out.println(mine);
				System.out.println("참 잘했어요");
				break;
			}
			
		}
		if(j==11) {
			System.out.println("도전 횟수 모두 소진");
		}
		
	}

}
