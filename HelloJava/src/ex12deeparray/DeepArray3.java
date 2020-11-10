package ex12deeparray;

public class DeepArray3 {

	public static void main(String[] args) {
		//빛줄기 배열
		int[][] arr = new int[5][5];
		
		int num = 1;
		int count = 0;
		for (int i = 0; i < 5; i++) { //i는 9
			for(int j=0; j<count;j++) {
				int tmp = count;
				arr[j][tmp--] = num++;
				
			}
			if(i<5)
				count++;
			else
				count--;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
