package mybang;

import java.util.Date;
/*
 package �� import�� ������
 package: ����, ���� �۾��ϰ� �ִ� �ҽ����� ����
 import: ���� ��, ���� ���� �ҽ����� ���
 */
//import java.util.Date;

public class Hello {

	public static void main(String[] args) {
		Date d1 = new Date(); //ctrl + shift + o �� ��ü ����Ʈ ����
		
		System.out.println(d1.toLocaleString()); //ȭ����¸��
		System.out.println(d1);
		//toLocaleString(): �ѱ���� ���
		
		/*
		 ������ �ּ� ctrl + shift + /
		 �ּ� Ǯ��  ctrl + shift + \
		*/
		
		System.out.println(); //�ٹٲ�
		System.out.println("��¥ ��� ��!");
		
		System.out.printf("%d �� ����Ÿ�� ���� ����\n", 120);
		
		int num = 120;
		System.out.println(num + " �� ����Ÿ�� ���� ����");
		
		System.out.printf("����: %f\n", 3.141592);
		System.out.printf("����: %.2f\n", 3.141592); //�Ҽ��� 2�ڸ� ������
		double p = 3.141592;
		System.out.println("����: " + p);
		
		/*
		 �ڹٿ����� �޸�
		 
		 	heap:������(Reference Type)�� ������ Ÿ���� ���� ��ü(�ν��Ͻ�), �迭 ���� Heap ������ �����Ͱ� ����ȴ�.
		 	static(�ѹ� �����Ǹ� ���α׷� ������ ���� ������) ��������, �� �������(static�� ���� �ڷ���)
		 	stack(�޸𸮰� ����, �����Ǿ��� ������) -> primitive data (�޼ҵ尡 ȣ��� �� �޸𸮿� �Ҵ�ǰ� ����Ǹ� �޸𸮰� �����ȴ�.)
		 	code memory
		
		 stack:
		    �ڷ���  ������  ��
		 	int aa = 30; -> aa��� ���â�� 30�� �������
		 		int -> ����(4byte), type(����)�� ������
		 				4byte: -2147483648 ~ +2147483647 ���� ���� �� ����
		 				2byte: -32768 ~ +32767
		 				
		 	0 			-> 00000000000000000000000000
		 	1 			-> 00000000000000000000000001
		 	-1			-> 11111111111111111111111111 (�����߿� ���� ū ��)
		 	2147483647	-> 01111111111111111111111111
		 	-2147483648 -> 10000000000000000000000000 (���� �߿� ���� ���� ��)
		 */
		
		/*
		 �޿����� �� �����Դ� ���������� �������� �� 17%��� �Ѵ�
		 ���������� �����Ը� ����ϰ� �̸� �޿����� �����Է� ��ȯ�Ͽ� ����Ͻÿ�
		 */
		System.out.println("-------------------------------------");
		
		int earthWeight = 70;
		double moonWeight = earthWeight*0.17;
		System.out.println("�� ������: " + earthWeight + "kg");
		System.out.printf("�޿����� ������: %.2fkg\n", moonWeight);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
