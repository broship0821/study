package ex14sort;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		/*
		 sort: key(기준) 차순(ascending, descending)
		 내부소트(memory sort): radix, selection, bubble, insertion, shell
		 외부소트: disk(2-way merge sort, k=way)
		 */
		
		int[] bae = {10, 90, 100, 60, 70};
		System.out.println(Arrays.toString(bae));
//		Arrays.sort(bae);
//		System.out.println(Arrays.toString(bae));
		
		//오름차순
		for (int i = 0; i < bae.length-1; i++) {
			for (int j = i+1; j < bae.length; j++) {
				if(bae[i]>bae[j]) {
					int tmp = bae[i];
					bae[i] = bae[j];
					bae[j] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(bae));
		
		
		//버블소트 -> 이거 외우기
		int[] k = {10, 90, 100, 60, 70, 23};
		System.out.println(Arrays.toString(k));
		int imsi;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		for (int i = 0; i < k.length-1; i++) {
////			int sw = 0;
//			for (int j = 0; j < k.length-1-i; j++) {
//				if(k[j]<k[j+1]) {
//					imsi = k[j];
//					k[j] = k[j+1];
//					k[j+1] = imsi;
////					sw=1;
//				}
////				if(sw==0) break;
//			}
//		}
//		System.out.println(Arrays.toString(k));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
