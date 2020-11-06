package ex09method;

import java.util.Scanner;

public class MethodEx4 {

	public static void main(String[] args) {
		
		/*
		 Ű�� �����Դ� main()���� �Է�
		 bmi ���� �񸸵��� ����� ���ǹ����� ���
		 ���� ����� main()���� ���
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		int height = Integer.parseInt(sc.next());
		
		System.out.print("�����Ը� �Է��Ͻÿ�: ");
		int weight = Integer.parseInt(sc.next());
		
		System.out.println("Ű: " + height);
		System.out.println("������: " + weight);
		
		System.out.println("����� " + printBmi(height, weight) + "�Դϴ�.");
	}
	
	public static String printBmi(int height, int weight) {
		double mHeight = height / 100.0;
		double bmi = weight / Math.pow(mHeight, 2);
		System.out.println("bmi: " + bmi);
		String result;
		if(bmi >= 30.0) result = "��";
		else if(bmi >= 25.0) result = "��ü��";
		else if(bmi >= 20.0) result = "����";
		else result = "��ü��";
		return result;
	}
}
