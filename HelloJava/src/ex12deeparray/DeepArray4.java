package ex12deeparray;

public class DeepArray4 {

	public static void main(String[] args) {
		//빛줄기 배열
		int[][] arr = new int[5][5];
		
		int num = 1;
		for (int i = 0; i < 5; i++) {
			int k = 0;
			for(int j=i; j>=0;j--) {
				arr[k++][j] = num++;
				
			}
		}
		for(int i=1;i<=4;i++) {
			int k = i;
			for(int j=4;j>=i;j--) {
				arr[k++][j] = num++; 
			}
		}
		
		
		//-----------  출력   --------------------
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}

	}

}
