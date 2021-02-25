package 그리디;

import java.util.Scanner;

public class Ex06왕실의나이트2 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String input = sc.next();
	
	//현재 위치 좌표로 변환 c2 -> (2,3)
	int x = input.charAt(1)-'0';
	int y = input.charAt(0)-'a'+1;//영문자를 숫자로 바꾸는 방법
	
	//나이트가 이동할 수 있는 8가지 방향 정의
	int[] dx = {-2,-1,1,2,2,1,-1,-2};
	int[] dy = {-1,-2,-2,-1,1,2,2,1};
	//8가지 방향에 대하여 각 위치로 이동이 가능한지 확인
	int cnt = 0;
	
	for(int i=0;i<8;i++) {
		//이동하고자 하는 위치 확인
		int nextRow = x + dx[i];
		int nextCol = y + dy[i];
		//해당 위치로 이동이 가능하다면 카운트 증가
		if(nextRow>=1 && nextRow<=8 && nextCol>=1 && nextCol<=8)
			cnt++;
	}
	
	System.out.println(cnt);
}

}
