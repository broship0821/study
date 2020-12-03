package exam;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;

class GoodBurger extends JFrame implements ActionListener {
	
	//라벨
	Label l1 = new Label("굿버거 햄버거입니다");
	Label l2 = new Label("드실 메뉴를 선택하세요");
	
	//버튼
	JButton b1 = new JButton("매운 소스 햄버거: 5000");
	JButton b2 = new JButton("더블 비프 햄버거: 7000");
	JButton b3 = new JButton("야채 새우 햄버거: 4500");
	JButton b4 = new JButton("세겹토마토 햄버거: 5500");
	JButton b5 = new JButton("주문하기");
	JButton b6 = new JButton("취소");

	//주문
	String menu = "";
	int money = 0;
	int count = 0;
	int result = 0;
	
	//리스트
	String[] address = {"", "종로", "종로외"};
	JComboBox<String> combo = new JComboBox<>(address);
	boolean flag = false;
	
	//생성자
	public GoodBurger() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		setVisible(true);
		setTitle("어서오세요 굿버거입니다");
		setLayout(new GridLayout(0, 2, 100, 100));
		
		l1.setFont(new Font("굴림", Font.PLAIN, 30));
		l2.setFont(new Font("굴림", Font.PLAIN, 30));
		add(l1);
		add(l2);
		b1.setBackground(Color.blue);
		b2.setBackground(Color.blue);
		b3.setBackground(Color.blue);
		b4.setBackground(Color.blue);
		b5.setBackground(Color.ORANGE);
		b6.setBackground(Color.ORANGE);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		
		combo.addActionListener(this);
		add(combo);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			menu += b1.getText() + "\n";
			money += 5000;
			count++;
		} else if(e.getSource()==b2) {
			menu += b2.getText() + "\n";
			money += 7000;
			count++;
		} else if(e.getSource()==b3) {
			menu += b3.getText() + "\n";
			money += 4500;
			count++;
		} else if(e.getSource()==b4) {
			menu += b4.getText() + "\n";
			money += 5500;
			count++;
		} else if(e.getSource()==b5) {
			if(flag)
				money -= 1000;
			result = JOptionPane.showConfirmDialog(null, menu+"총금액: "+money+"\n총주문수량"+count+"개", "확인하세요", JOptionPane.YES_NO_OPTION);
			menu = "";
			money = 0;
			count = 0;
		} else if(e.getSource()==b6) {
			JOptionPane.showMessageDialog(null, "취소되었습니다");
			menu = "";
			money = 0;
			count = 0;
		} else if(e.getSource()==combo) {
			flag = true;
		}
		
	}
	

}

public class ExamMain {

	public static void main(String[] args) {
		new GoodBurger();

	}

}
