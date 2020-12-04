package level1;

import java.util.Arrays;

public class ex33콜라츠추측 {
	
	public static int solution(long num) { //int 범위 넘어가기에 long으로 바꿔줘야됨
		int i = 0;
		if(num==1) return 0; //1이면 0반환
		for(i=1;i<=500;i++) {
			if(num%2==0) {
				num /= 2;
			} else {
				num *= 3;
				num++;
			}
			if(num==1) return i;
			System.out.println(num);
		}
        return -1;
    }

	public static void main(String[] args) {
		
		System.out.println(solution(626331));
		

	}

}
