package ex06for;

public class ForEx {

	public static void main(String[] args) {
		/*
		 for �ݺ���
		 
		 for(�ʱ�ġ; ����ġ; ����ġ) {
		 	�����;
		 }
		 */
		
//		for(int i=1;i<=10;i++) {
//			System.out.println("����ġ��" + i);
//		}
		
//		int result = 0;
//		for(int i=1;i<=100;i++) {
//			result += i;
//		}
//		System.out.println(result);
		
		/*
		 1~100������ �� �� 3�� ����� ��� ����Ͻÿ�
		 */
		
//		for(int i=1;i<=100;i++) {
//			if(i%3==0)
//				System.out.println(i);
//		}
		
		//�ٸ� ���
		
//		for(int i=3;i<=100;i+=3) {
//			System.out.println(i);
//		}
		
		
//		System.out.println("�г� - ��"); //���� ���� �ݺ����� ����
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=2;j++) {
//				System.out.printf("%d - %d\n", i, j);
//			}
//		}
		
		/*
		 �������
		 ���� ���°� : �� -> j
		 �ʰ� ���°� : �� -> i
		 */
		/*
		 	*****
		 	*****
		 	*****
		 */
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		 	*****
		 	****
		 	***
		 	**
		 	*
		 */
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		 	*
			**
			***
			****
			*****
	 	*/
		for(int i=0;i<5;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		     	*
			   **
			  ***
			 ****
			*****
		 */
		for(int i=0;i<5;i++) {
			for(int j=i;j<4;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		//if�� �Ἥ �غ���
		/*
		     	* j 4���� " "		4-i
			   **   3����		4-i
			  ***   2
			 ****   1
			*****   0
		 */
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j<4-i) System.out.print(" ");
				else System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------");
		/*
		 	*****
			 ****
			  ***
			   **
			    *
		 */
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<5-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
