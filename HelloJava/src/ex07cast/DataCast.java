package ex07cast;

public class DataCast {

	public static void main(String[] args) {
		
		/*
		 ���α׷� ¥�� ���� short -> int �� int -> short
		 �� ���� ��Ȳ�� ����
		 */
		//������ ����ȯ(implicit conversion)
		//���� �ڷ������� ū �ڷ������� �ű涧, ���� �ȳ�
		short sh1 = 100;
		int i1 = sh1; //int�� short�� ���� �� ����
		
		//����� ������, cast ������
		//������ å���Ͽ� ���� ����ȯ ��ų �� ����
		int soo7 = 23456;
		short sh2 = (short) soo7;
		
		System.out.println(sh2);

	}

}
