package ex11array;

public class ArrayEx {

	public static void main(String[] args) {
		/*
		 �迭: ���â�� �Ѳ����� ����ִ� ��
		 
		 int[] k = new int[3];
		 int k[] = new int[3];
		 
		index: 0, 1, 2 ....
		 */
		
//		int[] k = new int[3];
//		k[0] = 100;
//		k[1] = 90;
//		k[2] = 89;
//		int sum = k[0] + k[1] + k[2];
//		System.out.println(sum);
//		
//		int sum2 = 0;
//		for(int i=0;i<k.length;i++) {
//			sum2 += k[i];
//		}
//		System.out.println(sum2);
//		
//		int sum3 = 0;
//		for (int i = 0; i < k.length; i++) {
//			sum3 += k[i];
//		}
//		System.out.println(sum3);
		
		/*
		 한 학생의 국어, 영어, 수학, 사회, 과학 5과목 점수를 각각 변수에 넣은 후
		 총점 및 평균을 구하는 프로그램을 작성하시오
		 단 점수는 키보드 입력 없이 초기치로 넣으시오, 배열은 사용하지 않음
		 ex) int kor = 100;
		 */
		
		int kor = 100;
		int eng = 90;
		int math = 80;
		int social = 70;
		int science = 60;
		
		int sum = kor + eng + math + social + science;
		double avg = sum/5.0;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		System.out.println("-----------------------------");
		sum = 0;
//		int[] num = new int[5];
//		num[0] = 100;
//		num[1] = 100;
//		num[2] = 100;
//		num[3] = 100;
//		num[4] = 100;
		int[] num = {100, 23, 42, 56, 45};
		
		for(int i=0;i<num.length;i++) {
			sum += num[i];
		}
		avg = sum/(num.length*1.0);
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		System.out.println("--------------------");
		
		//배열의 대표명은 그 배열의 시작번지이다
		
		int[] num3 = {20, 30, 40, 50, 60, 70, 80};
		System.out.println(num3[0]); // 20
		kaja100(num3);
		System.out.println(num3[0]); // 100
		
		System.out.println("---------------------");
		//5개 수를 배열을 사용하여 전달한후 배열 역순으로 출력하시오
		int num4[] = {1, 2, 3, 4, 5};
		reverse(num4);
		
	
		
		
		
		

	}

	private static void reverse(int[] num4) {
		for(int i=0;i<num4.length;i++) {
			System.out.println(num4[num4.length - i - 1]);
		}
		
	}

	private static void kaja100(int[] num3) {
		num3[0] = 100;
		
	}

}
