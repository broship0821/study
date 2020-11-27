package exam;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JButtonClass extends JFrame  implements ActionListener{
	    
	//label
	JLabel jl1 = new JLabel("KG����ְ�");
	JLabel jl2 = new JLabel("��㼱�ߴ�ȸ");
	JLabel jl3 = new JLabel("���� �ڳʵ���");
	
	//button
	JButton jb1 = new JButton("�뷡 10��");
	JButton jb2 = new JButton("�� 20��");
	JButton jb3 = new JButton("�������  30��");
	JButton jb4 = new JButton("ö�λ������100��");
	JButton jb5 = new JButton("�̷�Ż�� 90��");
	JButton jb6 = new JButton("����  80��");
	JButton jb7 = new JButton("��������?");
	JButton jb8 = new JButton("���");
	
	//combobox
	String[] age1={"���� 10��", "���� 20��", "���� 30���̻�"};
	JComboBox jcb1=new  JComboBox(age1);
	
		
	String hangmok="";//���ڿ� 
	int jum=0;
	
	public JButtonClass() {//������ 
		setLayout(new GridLayout(0, 3, 30, 30));////////////////

		     //KG��� �ְ� ��� ���ߴ�ȸ  �ٹ̱� 
		jl1.setFont(new Font("����",Font.BOLD,25));//�� �۾� �ٹ̱�
    	add(jl1);
        jl2.setFont(new Font("����",Font.BOLD,25));
        add(jl2);
        jl3.setFont(new Font("����",Font.BOLD,25));
    	add(jl3); 
    	
    	
    	jb1.addActionListener(this); //��ư�� ��� �̺�Ʈ�� ���////////////
    	add(jb1);                    //â�� ��ư�� add  
    	jb2.addActionListener(this);
    	add(jb2);
        jb3.addActionListener(this);
    	add(jb3);
        jb4.addActionListener(this);
    	add(jb4);
        jb5.addActionListener(this);
    	add(jb5);
        jb6.addActionListener(this);  
    	add(jb6);    
    	
    	
    	
    	
    	
    	
    	
    	//�������� ��ư , ��ҹ�ư , �޺��ڽ� �����ι� �̺�Ʈ��� 
    	 jcb1.addActionListener(this);//�޺��ڽ�
         add(jcb1);
    	
    	jb7.setFont(new Font("����",Font.BOLD,30)); // "��������" ��ư 
     	jb7.setForeground(Color.red);   //"��������" ��ư�� color�ֱ� 
        jb7.setBackground(Color.cyan);
        jb7.addActionListener(this);
    	add(jb7);
    	
        jb8.setFont(new Font("����",Font.BOLD,30)); //"���" ��ư 
        jb8.setForeground(Color.blue);  //"���" ��ư�� color �ֱ� 
        jb8.setBackground(Color.yellow);
        jb8.addActionListener(this);
    	add(jb8);                       
         	
        setTitle("KG��۱�");
		setSize(700, 700);
		setVisible(true);
	} //������-end 
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==jb1) {  //�뷡          //(�׸���â��) 
			hangmok+=jb1.getText()+"\n";     //�뷡 10�� 
			jum=jum+10;                      //�������  30��  
			}
		if(e.getSource()==jb2) {//�� 
			hangmok+=jb2.getText()+"\n";
			jum=jum+20;
		}	
		if(e.getSource()==jb3) {//������� 
			hangmok+=jb3.getText()+"\n";
			jum=jum+30;
		}	
		if(e.getSource()==jb4) {
			hangmok+=jb4.getText()+"\n";
			jum=jum+100;
		}	
		if(e.getSource()==jb5) {
			hangmok+=jb5.getText()+"\n";
			jum=jum+90;
		}	
		if(e.getSource()==jb6) {//������ ȹ���ϴ� 6�� ���� ó�� �Ϸ� 
			hangmok+=jb6.getText()+"\n";
			jum=jum+80;
		}	
		if(e.getSource()==jcb1) { //�޺��ڽ� 
     JOptionPane.showMessageDialog(jcb1, (String) jcb1.getSelectedItem()+"�̽ñ���");
		   //������ ���̴� �޽��� ������� �������� ���̴� ���� �� 
		    jum=jum+10;//���� �����ڿ��Դ�  10����
			}
		
		if(e.getSource()==jb7) {//"��������" �� ������� 
             String msg1=hangmok+"��������"+String.valueOf(jum)+ "��";
             JOptionPane.showMessageDialog(jb7,msg1); 
                                     
	           hangmok=""; //�� ó������ �ʱ�ȭ 
               jum=0;
 	   }
	   if(e.getSource()==jb8) { //"���"��ư
		    hangmok="";
		    jum=0;
	         JOptionPane.showMessageDialog(jb8,"����߽��ϴ�");
	}
	
	
  }//actionPerformed-end
}//JButtonClass-end 

public class JButtonMainClass {// JButtonMainClass .java
	public static void main(String args[]) {
		new JButtonMainClass();

	}
}//JButtonMainClass-end















