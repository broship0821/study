package ex12deeparray;

public class DeepArray {

	public static void main(String[] args) {
//		int[][] pyo = {{10, 20, 30}, {40, 50, 60}};
//		
//		for (int i = 0; i < pyo.length; i++) {
//			for (int j = 0; j < pyo[i].length; j++) {
//				System.out.print(pyo[i][j] + " ");
//			}
//			System.out.println();
//		}
		int num = 1;
		int[][] nums = new int[3][3];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				nums[j][i] = num++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j] + " ");
			}
			System.out.println();
		}

	}

}
