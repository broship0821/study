package ex05while;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {
		int jum;
		int count = 0;
		int total = 0;
		int max;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("����: "); //two-read �� one-read
		jum = sc.nextInt();
		max = jum;
		
		while(jum != -1) { //eof üũ
			count++; //�����
			
			total += jum; //����� ���ϱ� ���� ����
			if(jum>max) //�ְ� ����
				max = jum;
			
			System.out.print("����: "); //two-read �� two-read
			jum = sc.nextInt();
			//�Ȱ����� 2�� �Է¹޴´ٰ� �ؼ� two-read ���
			//��� ������ �𸦶�, �迭�� ������ �� ����� ���� ��
			//one-read ����� break ��ġ�� ���� �־�� ���� �������ߵ�
			//two-read ����� �� �� �ڿ������� ���� �� ����
		}
		System.out.println("�ְ���: " + max);
		System.out.println("�����: " + count);
		System.out.printf("���� ���: %.2f", (double)total/count);
		
	}

}
