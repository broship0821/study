package ex08switch;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		/*
		 ������ 73���� �л��� ������ ���Ͻÿ�
		 90-100	A
		 80-89	B
		 70-79	C
		 60-69	D
		 �������� 	F
		 */
		
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("���� �Է�: ");
//		int num = Integer.parseInt(sc.next());
//		String hakjum = "";
//		
//		switch(num/10) {
//		case 10:
//		case 9:
//			hakjum = "A";
//			break;
//		case 8:
//			hakjum = "B";
//			break;
//		case 7:
//			hakjum = "C";
//			break;
//		case 6:
//			hakjum = "D";
//			break;
//		default:
//			hakjum = "F";
//		}
//		
//		System.out.println(hakjum);
		
		/*
		 ���� �Է¹޾� �ش� ���� ��¥ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ� (switch, break ���)
		 */

		System.out.print("�� �Է�: ");
		int month = Integer.parseInt(sc.next());
		
		switch(month) {
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�� ���� ����");
			break;
		case 2:
			System.out.println("28�� ���� ����");
			break;
		default:
			System.out.println("31�� ���� ����");
			
	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
