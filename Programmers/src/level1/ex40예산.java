package level1;

import java.util.Arrays;

public class ex40예산 {
	
	public static int solution(int[] d, int budget) {
		Arrays.sort(d);
		int sum = 0;
		//정렬후 작은것부터 더함
		int i = 0;
		for(i=0;i<d.length;i++) {
			sum += d[i];
			if(sum>budget) //예산 초과하면 멈춤
				break;
		}
		
        return i;//예산 초과하기 전까지 지원 가능한 부서 return(가장 효율성있게 지원하는건 아님, 예산 내에서 얼마나 많은 부서 지원 가능한지)
    }

	public static void main(String[] args) {
		int[] d = {1,3,2,5,4};
		int budget = 9;
		System.out.println(solution(d, budget));
		

	}

}
