package chap05;
//배열의 모든 요소의 최대 공약수를 구합니다.
public class GcdArr {
	
	static int gcd(int x,int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	
	static int gcdArr(int arr[], int start, int i) {
		if(i==1)
			return arr[start];
		else if(i==2)
			return gcd(arr[start], arr[start+1]);
		else
			return gcd(arr[start], gcdArr(arr, start+1, i-1));
	}

	public static void main(String[] args) {
		int[] arr = {24,9,3,2};
		System.out.println(gcdArr(arr,0,4));

	}

}
