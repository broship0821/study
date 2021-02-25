package 그리디;

import java.util.Scanner;

public class Ex05시각 {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	long start = System.currentTimeMillis();
	
	int cnt = 0;
	for(int h=0;h<=n;h++)//시
		if(h!=3 && h!=13 && h!=23)
			for(int m1=0;m1<6;m1++)//분 1자리
				if(m1!=3)
					for(int m2=0;m2<10;m2++)//분 10자리 
						if(m2!=3)
							for(int s1=0;s1<6;s1++) //초 1자리
								if(s1!=3)
									cnt++;
								else
									cnt += 10;
						else
							cnt += 10 * 6;
				else
					cnt += 10 * 6 * 10;
		else //3시,13시,23시일때
			cnt += 10 * 6 * 10 * 6;
	System.out.println(cnt);
	try {Thread.sleep(1000);} catch (Exception e) {}
	long end = System.currentTimeMillis();
	System.out.println( "실행 시간 : " + ( end - start )/1000.0 +"초");
}

}
