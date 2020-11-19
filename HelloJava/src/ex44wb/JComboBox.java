package ex44wb;
/*
#### JComboBox

1) 콤보박스 초기값은 속성-model에서 입력한다

JOptionPane
*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JComboBox extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JComboBox frame = new JComboBox();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		javax.swing.JComboBox comboBox = new javax.swing.JComboBox();
		comboBox.addActionListener(new ActionListener() {//마오 - add event handder - action - actionPerformed
			public void actionPerformed(ActionEvent arg0) {//액션이 발생할때
				if(arg0.getSource()==comboBox) {//발생한 여러가지 이벤트 중 comboBox에서 발생한 이벤트가 맞는지 체크
					JOptionPane.showMessageDialog(comboBox, (String)comboBox.getSelectedItem()); //comboBox위치에 그 아이템을 String으로 출력해라
//					JOptionPane.showMessageDialog(null, (String)comboBox.getSelectedItem()); //첫번쨰 인자는 위치, null주면 화면 정 가운데생김
					
					
				}
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"삼겹살", "명륜진사갈비", "bhc", "닭발", "족발", "짱깨", "훠궈", "함박스테이크"}));
		comboBox.setBounds(69, 74, 126, 47);
		contentPane.add(comboBox);
		
		JLabel label = new JLabel("오늘 저녁 뭐먹지?");
		label.setBounds(69, 33, 126, 28);
		contentPane.add(label);
	}

}
