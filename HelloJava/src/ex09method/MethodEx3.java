package ex09method;

import java.util.Scanner;

public class MethodEx3 {

	public static void main(String[] args) {
		/*
		 1����: �Ķ���� ���� ����, �ܼ� ���� ó��
		 2����: �Ķ���͸� ���ڷ� ��, �� �����͸� ������ ó��
		 3����: return
		 
		 �Ʒ��� 3����
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է�: ");
		int year = Integer.parseInt(sc.next());
		
		System.out.println("����~~~ " + year + "���� " + yunnian(year));
		

	}
	
	public static String yunnian(int year) {
		
		String result = "";
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			result = "����";
		} else {
			result = "���";
		}
		
		return result;
	}

}
