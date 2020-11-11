package ex15math;

import java.util.Arrays;

public class Lotto {

	public static void main(String[] args) {
//		System.out.print((int)Math.ceil(45*Math.random())+ "\t");
									//0.00001 ~ 0.99999
									//0.00005 ~ 44.22222
								//1.0 ~ 45.0
								//1 ~ 45

		int[] lotto = new int[6];
		for(int i=0;i<6;i++) {
			lotto[i] = (int)Math.ceil(45*Math.random());
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) { //중복이 되면
					i--; //다시 찍어라
					break;
				}
			}
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
