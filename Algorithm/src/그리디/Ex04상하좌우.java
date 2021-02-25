package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04상하좌우 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//n, 계획서 입력받기
	int n = Integer.parseInt(sc.nextLine());
	String plan = sc.nextLine();
	String[] goal = plan.split(" ");

	//방향    		 L   R  U  D
	int[] dx = { 0, 0, -1, 1 };
	int[] dy = { -1, 1, 0, 0 };
	int direction = 0;
	
	//현재 좌표
	int x = 0;
	int y = 0;

	int tmpX = 0;
	int tmpY = 0;
	for (int i = 0; i < goal.length; i++) {
		switch (goal[i]) {
		case "L":
			direction = 0;
			tmpX = x+dx[direction];
			tmpY = y+dy[direction];
			if(tmpX>=0 && tmpX<n && tmpY>=0 && tmpY<n) {
				x = tmpX;
				y = tmpY;
			}
			break;
		case "R":
			direction = 1;
			tmpX = x+dx[direction];
			tmpY = y+dy[direction];
			if(tmpX>=0 && tmpX<n && tmpY>=0 && tmpY<n) {
				x = tmpX;
				y = tmpY;
			}
			break;
		case "U":
			direction = 2;
			tmpX = x+dx[direction];
			tmpY = y+dy[direction];
			if(tmpX>=0 && tmpX<n && tmpY>=0 && tmpY<n) {
				x = tmpX;
				y = tmpY;
			}
			break;
		case "D":
			direction = 3;
			tmpX = x+dx[direction];
			tmpY = y+dy[direction];
			if(tmpX>=0 && tmpX<n && tmpY>=0 && tmpY<n) {
				x = tmpX;
				y = tmpY;
			}
			break;
		}
	}
	//처음 위치가 (1,1)이기 때문에 +1씩
	System.out.print((x+1)+" "+(y+1));
}
}
