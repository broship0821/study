package ex03dataType;

public class DataType {

	public static void main(String[] args) {
		/*
		 �ڹ� �⺻ �ڷ��� (primitive type)
		 int 		���� + 4byte				-2147483648 ~ + 2147483647
		 short		���� + 2byte				-32768 ~ +32767
		 byte		���� + 1byte				-128 ~ +127
		 long 		���� + 8byte				���� ����
		 
		 double		�Ǽ� + 8byte				������(�Ҽ����� 15�ڸ� ����)
		 float		�Ǽ� + 4byte				������(�Ҽ����� 6�ڸ� ����)
		 
		 char		���� + 2byte				'A' '��'
		 
		 boolean	true, false + 1byte		
		 
		 stack �޸𸮿� ��
		 
		 
		 */
		
		System.out.println("short�� min��: " + Short.MIN_VALUE);
		System.out.println("short�� max��: " + Short.MAX_VALUE);
		
		/*
		 wrapper: �⺻ �ڷ����� ��üȭ ���Ѽ� ���
		 int	->	Integer
		 short	->	Short
		 */
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
//		System.out.println(Boolean.MAX_VALUE);
//		System.out.println(Boolean.MIN_VALUE);
		
		
		System.out.println("-------------------------------");
		
		//heap memory, String�� ���޸𸮿� �����
		String ppp = null;								//���� �޸𸮿� null�� ����, ���� ���� X
		String qqq = ""; //���ڿ�, ���̰� 0�� ���ڿ�			  ���� �޸𸮿� �ּҰ� �ְ�, ���� "" ��� ����
		//����: �ѹ��� 'A', ���ڿ�: �������� "A", "tom"
		
		String yy = "ondal"; //heap�� "ondal" ����ְ� ���ؿ��� heap�� �ּҰ��� �������
		
//		System.out.println(ppp.length()>0); //������Ʈ ����
		System.out.println(qqq.length()>0); //false
		
		String aa = "ondal";
		String bb = "ondal"; //���� �Ȱ����� ������ ���� ���� ���ϰ� ���� �ִ��� ������
		if(aa==bb) //�ּҰ� ����?
			System.out.println(aa + "\t" + bb);
		
		if(aa.equals(bb)) //���� ����?
			System.out.println(aa + "\t" + bb);
		
		String aa2 = "ondal2";
		String bb2 = "ondal3";
		
		if(aa2==bb2) { //false
			System.out.println("==����");
		} else {
			System.out.println("false");
		}
		
		if(aa2.equals(bb2)) {
			System.out.println("equals����");
		}
		
		String cc = new String("ondal");
		String dd = new String("ondal"); //�̷��� �ϸ� ������ ���Ƶ� ���ο� ��ü ����
		
		if(cc==dd) {
			System.out.println("������ �ٸ��� �̰� ��� �ȵ�");
		}
		if(cc.equals(dd)) {
			System.out.println("���� �����ϱ� �̰� ���");
		}
		
		
		
		
		
	}
	
}
