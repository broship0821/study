package ex04dowhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		/*
		 do {
		 	�����;
		 } while(����);
		 
		 do while���� ������ �ѹ��� �����, �޴� ���鶧�� ����
		 */
		Scanner sc = new Scanner(System.in);
//		int result;
		
		
		String result;
		
		do {
			System.out.println("*** �޴��� ***");
			System.out.println("1. ¥��\n2. «��");
			System.out.print("�����ϼ���: ");
			result = sc.next();
			
		}while(!result.equals("1") && !result.equals("2"));

		System.out.println("���ְ� ��ʼ�");
	}

}
