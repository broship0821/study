package ex06;
//체육복

import java.util.Arrays;

public class Solution {
	
	public static int solution(int n, int[] lost, int[] reserve) {
		int[] uniform = new int[n];
		//다 한벌씩
		for (int i = 0; i < n; i++) {
			uniform[i]++;
		}
		//여분옷 갖고 온사람
		for(int i=0;i<reserve.length;i++) {
			uniform[reserve[i]-1]++;
		}
		//도둑맞음
		for(int i=0;i<lost.length;i++) {
			uniform[lost[i]-1]--;
		}
//		//뒤에사람에게 빌려주기
//		for(int i=0;i<n-1;i++) {
//			if(uniform[i]==2&&uniform[i+1]==0) {
//				uniform[i]--;
//				uniform[i+1]++;
//			}
//		}
//		//앞에사람에게 빌려주기
//		for(int i=n-1;i>0;i--) {
//			if(uniform[i]==2&&uniform[i-1]==0) {
//				uniform[i]--;
//				uniform[i-1]++;
//			}
//		}
		/*
		 이렇게 하면			0202 일때
		 뒤에사람에게 빌려주기 -> 0112 
		 앞에사람에게 빌려주기 -> 0112 
		 이렇게 되서 틀림
		 근데 일단 저 두개 순서 바꿨더니 통과는 했는데, 사실 2020일때 틀림
		 위에 주석처리한거보단 밑에 비교문 써서 해야됨
		 */
		for(int i=0;i<n;i++) {
			if(uniform[i]==0) {
				if(i-1>=0&&uniform[i-1]==2) {
					uniform[i]++;
					uniform[i-1]--;
				} else if(i+1<n&&uniform[i+1]==2) {
					uniform[i]++;
					uniform[i+1]--;
				}
			}
		}
		/*
		 내꺼는 뒤 사람에게 먼저 주고 앞 사람에게 줘서 빈 사람이 생길 수 있음(0202 일때 맨 앞사람 빔)
		 이거는 한사람한사람 앞뒤 물어보고 지나가서 빈 사람이 안생김
		 */
		System.out.println(Arrays.toString(uniform));
        int answer = 0;
        //체육복 있는지 체크
        for(int i=0;i<n;i++) {
        	if(uniform[i]!=0)
        		answer++;
        }
        return answer;
    }

	public static void main(String[] args) {
		int n = 5;
		int[] lost = {3,5};
		int[] reserve = {2,4};
		System.out.println(solution(n, lost, reserve));

	}

}
