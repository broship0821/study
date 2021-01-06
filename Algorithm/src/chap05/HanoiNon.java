package chap05;
//하노이의 탑을 비재귀적으로 구현
public class HanoiNon {
	//원반을 x기둥에서 y기둥으로 옮김
	static void move(int no, int x, int y) {
		int[] xstk = new int[100];
		int[] ystk = new int[100];
		int[] sstk = new int[100];
		int ptr = 0;
		int sw = 0;
		
		while(true) {
			if(sw==0 && no>1) {
				xstk[ptr] = x; //x의 값을 푸시
				ystk[ptr] = y; //y의 값을 푸시
				sstk[ptr] = sw; //sw의 값을 푸시
				ptr++;
				no = no-1;
				y = 6-x-y;
				continue;
			}
			System.out.printf("[%d]를 %d -> %d\n", no, x, y);
			if(sw==1 && no>1) {
				xstk[ptr] = x;
				ystk[ptr] = y;
				sstk[ptr] = sw;
				ptr++;
				no = no - 1;
				x = 6 - x - y;
				if(++sw==2)
					sw=0;
				continue;
			}
			do {
				if(ptr-- == 0)
					return;
				x = xstk[ptr];
				y = ystk[ptr];
				sw = sstk[ptr] + 1;
				no++;
			} while (sw==2);
		}
		
	}

	public static void main(String[] args) {
		move(3, 1, 3);

	}

}
