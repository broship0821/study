package 그리디;

import java.util.Scanner;

public class Ex05시각2 {
	
//특정한 시각 안에 '3'이 포함되어 있는지의 여부
public static boolean check(int h, int m, int s) {
	//%는 1의 자리가 3인이 체크, /는 10의 자리가 3인지 체크
	if(h%10==3 || m/10==3 || m%10==3 || s/10==3 || s%10==3)
		return true;
	return false;
}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	long start = System.currentTimeMillis();
	
	int cnt = 0;
	for(int i=0;i<=n;i++) {
		for(int j=0;j<60;j++) {
			for(int k=0;k<60;k++) {
				if(check(i,j,k)) cnt++;
			}
		}
	}
	System.out.println(cnt);
	try {Thread.sleep(1000);} catch (Exception e) {}
	long end = System.currentTimeMillis();
	System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");
}

}
