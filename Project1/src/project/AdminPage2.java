package project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

import project.util.DAO;

import javax.swing.ImageIcon;

public class AdminPage2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;

	
	public AdminPage2() {
		
		DAO dao = new DAO();
		List<QuestionVO> list = dao.getQuestionList();
		
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("admin page2");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(14, 12, 321, 40);
		contentPane.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 128)));
		layeredPane.setBounds(0, 64, 732, 92);
		contentPane.add(layeredPane);
		//6번문제
		JLabel lblNewLabel_1 = new JLabel("6번문제");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 0, 77, 34);
		layeredPane.add(lblNewLabel_1);
		
		JTextField textField = new JTextField();
		textField.setText(list.get(5).getQuestion());
		textField.setBounds(72, 0, 316, 31);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("정답");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(389, 0, 49, 34);
		layeredPane.add(lblNewLabel_2);
		
		JTextField textField_1 = new JTextField();
		textField_1.setText(list.get(5).getRightAnswer());
		textField_1.setBounds(435, 0, 297, 31);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		//첫번째 문제 버튼들
		String[] b0 = list.get(5).getButtons();
		
		JTextField textField_2 = new JTextField();
		textField_2.setText(b0[0]);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(10, 38, 37, 36);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		
		JTextField textField_3 = new JTextField();
		textField_3.setText(b0[1]);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(61, 38, 37, 36);
		layeredPane.add(textField_3);
		
		JTextField textField_4 = new JTextField();
		textField_4.setText(b0[2]);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(112, 38, 37, 36);
		layeredPane.add(textField_4);
		
		JTextField textField_5 = new JTextField();
		textField_5.setText(b0[3]);
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(163, 38, 37, 36);
		layeredPane.add(textField_5);
		
		JTextField textField_6 = new JTextField();
		textField_6.setText(b0[4]);
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(214, 38, 37, 36);
		layeredPane.add(textField_6);
		
		JTextField textField_7 = new JTextField();
		textField_7.setText(b0[5]);
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(265, 38, 37, 36);
		layeredPane.add(textField_7);
		
		JTextField textField_8 = new JTextField();
		textField_8.setText(b0[6]);
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(316, 38, 37, 36);
		layeredPane.add(textField_8);
		
		JTextField textField_9 = new JTextField();
		textField_9.setText(b0[7]);
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(367, 38, 37, 36);
		layeredPane.add(textField_9);
		
		JTextField textField_10 = new JTextField();
		textField_10.setText(b0[8]);
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(418, 38, 37, 36);
		layeredPane.add(textField_10);
		
		JTextField textField_11 = new JTextField();
		textField_11.setText(b0[9]);
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		textField_11.setBounds(470, 38, 37, 36);
		layeredPane.add(textField_11);
		
		JTextField textField_12 = new JTextField();
		textField_12.setText(b0[10]);
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBounds(521, 38, 37, 36);
		layeredPane.add(textField_12);
		
		JTextField textField_13 = new JTextField();
		textField_13.setText(b0[11]);
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		textField_13.setBounds(572, 38, 37, 36);
		layeredPane.add(textField_13);
		
		JButton btnNewButton = new JButton("수정");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] tmp = {textField_2.getText(), textField_3.getText(), textField_4.getText(), 
						textField_5.getText(), textField_6.getText(), textField_7.getText(), 
						textField_8.getText(), textField_9.getText(), textField_10.getText(), 
						textField_11.getText(), textField_12.getText(), textField_13.getText()};
				QuestionVO vo = new QuestionVO(textField.getText(), tmp, textField_1.getText());
				int check = dao.updateQuestion(6, vo);
				if(check==1)
					JOptionPane.showMessageDialog(null, "성공적으로 수정되었습니다.");
				else
					JOptionPane.showMessageDialog(null, "잘못된 값을 입력하셨습니다.");
			}
		});
		btnNewButton.setBounds(623, 38, 109, 36);
		layeredPane.add(btnNewButton);
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 128)));
		layeredPane_1.setBounds(0, 177, 732, 92);
		contentPane.add(layeredPane_1);
		
		//7번문제--------get(6)------------num7-----------------------
		JLabel label = new JLabel("7번문제");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(0, 0, 77, 34);
		layeredPane_1.add(label);
		
		textField_14 = new JTextField();
		textField_14.setText(list.get(6).getQuestion());
		textField_14.setColumns(10);
		textField_14.setBounds(72, 0, 316, 31);
		layeredPane_1.add(textField_14);
		
		JLabel label_1 = new JLabel("정답");
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(389, 0, 49, 34);
		layeredPane_1.add(label_1);
		
		textField_15 = new JTextField();
		textField_15.setText(list.get(6).getRightAnswer());
		textField_15.setColumns(10);
		textField_15.setBounds(435, 0, 297, 31);
		layeredPane_1.add(textField_15);
		
		//버튼들
		String[] b1 = list.get(6).getButtons();
		textField_16 = new JTextField();
		textField_16.setText(b1[0]);
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		textField_16.setBounds(10, 38, 37, 36);
		layeredPane_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText(b1[1]);
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		textField_17.setBounds(61, 38, 37, 36);
		layeredPane_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText(b1[2]);
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBounds(112, 38, 37, 36);
		layeredPane_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText(b1[3]);
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		textField_19.setBounds(163, 38, 37, 36);
		layeredPane_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText(b1[4]);
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBounds(214, 38, 37, 36);
		layeredPane_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText(b1[5]);
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		textField_21.setBounds(265, 38, 37, 36);
		layeredPane_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText(b1[6]);
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		textField_22.setBounds(316, 38, 37, 36);
		layeredPane_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText(b1[7]);
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		textField_23.setBounds(367, 38, 37, 36);
		layeredPane_1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText(b1[8]);
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		textField_24.setBounds(418, 38, 37, 36);
		layeredPane_1.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setText(b1[9]);
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		textField_25.setBounds(470, 38, 37, 36);
		layeredPane_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setText(b1[10]);
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setBounds(521, 38, 37, 36);
		layeredPane_1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setText(b1[11]);
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setColumns(10);
		textField_27.setBounds(572, 38, 37, 36);
		layeredPane_1.add(textField_27);
		
		JButton button = new JButton("수정");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] tmp = {textField_16.getText(), textField_17.getText(), textField_18.getText(), 
						textField_19.getText(), textField_20.getText(), textField_21.getText(), 
						textField_22.getText(), textField_23.getText(), textField_24.getText(), 
						textField_25.getText(), textField_26.getText(), textField_27.getText()};
				QuestionVO vo = new QuestionVO(textField_14.getText(), tmp, textField_15.getText());
				int check = dao.updateQuestion(7, vo);
				if(check==1)
					JOptionPane.showMessageDialog(null, "성공적으로 수정되었습니다.");
				else
					JOptionPane.showMessageDialog(null, "잘못된 값을 입력하셨습니다.");
			}
		});
		button.setBounds(623, 38, 109, 36);
		layeredPane_1.add(button);
		
		
		//8번문제, get(7), num8--------------------------------------------
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 128)));
		layeredPane_2.setBounds(0, 290, 732, 92);
		contentPane.add(layeredPane_2);
		
		JLabel label_2 = new JLabel("8번문제");
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(0, 0, 77, 34);
		layeredPane_2.add(label_2);
		
		textField_28 = new JTextField();
		textField_28.setText(list.get(7).getQuestion());
		textField_28.setColumns(10);
		textField_28.setBounds(72, 0, 316, 31);
		layeredPane_2.add(textField_28);
		
		JLabel label_3 = new JLabel("정답");
		label_3.setFont(new Font("굴림", Font.PLAIN, 20));
		label_3.setBounds(389, 0, 49, 34);
		layeredPane_2.add(label_3);
		
		textField_29 = new JTextField();
		textField_29.setText(list.get(7).getRightAnswer());
		textField_29.setColumns(10);
		textField_29.setBounds(435, 0, 297, 31);
		layeredPane_2.add(textField_29);
		//버튼
		String[] b2 = list.get(7).getButtons();
		textField_30 = new JTextField();
		textField_30.setText(b2[0]);
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setColumns(10);
		textField_30.setBounds(10, 38, 37, 36);
		layeredPane_2.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setText(b2[1]);
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setColumns(10);
		textField_31.setBounds(61, 38, 37, 36);
		layeredPane_2.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setText(b2[2]);
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setColumns(10);
		textField_32.setBounds(112, 38, 37, 36);
		layeredPane_2.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setText(b2[3]);
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setColumns(10);
		textField_33.setBounds(163, 38, 37, 36);
		layeredPane_2.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setText(b2[4]);
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setColumns(10);
		textField_34.setBounds(214, 38, 37, 36);
		layeredPane_2.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setText(b2[5]);
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setColumns(10);
		textField_35.setBounds(265, 38, 37, 36);
		layeredPane_2.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setText(b2[6]);
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setColumns(10);
		textField_36.setBounds(316, 38, 37, 36);
		layeredPane_2.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setText(b2[7]);
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setColumns(10);
		textField_37.setBounds(367, 38, 37, 36);
		layeredPane_2.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setText(b2[8]);
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setColumns(10);
		textField_38.setBounds(418, 38, 37, 36);
		layeredPane_2.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setText(b2[9]);
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setColumns(10);
		textField_39.setBounds(470, 38, 37, 36);
		layeredPane_2.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setText(b2[10]);
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setColumns(10);
		textField_40.setBounds(521, 38, 37, 36);
		layeredPane_2.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setText(b2[11]);
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setColumns(10);
		textField_41.setBounds(572, 38, 37, 36);
		layeredPane_2.add(textField_41);
		
		JButton button_1 = new JButton("수정");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] tmp = {textField_30.getText(), textField_31.getText(), textField_32.getText(), 
						textField_33.getText(), textField_34.getText(), textField_35.getText(), 
						textField_36.getText(), textField_37.getText(), textField_38.getText(), 
						textField_39.getText(), textField_40.getText(), textField_41.getText()};
				QuestionVO vo = new QuestionVO(textField_28.getText(), tmp, textField_29.getText());
				int check = dao.updateQuestion(8, vo);
				if(check==1)
					JOptionPane.showMessageDialog(null, "성공적으로 수정되었습니다.");
				else
					JOptionPane.showMessageDialog(null, "잘못된 값을 입력하셨습니다.");
			}
		});
		button_1.setBounds(623, 38, 109, 36);
		layeredPane_2.add(button_1);
		
		//9번문제, get(8), num9----------------------------------------------
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 128)));
		layeredPane_3.setBounds(0, 401, 732, 92);
		contentPane.add(layeredPane_3);
		
		JLabel label_4 = new JLabel("9번문제");
		label_4.setFont(new Font("굴림", Font.PLAIN, 20));
		label_4.setBounds(0, 0, 77, 34);
		layeredPane_3.add(label_4);
		
		textField_42 = new JTextField();
		textField_42.setText(list.get(8).getQuestion());
		textField_42.setColumns(10);
		textField_42.setBounds(72, 0, 316, 31);
		layeredPane_3.add(textField_42);
		
		JLabel label_5 = new JLabel("정답");
		label_5.setFont(new Font("굴림", Font.PLAIN, 20));
		label_5.setBounds(389, 0, 49, 34);
		layeredPane_3.add(label_5);
		
		textField_43 = new JTextField();
		textField_43.setText(list.get(8).getRightAnswer());
		textField_43.setColumns(10);
		textField_43.setBounds(435, 0, 297, 31);
		layeredPane_3.add(textField_43);
		//버튼
		String[] b3 = list.get(8).getButtons();
		textField_44 = new JTextField();
		textField_44.setText(b3[0]);
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setColumns(10);
		textField_44.setBounds(10, 38, 37, 36);
		layeredPane_3.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setText(b3[1]);
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setColumns(10);
		textField_45.setBounds(61, 38, 37, 36);
		layeredPane_3.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setText(b3[2]);
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setColumns(10);
		textField_46.setBounds(112, 38, 37, 36);
		layeredPane_3.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setText(b3[3]);
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setColumns(10);
		textField_47.setBounds(163, 38, 37, 36);
		layeredPane_3.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setText(b3[4]);
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setColumns(10);
		textField_48.setBounds(214, 38, 37, 36);
		layeredPane_3.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setText(b3[5]);
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setColumns(10);
		textField_49.setBounds(265, 38, 37, 36);
		layeredPane_3.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setText(b3[6]);
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setColumns(10);
		textField_50.setBounds(316, 38, 37, 36);
		layeredPane_3.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setText(b3[7]);
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setColumns(10);
		textField_51.setBounds(367, 38, 37, 36);
		layeredPane_3.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setText(b3[8]);
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setColumns(10);
		textField_52.setBounds(418, 38, 37, 36);
		layeredPane_3.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setText(b3[9]);
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setColumns(10);
		textField_53.setBounds(470, 38, 37, 36);
		layeredPane_3.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setText(b3[10]);
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setColumns(10);
		textField_54.setBounds(521, 38, 37, 36);
		layeredPane_3.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setText(b3[11]);
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setColumns(10);
		textField_55.setBounds(572, 38, 37, 36);
		layeredPane_3.add(textField_55);
		
		JButton button_2 = new JButton("수정");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] tmp = {textField_44.getText(), textField_45.getText(), textField_46.getText(), 
						textField_47.getText(), textField_48.getText(), textField_49.getText(), 
						textField_50.getText(), textField_51.getText(), textField_52.getText(), 
						textField_53.getText(), textField_54.getText(), textField_55.getText()};
				QuestionVO vo = new QuestionVO(textField_42.getText(), tmp, textField_43.getText());
				int check = dao.updateQuestion(9, vo);
				if(check==1)
					JOptionPane.showMessageDialog(null, "성공적으로 수정되었습니다.");
				else
					JOptionPane.showMessageDialog(null, "잘못된 값을 입력하셨습니다.");
			}
		});
		button_2.setBounds(623, 38, 109, 36);
		layeredPane_3.add(button_2);
		
		//10번문제, get(9), num10----------------------------------
		JLayeredPane layeredPane_4 = new JLayeredPane();
		layeredPane_4.setBorder(new MatteBorder(0, 0, 3, 0, (Color) new Color(0, 0, 128)));
		layeredPane_4.setBounds(0, 517, 732, 92);
		contentPane.add(layeredPane_4);
		
		JLabel label_6 = new JLabel("10번문제");
		label_6.setFont(new Font("굴림", Font.PLAIN, 18));
		label_6.setBounds(0, 0, 77, 34);
		layeredPane_4.add(label_6);
		
		textField_56 = new JTextField();
		textField_56.setText(list.get(9).getQuestion());
		textField_56.setColumns(10);
		textField_56.setBounds(72, 0, 316, 31);
		layeredPane_4.add(textField_56);
		
		JLabel label_7 = new JLabel("정답");
		label_7.setFont(new Font("굴림", Font.PLAIN, 20));
		label_7.setBounds(389, 0, 49, 34);
		layeredPane_4.add(label_7);
		
		textField_57 = new JTextField();
		textField_57.setText(list.get(9).getRightAnswer());
		textField_57.setColumns(10);
		textField_57.setBounds(435, 0, 297, 31);
		layeredPane_4.add(textField_57);
		//버튼
		String[] b4 = list.get(9).getButtons();
		textField_58 = new JTextField();
		textField_58.setText(b4[0]);
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setColumns(10);
		textField_58.setBounds(10, 38, 37, 36);
		layeredPane_4.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setText(b4[1]);
		textField_59.setHorizontalAlignment(SwingConstants.CENTER);
		textField_59.setColumns(10);
		textField_59.setBounds(61, 38, 37, 36);
		layeredPane_4.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setText(b4[2]);
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setColumns(10);
		textField_60.setBounds(112, 38, 37, 36);
		layeredPane_4.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setText(b4[3]);
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setColumns(10);
		textField_61.setBounds(163, 38, 37, 36);
		layeredPane_4.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setText(b4[4]);
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setColumns(10);
		textField_62.setBounds(214, 38, 37, 36);
		layeredPane_4.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setText(b4[5]);
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setColumns(10);
		textField_63.setBounds(265, 38, 37, 36);
		layeredPane_4.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setText(b4[6]);
		textField_64.setHorizontalAlignment(SwingConstants.CENTER);
		textField_64.setColumns(10);
		textField_64.setBounds(316, 38, 37, 36);
		layeredPane_4.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setText(b4[7]);
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setColumns(10);
		textField_65.setBounds(367, 38, 37, 36);
		layeredPane_4.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setText(b4[8]);
		textField_66.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66.setColumns(10);
		textField_66.setBounds(418, 38, 37, 36);
		layeredPane_4.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setText(b4[9]);
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setColumns(10);
		textField_67.setBounds(470, 38, 37, 36);
		layeredPane_4.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setText(b4[10]);
		textField_68.setHorizontalAlignment(SwingConstants.CENTER);
		textField_68.setColumns(10);
		textField_68.setBounds(521, 38, 37, 36);
		layeredPane_4.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setText(b4[11]);
		textField_69.setHorizontalAlignment(SwingConstants.CENTER);
		textField_69.setColumns(10);
		textField_69.setBounds(572, 38, 37, 36);
		layeredPane_4.add(textField_69);
		
		JButton button_3 = new JButton("수정");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] tmp = {textField_58.getText(), textField_59.getText(), textField_60.getText(), 
						textField_61.getText(), textField_62.getText(), textField_63.getText(), 
						textField_64.getText(), textField_65.getText(), textField_66.getText(), 
						textField_67.getText(), textField_68.getText(), textField_69.getText()};
				QuestionVO vo = new QuestionVO(textField_56.getText(), tmp, textField_57.getText());
				int check = dao.updateQuestion(10, vo);
				if(check==1)
					JOptionPane.showMessageDialog(null, "성공적으로 수정되었습니다.");
				else
					JOptionPane.showMessageDialog(null, "잘못된 값을 입력하셨습니다.");
			}
		});
		button_3.setBounds(623, 38, 109, 36);
		layeredPane_4.add(button_3);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new AdminPage1().setVisible(true);
				dispose();
				setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(AdminPage2.class.getResource("/img/back.jpg")));
		btnNewButton_1.setBounds(486, 642, 45, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("게임화면");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
				Main frame = new Main();
				frame.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_2.setBounds(31, 642, 128, 40);
		contentPane.add(btnNewButton_2);
	}
}
