package ex05while;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		/*
		 while(����) {
		 	�����;
		 }
		 while���� ��Ȯ�� ��� �ݺ��ؾ� �Ǵ��� �� �� ���
		 
		 flag ���(switch ���)
		 int sw = 0;
		 while(sw==0){
		 	�����(STMT);
		 	sw=1;
		 }
		 
		 break; -> while �� ��������
		 continue; -> �ٽ� while�� ó������ ���ư�
		 
		 
		 Q) ������ �Է¹޾� max��, �����, ��� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		 (�� ������� ��, ���� �Է½� -1�� ������ EOF(���α׷� ����)�� �ǹ��Ѵ�)
		 
		 ���� : 100
		 ���� : 78
		 ���� : 96
		 ���� : -1
		 �ְ���: 100
		 ����� : 3
		 ���� ��� = 91.0
		 
		 */
	
		
		Scanner sc = new Scanner(System.in);
		int count = 0; //���� ��
		int sum = 0; //����
		int max = 0; //�ְ���
		
//		while(true) {
//			
//			System.out.print("����: ");
//			int num = sc.nextInt();
//			
//			if(num>max) max = num;
//			
//			if(num==-1) break;
//			count++; //��������
//			sum += num;
//			
//		}
		
		int num = 0;
		
		while(num>=0) {
			
			System.out.print("����: ");
			num = sc.nextInt();
			
			if(num>max) max = num;
			
			if(num>=0) {
				count++;
				sum += num;
			}
			
		}

		System.out.println("�ְ���: " + max);
		System.out.println("�����: " + count);
		System.out.printf("���� ���: %.2f", (double)sum/count);
		
	}

}
