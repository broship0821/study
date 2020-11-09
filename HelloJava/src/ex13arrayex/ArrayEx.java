package ex13arrayex;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		int[] k = {90, 100};
		System.out.println(Arrays.toString(k));
		int tmp = k[0];
		k[0] = k[1];
		k[1] = tmp;
		System.out.println(Arrays.toString(k));
		for (int i = 0; i < k.length; i++) {
			System.out.print(k[i] + " ");
		}
		System.out.println();
		
		System.out.println("-------------------------");
		
		int[] k2 = {90, 100, 10, 20, 30};
		System.out.println(Arrays.toString(k2));
		for (int i = 0; i < k2.length/2; i++) {
			int tmp2 = k2[i];
			k2[i] = k2[k2.length-i-1];
			k2[k2.length-i-1] = tmp2;
		}
		System.out.println(Arrays.toString(k2));
	}

}
