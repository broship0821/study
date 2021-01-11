package chap05;
// 1부터 n까지의 합 구하기

public class RecursionTest2 {
	
	public static int recur(int n) {
		if(n<=1)
			return 1;
		return n + recur(n-1);
	}
	
	public static int recurX(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(recur(10));
		System.out.println("---------------------");
		System.out.println(recurX(10));
	}

}
