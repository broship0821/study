package ex12;

public class 두정수사이의합 {
	
	public static long solution(int a, int b) {
		if(a>b) {
			int tmp = a;
			a = b;
			b = tmp;
		}
		long sum = 0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println(sum);
        return sum;
    }

	public static void main(String[] args) {
		solution(3, 5);

	}

}
