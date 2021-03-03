package 구현;

import java.util.Scanner;

public class B1316 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int cnt = 0;
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++)
			if(check()==true)
				cnt++;
		
		System.out.println(cnt);
	}
	
	public static boolean check() {
		boolean[] check = new boolean[26];
		int prev = 0;
		String input = sc.next();
		
		for(int i=0;i<input.length();i++) {
			int now = input.charAt(i);
			
			if(prev!=now) 
				if(check[now-'a']==false) {
					check[now-'a'] = true;
					prev = now;
				} else
					return false;
			else
				continue;
		}
		return true;
	}
}
