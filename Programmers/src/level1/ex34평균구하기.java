package level1;


public class ex34평균구하기 {
	
	public static double solution(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
        double answer = (double)sum/arr.length;
        return answer;
    }

	public static void main(String[] args) {
		int[] arr = {5,5};
		System.out.println(solution(arr));
		

	}

}
