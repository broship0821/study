package ex09method;

import java.util.Scanner;

public class MethodEx {

	public static void main(String[] args) {
		/*
		 �޼ҵ�(�Լ�)
		 ���� ���Ǵ� �͵��� ����������
		 
		 �޼ҵ�: �޼ҵ� ȣ�⹮ + �޼ҵ� ���ǹ�
		 
		 ex)
		 	sort(); -> ȣ�⹮
		 	
		 	public void sort() { -> ���ǹ�
		 		����;
		 	}
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵ �Է�: ");
		int year = Integer.parseInt(sc.next());
		
		
		yunnian(year);

	}
	
	public static void yunnian(int year) {
		if(year%4==0 && year%100!=0 || year%400==0) {
			System.out.println(year + "���� �����Դϴ�.");
		} else {
			System.out.println(year + "���� ����Դϴ�.");
		}
	}

}
