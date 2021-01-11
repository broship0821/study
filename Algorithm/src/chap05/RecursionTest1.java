package chap05;
// 안녕하세요 5번 출력하기

public class RecursionTest1 {
	
	public static void recur(int n) {
		if(n<=0)
			return;
		System.out.println("안녕하세요");
		recur(n-1);
	}
	
	public static void recurX(int n) {
		for(int i=0;i<n;i++) {
			System.out.println("안녕하세요");
		}
	}

	public static void main(String[] args) {
		recur(5);
		System.out.println("----------------");
		recurX(5);

	}

}
