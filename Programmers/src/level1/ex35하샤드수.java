package level1;


public class ex35하샤드수 {
	
	public static boolean solution(int x) {
		int tmp = x;
		int sum = 0;
		while(x>0) {
			sum += x%10;
			x /= 10;
		}
		System.out.println(sum);
        return tmp%sum==0?true:false;
    }

	public static void main(String[] args) {
		System.out.println(solution(11));
		

	}

}
