package mybang2;

import java.util.Scanner;

public class Ex02BaeSoo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 1~100 ������ ������ �Է¹޾� 50�̻��� �������� 50���� Ŀ�� ����Ͻÿ�
		 */
		System.out.print("1~100 ������ �����Է�: ");
		int num = Integer.parseInt(sc.next());
		if(num>=50)
			System.out.println("50���� Ŀ");
	}

}
