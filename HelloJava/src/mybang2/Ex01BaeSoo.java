package mybang2;

import java.util.Scanner;

public class Ex01BaeSoo {

	public static void main(String[] args) {
		/*
		 high level language(human-oriented language) -> �ΰ����� �� �����, �ΰ��� ����(java, c#, ���־�����)
		 low level language(machine-oriented language) -> ��迡�� �� �����, ��谡 ����
		 	-assembly ����� 1:1 ����
		 	
		 ������: ��� ����� �ٲٱ�
		 
		 compile ��� -> �ѹ� ������ �� ��� ���
		 interpreter ��� -> �������� â�� �������� ����
		 
		 �ڹٴ� ���̷��� ������ ���
		 .java : ����, source program, �����ϸ� ������ ��
		 .class: byte code
		 just-in-time compiler: �����ϵ� ���� �ٽ� �ѹ� ������
		 �ڹٴ� ������ �ǰ� �޸𸮿� �ö�� �� ���������Ͱ� �ѹ� �� ��, �׷��� ��� OS�� ȣȯ�� ������
		 
		 
		 �Լ�(�޼ҵ�)
		 head
		 if(����) {body
		 	����1;
		 	����2;
		 }
		 
		 */
		
		
		/*
		 i2 ���� �Է¹޾� i2�� 3�� ����̸� "�ź�",
		 5�� ����̸� "����", 3�� 5�� ����̸�  "���ù�����"��
		 ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 */
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("���� �Է�: ");
		int i2 = sc.nextInt();
//		System.out.print("�����Է�:");
//		String s2 = sc.nextLine();
//		System.out.println(i2);
//		System.out.println(s2);
//		int i2 = Integer.parseInt(sc.next());
		/*
		 ���ڷ� �޾Ƽ� ���ڷ� �ٲٴ� ����� ����ϴ� ����
		 
		 c ���
		 	getchar()	30����
		 	getchar()	50����
		 	getchar()	70����
		 	���⼭ ���͵� ������ ��
		 
		 nextInt() �޼���� ����� �Է��� ���� ������ ���๮�ڸ� �������� ����
		 �׷��� ���� ���Ͱ� �ڿ� nextLine()���� ������ �Է����� ó���Ǽ� ������ �߻�
		 �׷��� Integer.parseInt(sc.next())��ߵ�
		 */
		
		if(i2 % 3==0 && i2 % 5 ==0)
			System.out.println("���ù�����");
		else if (i2 % 3==0)
			System.out.println("�ź�");
		else if (i2 % 5 ==0)
			System.out.println("����");

	}

}
