package ex09method;

import java.util.Scanner;

public class MethodEx2 {

	public static void main(String[] args) {
		/*
		 1����: �Ķ���� ���� ����, �ܼ� ���� ó��
		 2����: �Ķ���͸� ���ڷ� ��, �� �����͸� ������ ó��
		 3����: return
		 
		 �Ʒ��� 2����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է�: ");
		int year = Integer.parseInt(sc.next());
		
		
		yunnian(year, 10000);

	}
	
	public static void yunnian(int year, int money) {
		System.out.printf("���� %d�� �޾���\n", money);
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
	}

}
