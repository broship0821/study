package ex11array;

public class ArrayEx {

	public static void main(String[] args) {
		/*
		 �迭: ���â�� �Ѳ����� ����ִ� ��
		 
		 int[] k = new int[3];
		 int k[] = new int[3];
		 
		index: 0, 1, 2 ....
		 */
		
		int[] k = new int[3];
		k[0] = 100;
		k[1] = 90;
		k[2] = 89;
		int sum = k[0] + k[1] + k[2];
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i=0;i<k.length;i++) {
			sum2 += k[i];
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for (int i = 0; i < k.length; i++) {
			sum3 += k[i];
		}
		System.out.println(sum3);

	}

}
