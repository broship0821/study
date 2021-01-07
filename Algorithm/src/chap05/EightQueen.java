package chap05;
//각 열에 1개의 퀸을 배치하는 조합을 재귀적으로 표현
public class EightQueen {
	static boolean[] flag_a = new boolean[8]; //각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15]; //  / 방향으로 퀸을 배치했는지
	static boolean[] flag_c = new boolean[15]; //  \ 방향으로 퀸을 배치했는지
	static int[] pos = new int[8]; //각 열의 퀸의 위치
	static int num = 1;

	//각 열의 퀸의 위치 출력
	static void print() {
		for(int i=0;i<8;i++) {
			System.out.printf("%2d", pos[i]);
		}
		System.out.println();
	}
	
	//i열에 퀸 놓기
	static void set(int i) {
		for(int j=0;j<8;j++) {
			if(flag_a[j]==false && flag_b[i+j]==false && flag_c[i-j+7]==false) {
				pos[i] = j;
				if(i==7) {
					System.out.print(num++ + " : ");
					print();
				}
				else {
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = true;
					set(i+1);
					flag_a[j] = flag_b[i+j] = flag_c[i-j+7] = false;
				}
				
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);

	}

}
