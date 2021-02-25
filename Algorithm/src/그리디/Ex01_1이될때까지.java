package 그리디;

public class Ex01_1이될때까지 {
	
public static int hello(int n, int k) {
	int result = n;
	int cnt = 0;
	while(result!=1) {
		if(result%k!=0) {
			System.out.println("마이너스연산+1");
			result--;
			cnt++;
		} else {
			System.out.println("나누기연산+1");
			result /= k;
			cnt++;
		}
	}
	
	return cnt;
}
	/*
	 N은 양의 정수이기때문에 마이너스만으로도 언젠가는 1이될수 있음
	 하지만 마이너스보다는 나누기가 훨씬더 빠르게 감소 가능
	 그렇기에 이렇게 가능하면 최대한 많이 나누는 작업이 최적의 해를 보장 
	 
	 내가한건 반복분 한번 돌때마다 n을 체크해야됨(반복횟수가 많아짐)
	 밑에처럼 하면 반복문 한번마다 n이 k로 나눠지는 연산을 수행해게됨
	 반복문 돌 횟수가 확 줄어듬-> 시간복잡도가 log 시간복잡도가됨
	 */
public static int hello2(int n, int k) {
	int cnt = 0;
	
	while(!(n<k)) {
		//n이 k로 나누어 떨어지는 수가 될때까지 빼기
		int target = (n/k)*k; // 25/3*3 = 24 -> 한번에 나누어 떨어지는 수 찾음
		cnt += (n - target); // 25 - 24 = 1 -> 마이너스 횟수는 1
		n = target; //n을 k로 나누어 떨어지는 수로 바꿔줌
		
		//n이 k보다 작을때(더이상 나눌수 없을때) 반복문 종료
		
		//k로 나누기
		cnt++;
		n /= k;
	}
	
	//마지막으로 남은수에 1씩 마이너스 연산
	cnt += (n-1);
	return cnt;
}

public static void main(String[] args) {
	int n = 25;
	int k = 3;
	System.out.println(hello2(n, k));
}

}
