package level1;
//범위내에 모든 소수를 찾는건 에라토스테네스의 체 방법이 가장 빠름

import java.util.Arrays;

public class ex18소수찾기2 {
	
	public static int solution(int n) {
		double root = Math.sqrt(n); //루트값 구하기
		
		//2~n까지 배열로 만들기
		int[] cae = new int[n-1];
		int num = 2;
		for(int i=0;i<cae.length;i++) {
			cae[i] = num++;
		}
		
		//거르기
		for(int i=0;i<cae.length;i++) {
			//지워진거랑 배수가 n보다 큰거는 지울필요 없음
			if(cae[i]>root) break;
			if(cae[i]!=0) {
				for(int j=i+1;j<cae.length;j++) {//2부터 배수지우기
					if(cae[j]%cae[i]==0) {
						cae[j] = 0;
					}
				}
			}
		}
		System.out.println(Arrays.toString(cae));
		
		//소수 갯수 얻기
		int count = 0;
		for(int i : cae) {
			if(i!=0) count++;
		}
		System.out.println(count);
        return count;
    }

	public static void main(String[] args) {
		solution(100);

	}

}
