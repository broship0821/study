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
		int result;
		do {
			System.out.println("1. ¥��\n2. «��");
			System.out.print("�����ϼ���: ");
			result = Integer.parseInt(sc.next());
		}while(result!=1 && result!=2);

		if(result==1) {
			System.out.println("¥��� ���Խ��ϴ�.");
		} else {
			System.out.println("«�� ���Խ��ϴ�.");
		}
	}

}
