package level1;

import java.util.Arrays;

public class ex32최대공약수와최소공배수 {
	
	public static int[] solution(int n, int m) {
		int[] answer = new int[2];
		
		if(n>m) {
			int tmp = n;
			n = m;
			m = tmp;
		}
		//최대공약수
		for(int i=1;i<=m;i++) {
			if(n%i==0 && m%i==0)
				answer[0] = i;
		}
		/*
		 재귀함수로 풀기...
		 public static int gcd(int p, int q)
			   {
			    if (q == 0) return p;
			    return gcd(q, p%q);
			   }
		 */
		
		//최소공배수
//		int tn = n;
//		int tm = m;
//		while(tn!=tm) {
//			for(int i=1;tn<tm;i++) {
//				tn += n;
//			}
//			for(int i=1;tm<tn;i++) {
//				tm += m;
//			}
//		}
//		answer[1] = tn;
		//최대공약수를 알면 최대공배수는 이렇게 알수 있음.....
		answer[1] = (n*m)/answer[0];
		System.out.println(Arrays.toString(answer));
        return answer;
    }

	public static void main(String[] args) {
		
		solution(2, 5);

	}

}
