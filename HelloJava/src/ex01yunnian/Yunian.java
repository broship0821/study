package ex01yunnian;

import java.util.Scanner;

public class Yunian {

	public static void main(String[] args) {
		/* i�ذ� �����̳�?
		 	����: 365.2422��
		 	4�⿡ �ѹ��� ������ ����(2�� 29��)
		 	100�⿡�� ���
		 	400�⿡ �ѹ��� ���
		 	
		 	ex)
		 		96�� 29
		 		100�� 28
		 		200 28
		 		300 28
		 		400 29
		 		
		 	���� �м� -> ������ �ۼ�	->	�ڵ�	->	����(run)
		 			 (flow chart)
		 			 (N-S chart)
		 		
		 	���� Ư¡: 4�� ���, 400�� ��� �̸鼭 100�� ����� �ƴ�
		 	4�� ������ ��������
		 	100���� ������ �������� �ʰų�
		 	400 ������ ��������
		 	
		 	 ������
		 	+ - * / 	��� ������
		 	
		 	
		 	
		 */
		
		//			��: 1	2	3	4	5	6	7	8	9  10  11  12
		int[] pMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] yMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�⵵ �Է�: ");
		int year = Integer.parseInt(sc.next());
		
		System.out.print("�� �Է�: ");
		int month = Integer.parseInt(sc.next());
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "���� �����Դϴ�.");
			System.out.println(month + "���� " + yMonth[month-1] + "�ϱ��� �ֽ��ϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
			System.out.println(month + "���� " + pMonth[month-1] + "�ϱ��� �ֽ��ϴ�.");
		}
		
		sc.close();

	}

}
