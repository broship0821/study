package ex02bmi;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		/*
		 bmi ==> ������ / ����Ű �� ����
		 		  70  /  (1.75^2)
		 		  
		 30 �̻��̸� ��
		 25~30 ��ü��
		 20~25 ����
		 20 �̸� ��ü��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		int height = Integer.parseInt(sc.next());
		
		System.out.print("�����Ը� �Է��Ͻÿ�: ");
		int weight = Integer.parseInt(sc.next());
		
		System.out.println("Ű: " + height);
		System.out.println("������: " + weight);
		
		double mHeight = height / 100.0;
		
//		double bmi = weight / (mHeight*mHeight);
		double bmi = weight / Math.pow(mHeight, 2);		
		System.out.println("bmi: " + bmi);
		
		String result;
		if(bmi >= 30.0) result = "��"; //System.out.println("����� ���Դϴ�!");
		else if(bmi >= 25.0) result = "��ü��";
		else if(bmi >= 20.0) result = "����";
		else result = "��ü��";
		
		System.out.println(result + "�Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
