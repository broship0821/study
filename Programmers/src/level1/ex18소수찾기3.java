package level1;
//범위내에 모든 소수를 찾는건 에라토스테네스의 체 방법이 가장 빠름
//2번도 통과 못해서 int -> boolean으로 해서 바이트 줄임

import java.util.Arrays;

public class ex18소수찾기3 {
	
	public static int solution(int n) {
		int root = (int)Math.sqrt(n); //루트값 구하기
		
		//2~n까지 배열로 만들기
		boolean[] pan = new boolean[n+1];
		for(int i=2;i<=n;i++) {
			pan[i] = true;
		}
		for(int i=2;i<=root;i++) {
			if(pan[i]) {
				//*** 이렇게 하면 i의 배수 구할수 있음
				//i가 2면 2*j가 100보다 작을때까지 모든 2*j를 지움
				for(int j=2;j*i<=n;j++) {//i를 제외한 i의 배수가 n보다 작을때까지 반복
					pan[i*j] = false;
				}
			}
		}
		
		//소수 갯수 얻기
		int count = 0;
		for(int i=2;i<=n;i++) {
			if(pan[i]==true) count++;
		}
		System.out.println(count);
        return count;
    }

	public static void main(String[] args) {
		solution(100);

	}

}
