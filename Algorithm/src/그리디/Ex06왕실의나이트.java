package 그리디;

import java.util.Scanner;

public class Ex06왕실의나이트 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	String input = sc.next();
	
	//현재 위치 좌표로 변환 c2 -> (2,3)
	int x = input.charAt(1)-'0';
	int y = 0;
	switch(input.charAt(0)) {
		case 'a': y=1; break;
		case 'b': y=2; break;
		case 'c': y=3; break;
		case 'd': y=4; break;
		case 'e': y=5; break;
		case 'f': y=6; break;
		case 'g': y=7; break;
		case 'h': y=8; break;
	}
	
	int cnt = 0;
	
	//말이 움직일 수 있는 모든 경우에수 8가지
	if(y-2>=1) {
		if(x-1>=1) cnt++;
		if(x+1<=8) cnt++;
	}
	if(x-2>=1) {
		if(y-1>=1) cnt++;
		if(y+1<=8) cnt++;
	}
	if(y+2<=8) {
		if(x-1>=1) cnt++;
		if(x+1<=8) cnt++;
	}
	if(x+2<=8) {
		if(y-1>=1) cnt++;
		if(y+1<=8) cnt++;
	}
	
	System.out.println(cnt);
}

}
