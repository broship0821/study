package chap05;

public class Hanoi {
	
	static void move(int no, int x, int y) {
		//6-x-y는 중간 기둥을 뜻함
		if(no>1)
			move(no-1, x, 6-x-y);
		System.out.printf("원반[%d]을 %d -> %d\n", no, x, y);
		if(no>1)
			move(no-1, 6-x-y, y);
	}
	
	static void moveStr(int no, int x, int y) {
		String a = "A 기둥";
		String b = "B 기둥";
		String c = "C 기둥";
		String[] name = { "A기둥", "B기둥", "C기둥" };
		
		//6-x-y는 중간 기둥을 뜻함
		if(no>1)
			moveStr(no-1, x, 6-x-y);
		System.out.println("원반[" + no + "]를 " + name[x - 1] + "에서 " + name[y - 1] + "으로 옮김");
//		System.out.printf("원반[%d]을 %s -> %s\n", no, (x==1?a:(x==2?b:c)), (y==1?a:(y==2?b:c)));
		if(no>1)
			moveStr(no-1, 6-x-y, y);
	}

	public static void main(String[] args) {
		move(3, 1, 3);
		System.out.println("----------------------------------");
		moveStr(3,1,3);

	}

}
