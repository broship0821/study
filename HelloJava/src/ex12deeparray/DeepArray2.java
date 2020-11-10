package ex12deeparray;

public class DeepArray2 {

	public static void main(String[] args) {
		//빛줄기 배열
		int[][] arr = new int[5][5];
		
		int num = 1;
		int m, n;
		for (int i = 0; i < 9; i++) {
			if(i<5) {
				for (int j = 0; j < 1+i; j++) {
					System.out.print("i: " + i + ", j: " + j + " |");
				}
				System.out.println();
			} else {
				for (int j = 0; j < 9-i; j++) {
					System.out.print("i: " + i + ", j: " + j + " |");
				}
				System.out.println();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
