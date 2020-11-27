package project;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import project.util.DAO;

public class AdminPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JButton btnNewButton;
	private JLayeredPane layeredPane_1;
	private JLabel label;
	private JTextField textField_14;
	private JLabel label_1;
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
	private JButton button;
	private JLayeredPane layeredPane_2;
	private JLabel label_2;
	private JTextField textField_28;
	private JLabel label_3;
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
	private JButton button_1;
	private JLayeredPane layeredPane_3;
	private JLabel label_4;
	private JTextField textField_42;
	private JLabel label_5;
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
	private JButton button_2;
	private JLayeredPane layeredPane_4;
	private JLabel label_6;
	private JTextField textField_56;
	private JLabel label_7;
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
	private JButton button_3;
	private JLayeredPane layeredPane_5;
	private JLabel label_8;
	private JTextField textField_70;
	private JLabel label_9;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_77;
	private JTextField textField_78;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_83;
	private JButton button_4;
	private JLayeredPane layeredPane_6;
	private JLabel label_10;
	private JTextField textField_84;
	private JLabel label_11;
	private JTextField textField_85;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_91;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTextField textField_96;
	private JTextField textField_97;
	private JButton button_5;
	private JLayeredPane layeredPane_7;
	private JLabel label_12;
	private JTextField textField_98;
	private JLabel label_13;
	private JTextField textField_99;
	private JTextField textField_100;
	private JTextField textField_101;
	private JTextField textField_102;
	private JTextField textField_103;
	private JTextField textField_104;
	private JTextField textField_105;
	private JTextField textField_106;
	private JTextField textField_107;
	private JTextField textField_108;
	private JTextField textField_109;
	private JTextField textField_110;
	private JTextField textField_111;
	private JButton button_6;
	private JLayeredPane layeredPane_8;
	private JLabel label_14;
	private JTextField textField_112;
	private JLabel label_15;
	private JTextField textField_113;
	private JTextField textField_114;
	private JTextField textField_115;
	private JTextField textField_116;
	private JTextField textField_117;
	private JTextField textField_118;
	private JTextField textField_119;
	private JTextField textField_120;
	private JTextField textField_121;
	private JTextField textField_122;
	private JTextField textField_123;
	private JTextField textField_124;
	private JTextField textField_125;
	private JButton button_7;
	private JLayeredPane layeredPane_9;
	private JLabel label_16;
	private JTextField textField_126;
	private JLabel label_17;
	private JTextField textField_127;
	private JTextField textField_128;
	private JTextField textField_129;
	private JTextField textField_130;
	private JTextField textField_131;
	private JTextField textField_132;
	private JTextField textField_133;
	private JTextField textField_134;
	private JTextField textField_135;
	private JTextField textField_136;
	private JTextField textField_137;
	private JTextField textField_138;
	private JTextField textField_139;
	private JButton button_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage frame = new AdminPage();
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
	public AdminPage() {
		
		DAO dao = new DAO();
		List<QuestionVO> list = dao.getQuestionList();
		
		setBackground(SystemColor.activeCaption);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 963);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("admin page");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBounds(14, 12, 321, 40);
		contentPane.add(lblNewLabel);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 64, 732, 73);
		contentPane.add(layeredPane);
		
		JLabel lblNewLabel_1 = new JLabel("1번문제");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(0, 0, 77, 34);
		layeredPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setText(list.get(0).getQuestion());
		textField.setBounds(72, 0, 316, 31);
		layeredPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("정답");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(389, 0, 49, 34);
		layeredPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setText(list.get(0).getRightAnswer());
		textField_1.setBounds(435, 0, 297, 31);
		layeredPane.add(textField_1);
		textField_1.setColumns(10);
		
		//첫번째 문제 버튼들
		String[] b0 = list.get(0).getButtons();
		
		textField_2 = new JTextField();
		textField_2.setText(b0[0]);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setBounds(10, 38, 37, 36);
		layeredPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(61, 38, 37, 36);
		layeredPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(10);
		textField_4.setBounds(112, 38, 37, 36);
		layeredPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(163, 38, 37, 36);
		layeredPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBounds(214, 38, 37, 36);
		layeredPane.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setColumns(10);
		textField_7.setBounds(265, 38, 37, 36);
		layeredPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBounds(316, 38, 37, 36);
		layeredPane.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setColumns(10);
		textField_9.setBounds(367, 38, 37, 36);
		layeredPane.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBounds(418, 38, 37, 36);
		layeredPane.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setColumns(10);
		textField_11.setBounds(470, 38, 37, 36);
		layeredPane.add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBounds(521, 38, 37, 36);
		layeredPane.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		textField_13.setBounds(572, 38, 37, 36);
		layeredPane.add(textField_13);
		
		btnNewButton = new JButton("수정");
		btnNewButton.setBounds(623, 38, 109, 36);
		layeredPane.add(btnNewButton);
		
		layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(0, 149, 732, 73);
		contentPane.add(layeredPane_1);
		
		label = new JLabel("2번문제");
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(0, 0, 77, 34);
		layeredPane_1.add(label);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(72, 0, 316, 31);
		layeredPane_1.add(textField_14);
		
		label_1 = new JLabel("정답");
		label_1.setFont(new Font("굴림", Font.PLAIN, 20));
		label_1.setBounds(389, 0, 49, 34);
		layeredPane_1.add(label_1);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(435, 0, 297, 31);
		layeredPane_1.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		textField_16.setBounds(10, 38, 37, 36);
		layeredPane_1.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setColumns(10);
		textField_17.setBounds(61, 38, 37, 36);
		layeredPane_1.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBounds(112, 38, 37, 36);
		layeredPane_1.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setColumns(10);
		textField_19.setBounds(163, 38, 37, 36);
		layeredPane_1.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBounds(214, 38, 37, 36);
		layeredPane_1.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setHorizontalAlignment(SwingConstants.CENTER);
		textField_21.setColumns(10);
		textField_21.setBounds(265, 38, 37, 36);
		layeredPane_1.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		textField_22.setBounds(316, 38, 37, 36);
		layeredPane_1.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		textField_23.setBounds(367, 38, 37, 36);
		layeredPane_1.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		textField_24.setBounds(418, 38, 37, 36);
		layeredPane_1.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setHorizontalAlignment(SwingConstants.CENTER);
		textField_25.setColumns(10);
		textField_25.setBounds(470, 38, 37, 36);
		layeredPane_1.add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setHorizontalAlignment(SwingConstants.CENTER);
		textField_26.setColumns(10);
		textField_26.setBounds(521, 38, 37, 36);
		layeredPane_1.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setHorizontalAlignment(SwingConstants.CENTER);
		textField_27.setColumns(10);
		textField_27.setBounds(572, 38, 37, 36);
		layeredPane_1.add(textField_27);
		
		button = new JButton("수정");
		button.setBounds(623, 38, 109, 36);
		layeredPane_1.add(button);
		
		layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(0, 234, 732, 73);
		contentPane.add(layeredPane_2);
		
		label_2 = new JLabel("3번문제");
		label_2.setFont(new Font("굴림", Font.PLAIN, 20));
		label_2.setBounds(0, 0, 77, 34);
		layeredPane_2.add(label_2);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(72, 0, 316, 31);
		layeredPane_2.add(textField_28);
		
		label_3 = new JLabel("정답");
		label_3.setFont(new Font("굴림", Font.PLAIN, 20));
		label_3.setBounds(389, 0, 49, 34);
		layeredPane_2.add(label_3);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(435, 0, 297, 31);
		layeredPane_2.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setHorizontalAlignment(SwingConstants.CENTER);
		textField_30.setColumns(10);
		textField_30.setBounds(10, 38, 37, 36);
		layeredPane_2.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setHorizontalAlignment(SwingConstants.CENTER);
		textField_31.setColumns(10);
		textField_31.setBounds(61, 38, 37, 36);
		layeredPane_2.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setHorizontalAlignment(SwingConstants.CENTER);
		textField_32.setColumns(10);
		textField_32.setBounds(112, 38, 37, 36);
		layeredPane_2.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setHorizontalAlignment(SwingConstants.CENTER);
		textField_33.setColumns(10);
		textField_33.setBounds(163, 38, 37, 36);
		layeredPane_2.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setHorizontalAlignment(SwingConstants.CENTER);
		textField_34.setColumns(10);
		textField_34.setBounds(214, 38, 37, 36);
		layeredPane_2.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setHorizontalAlignment(SwingConstants.CENTER);
		textField_35.setColumns(10);
		textField_35.setBounds(265, 38, 37, 36);
		layeredPane_2.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setHorizontalAlignment(SwingConstants.CENTER);
		textField_36.setColumns(10);
		textField_36.setBounds(316, 38, 37, 36);
		layeredPane_2.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setHorizontalAlignment(SwingConstants.CENTER);
		textField_37.setColumns(10);
		textField_37.setBounds(367, 38, 37, 36);
		layeredPane_2.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setHorizontalAlignment(SwingConstants.CENTER);
		textField_38.setColumns(10);
		textField_38.setBounds(418, 38, 37, 36);
		layeredPane_2.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setHorizontalAlignment(SwingConstants.CENTER);
		textField_39.setColumns(10);
		textField_39.setBounds(470, 38, 37, 36);
		layeredPane_2.add(textField_39);
		
		textField_40 = new JTextField();
		textField_40.setHorizontalAlignment(SwingConstants.CENTER);
		textField_40.setColumns(10);
		textField_40.setBounds(521, 38, 37, 36);
		layeredPane_2.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setHorizontalAlignment(SwingConstants.CENTER);
		textField_41.setColumns(10);
		textField_41.setBounds(572, 38, 37, 36);
		layeredPane_2.add(textField_41);
		
		button_1 = new JButton("수정");
		button_1.setBounds(623, 38, 109, 36);
		layeredPane_2.add(button_1);
		
		layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBounds(0, 319, 732, 73);
		contentPane.add(layeredPane_3);
		
		label_4 = new JLabel("4번문제");
		label_4.setFont(new Font("굴림", Font.PLAIN, 20));
		label_4.setBounds(0, 0, 77, 34);
		layeredPane_3.add(label_4);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(72, 0, 316, 31);
		layeredPane_3.add(textField_42);
		
		label_5 = new JLabel("정답");
		label_5.setFont(new Font("굴림", Font.PLAIN, 20));
		label_5.setBounds(389, 0, 49, 34);
		layeredPane_3.add(label_5);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(435, 0, 297, 31);
		layeredPane_3.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setHorizontalAlignment(SwingConstants.CENTER);
		textField_44.setColumns(10);
		textField_44.setBounds(10, 38, 37, 36);
		layeredPane_3.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setHorizontalAlignment(SwingConstants.CENTER);
		textField_45.setColumns(10);
		textField_45.setBounds(61, 38, 37, 36);
		layeredPane_3.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setHorizontalAlignment(SwingConstants.CENTER);
		textField_46.setColumns(10);
		textField_46.setBounds(112, 38, 37, 36);
		layeredPane_3.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setHorizontalAlignment(SwingConstants.CENTER);
		textField_47.setColumns(10);
		textField_47.setBounds(163, 38, 37, 36);
		layeredPane_3.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setHorizontalAlignment(SwingConstants.CENTER);
		textField_48.setColumns(10);
		textField_48.setBounds(214, 38, 37, 36);
		layeredPane_3.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setHorizontalAlignment(SwingConstants.CENTER);
		textField_49.setColumns(10);
		textField_49.setBounds(265, 38, 37, 36);
		layeredPane_3.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setHorizontalAlignment(SwingConstants.CENTER);
		textField_50.setColumns(10);
		textField_50.setBounds(316, 38, 37, 36);
		layeredPane_3.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setHorizontalAlignment(SwingConstants.CENTER);
		textField_51.setColumns(10);
		textField_51.setBounds(367, 38, 37, 36);
		layeredPane_3.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setHorizontalAlignment(SwingConstants.CENTER);
		textField_52.setColumns(10);
		textField_52.setBounds(418, 38, 37, 36);
		layeredPane_3.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setHorizontalAlignment(SwingConstants.CENTER);
		textField_53.setColumns(10);
		textField_53.setBounds(470, 38, 37, 36);
		layeredPane_3.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setHorizontalAlignment(SwingConstants.CENTER);
		textField_54.setColumns(10);
		textField_54.setBounds(521, 38, 37, 36);
		layeredPane_3.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setHorizontalAlignment(SwingConstants.CENTER);
		textField_55.setColumns(10);
		textField_55.setBounds(572, 38, 37, 36);
		layeredPane_3.add(textField_55);
		
		button_2 = new JButton("수정");
		button_2.setBounds(623, 38, 109, 36);
		layeredPane_3.add(button_2);
		
		layeredPane_4 = new JLayeredPane();
		layeredPane_4.setBounds(0, 404, 732, 73);
		contentPane.add(layeredPane_4);
		
		label_6 = new JLabel("5번문제");
		label_6.setFont(new Font("굴림", Font.PLAIN, 20));
		label_6.setBounds(0, 0, 77, 34);
		layeredPane_4.add(label_6);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(72, 0, 316, 31);
		layeredPane_4.add(textField_56);
		
		label_7 = new JLabel("정답");
		label_7.setFont(new Font("굴림", Font.PLAIN, 20));
		label_7.setBounds(389, 0, 49, 34);
		layeredPane_4.add(label_7);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(435, 0, 297, 31);
		layeredPane_4.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setHorizontalAlignment(SwingConstants.CENTER);
		textField_58.setColumns(10);
		textField_58.setBounds(10, 38, 37, 36);
		layeredPane_4.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setHorizontalAlignment(SwingConstants.CENTER);
		textField_59.setColumns(10);
		textField_59.setBounds(61, 38, 37, 36);
		layeredPane_4.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setHorizontalAlignment(SwingConstants.CENTER);
		textField_60.setColumns(10);
		textField_60.setBounds(112, 38, 37, 36);
		layeredPane_4.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setHorizontalAlignment(SwingConstants.CENTER);
		textField_61.setColumns(10);
		textField_61.setBounds(163, 38, 37, 36);
		layeredPane_4.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setHorizontalAlignment(SwingConstants.CENTER);
		textField_62.setColumns(10);
		textField_62.setBounds(214, 38, 37, 36);
		layeredPane_4.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setHorizontalAlignment(SwingConstants.CENTER);
		textField_63.setColumns(10);
		textField_63.setBounds(265, 38, 37, 36);
		layeredPane_4.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setHorizontalAlignment(SwingConstants.CENTER);
		textField_64.setColumns(10);
		textField_64.setBounds(316, 38, 37, 36);
		layeredPane_4.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setHorizontalAlignment(SwingConstants.CENTER);
		textField_65.setColumns(10);
		textField_65.setBounds(367, 38, 37, 36);
		layeredPane_4.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setHorizontalAlignment(SwingConstants.CENTER);
		textField_66.setColumns(10);
		textField_66.setBounds(418, 38, 37, 36);
		layeredPane_4.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setHorizontalAlignment(SwingConstants.CENTER);
		textField_67.setColumns(10);
		textField_67.setBounds(470, 38, 37, 36);
		layeredPane_4.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setHorizontalAlignment(SwingConstants.CENTER);
		textField_68.setColumns(10);
		textField_68.setBounds(521, 38, 37, 36);
		layeredPane_4.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setHorizontalAlignment(SwingConstants.CENTER);
		textField_69.setColumns(10);
		textField_69.setBounds(572, 38, 37, 36);
		layeredPane_4.add(textField_69);
		
		button_3 = new JButton("수정");
		button_3.setBounds(623, 38, 109, 36);
		layeredPane_4.add(button_3);
		
		layeredPane_5 = new JLayeredPane();
		layeredPane_5.setBounds(0, 489, 732, 73);
		contentPane.add(layeredPane_5);
		
		label_8 = new JLabel("6번문제");
		label_8.setFont(new Font("굴림", Font.PLAIN, 20));
		label_8.setBounds(0, 0, 77, 34);
		layeredPane_5.add(label_8);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(72, 0, 316, 31);
		layeredPane_5.add(textField_70);
		
		label_9 = new JLabel("정답");
		label_9.setFont(new Font("굴림", Font.PLAIN, 20));
		label_9.setBounds(389, 0, 49, 34);
		layeredPane_5.add(label_9);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(435, 0, 297, 31);
		layeredPane_5.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setHorizontalAlignment(SwingConstants.CENTER);
		textField_72.setColumns(10);
		textField_72.setBounds(10, 38, 37, 36);
		layeredPane_5.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setHorizontalAlignment(SwingConstants.CENTER);
		textField_73.setColumns(10);
		textField_73.setBounds(61, 38, 37, 36);
		layeredPane_5.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setHorizontalAlignment(SwingConstants.CENTER);
		textField_74.setColumns(10);
		textField_74.setBounds(112, 38, 37, 36);
		layeredPane_5.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setHorizontalAlignment(SwingConstants.CENTER);
		textField_75.setColumns(10);
		textField_75.setBounds(163, 38, 37, 36);
		layeredPane_5.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setHorizontalAlignment(SwingConstants.CENTER);
		textField_76.setColumns(10);
		textField_76.setBounds(214, 38, 37, 36);
		layeredPane_5.add(textField_76);
		
		textField_77 = new JTextField();
		textField_77.setHorizontalAlignment(SwingConstants.CENTER);
		textField_77.setColumns(10);
		textField_77.setBounds(265, 38, 37, 36);
		layeredPane_5.add(textField_77);
		
		textField_78 = new JTextField();
		textField_78.setHorizontalAlignment(SwingConstants.CENTER);
		textField_78.setColumns(10);
		textField_78.setBounds(316, 38, 37, 36);
		layeredPane_5.add(textField_78);
		
		textField_79 = new JTextField();
		textField_79.setHorizontalAlignment(SwingConstants.CENTER);
		textField_79.setColumns(10);
		textField_79.setBounds(367, 38, 37, 36);
		layeredPane_5.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setHorizontalAlignment(SwingConstants.CENTER);
		textField_80.setColumns(10);
		textField_80.setBounds(418, 38, 37, 36);
		layeredPane_5.add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setHorizontalAlignment(SwingConstants.CENTER);
		textField_81.setColumns(10);
		textField_81.setBounds(470, 38, 37, 36);
		layeredPane_5.add(textField_81);
		
		textField_82 = new JTextField();
		textField_82.setHorizontalAlignment(SwingConstants.CENTER);
		textField_82.setColumns(10);
		textField_82.setBounds(521, 38, 37, 36);
		layeredPane_5.add(textField_82);
		
		textField_83 = new JTextField();
		textField_83.setHorizontalAlignment(SwingConstants.CENTER);
		textField_83.setColumns(10);
		textField_83.setBounds(572, 38, 37, 36);
		layeredPane_5.add(textField_83);
		
		button_4 = new JButton("수정");
		button_4.setBounds(623, 38, 109, 36);
		layeredPane_5.add(button_4);
		
		layeredPane_6 = new JLayeredPane();
		layeredPane_6.setBounds(0, 574, 732, 73);
		contentPane.add(layeredPane_6);
		
		label_10 = new JLabel("7번문제");
		label_10.setFont(new Font("굴림", Font.PLAIN, 20));
		label_10.setBounds(0, 0, 77, 34);
		layeredPane_6.add(label_10);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(72, 0, 316, 31);
		layeredPane_6.add(textField_84);
		
		label_11 = new JLabel("정답");
		label_11.setFont(new Font("굴림", Font.PLAIN, 20));
		label_11.setBounds(389, 0, 49, 34);
		layeredPane_6.add(label_11);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(435, 0, 297, 31);
		layeredPane_6.add(textField_85);
		
		textField_86 = new JTextField();
		textField_86.setHorizontalAlignment(SwingConstants.CENTER);
		textField_86.setColumns(10);
		textField_86.setBounds(10, 38, 37, 36);
		layeredPane_6.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setHorizontalAlignment(SwingConstants.CENTER);
		textField_87.setColumns(10);
		textField_87.setBounds(61, 38, 37, 36);
		layeredPane_6.add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setHorizontalAlignment(SwingConstants.CENTER);
		textField_88.setColumns(10);
		textField_88.setBounds(112, 38, 37, 36);
		layeredPane_6.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setHorizontalAlignment(SwingConstants.CENTER);
		textField_89.setColumns(10);
		textField_89.setBounds(163, 38, 37, 36);
		layeredPane_6.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setHorizontalAlignment(SwingConstants.CENTER);
		textField_90.setColumns(10);
		textField_90.setBounds(214, 38, 37, 36);
		layeredPane_6.add(textField_90);
		
		textField_91 = new JTextField();
		textField_91.setHorizontalAlignment(SwingConstants.CENTER);
		textField_91.setColumns(10);
		textField_91.setBounds(265, 38, 37, 36);
		layeredPane_6.add(textField_91);
		
		textField_92 = new JTextField();
		textField_92.setHorizontalAlignment(SwingConstants.CENTER);
		textField_92.setColumns(10);
		textField_92.setBounds(316, 38, 37, 36);
		layeredPane_6.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setHorizontalAlignment(SwingConstants.CENTER);
		textField_93.setColumns(10);
		textField_93.setBounds(367, 38, 37, 36);
		layeredPane_6.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setHorizontalAlignment(SwingConstants.CENTER);
		textField_94.setColumns(10);
		textField_94.setBounds(418, 38, 37, 36);
		layeredPane_6.add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setHorizontalAlignment(SwingConstants.CENTER);
		textField_95.setColumns(10);
		textField_95.setBounds(470, 38, 37, 36);
		layeredPane_6.add(textField_95);
		
		textField_96 = new JTextField();
		textField_96.setHorizontalAlignment(SwingConstants.CENTER);
		textField_96.setColumns(10);
		textField_96.setBounds(521, 38, 37, 36);
		layeredPane_6.add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setHorizontalAlignment(SwingConstants.CENTER);
		textField_97.setColumns(10);
		textField_97.setBounds(572, 38, 37, 36);
		layeredPane_6.add(textField_97);
		
		button_5 = new JButton("수정");
		button_5.setBounds(623, 38, 109, 36);
		layeredPane_6.add(button_5);
		
		layeredPane_7 = new JLayeredPane();
		layeredPane_7.setBounds(0, 659, 732, 73);
		contentPane.add(layeredPane_7);
		
		label_12 = new JLabel("8번문제");
		label_12.setFont(new Font("굴림", Font.PLAIN, 20));
		label_12.setBounds(0, 0, 77, 34);
		layeredPane_7.add(label_12);
		
		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(72, 0, 316, 31);
		layeredPane_7.add(textField_98);
		
		label_13 = new JLabel("정답");
		label_13.setFont(new Font("굴림", Font.PLAIN, 20));
		label_13.setBounds(389, 0, 49, 34);
		layeredPane_7.add(label_13);
		
		textField_99 = new JTextField();
		textField_99.setColumns(10);
		textField_99.setBounds(435, 0, 297, 31);
		layeredPane_7.add(textField_99);
		
		textField_100 = new JTextField();
		textField_100.setHorizontalAlignment(SwingConstants.CENTER);
		textField_100.setColumns(10);
		textField_100.setBounds(10, 38, 37, 36);
		layeredPane_7.add(textField_100);
		
		textField_101 = new JTextField();
		textField_101.setHorizontalAlignment(SwingConstants.CENTER);
		textField_101.setColumns(10);
		textField_101.setBounds(61, 38, 37, 36);
		layeredPane_7.add(textField_101);
		
		textField_102 = new JTextField();
		textField_102.setHorizontalAlignment(SwingConstants.CENTER);
		textField_102.setColumns(10);
		textField_102.setBounds(112, 38, 37, 36);
		layeredPane_7.add(textField_102);
		
		textField_103 = new JTextField();
		textField_103.setHorizontalAlignment(SwingConstants.CENTER);
		textField_103.setColumns(10);
		textField_103.setBounds(163, 38, 37, 36);
		layeredPane_7.add(textField_103);
		
		textField_104 = new JTextField();
		textField_104.setHorizontalAlignment(SwingConstants.CENTER);
		textField_104.setColumns(10);
		textField_104.setBounds(214, 38, 37, 36);
		layeredPane_7.add(textField_104);
		
		textField_105 = new JTextField();
		textField_105.setHorizontalAlignment(SwingConstants.CENTER);
		textField_105.setColumns(10);
		textField_105.setBounds(265, 38, 37, 36);
		layeredPane_7.add(textField_105);
		
		textField_106 = new JTextField();
		textField_106.setHorizontalAlignment(SwingConstants.CENTER);
		textField_106.setColumns(10);
		textField_106.setBounds(316, 38, 37, 36);
		layeredPane_7.add(textField_106);
		
		textField_107 = new JTextField();
		textField_107.setHorizontalAlignment(SwingConstants.CENTER);
		textField_107.setColumns(10);
		textField_107.setBounds(367, 38, 37, 36);
		layeredPane_7.add(textField_107);
		
		textField_108 = new JTextField();
		textField_108.setHorizontalAlignment(SwingConstants.CENTER);
		textField_108.setColumns(10);
		textField_108.setBounds(418, 38, 37, 36);
		layeredPane_7.add(textField_108);
		
		textField_109 = new JTextField();
		textField_109.setHorizontalAlignment(SwingConstants.CENTER);
		textField_109.setColumns(10);
		textField_109.setBounds(470, 38, 37, 36);
		layeredPane_7.add(textField_109);
		
		textField_110 = new JTextField();
		textField_110.setHorizontalAlignment(SwingConstants.CENTER);
		textField_110.setColumns(10);
		textField_110.setBounds(521, 38, 37, 36);
		layeredPane_7.add(textField_110);
		
		textField_111 = new JTextField();
		textField_111.setHorizontalAlignment(SwingConstants.CENTER);
		textField_111.setColumns(10);
		textField_111.setBounds(572, 38, 37, 36);
		layeredPane_7.add(textField_111);
		
		button_6 = new JButton("수정");
		button_6.setBounds(623, 38, 109, 36);
		layeredPane_7.add(button_6);
		
		layeredPane_8 = new JLayeredPane();
		layeredPane_8.setBounds(0, 744, 732, 73);
		contentPane.add(layeredPane_8);
		
		label_14 = new JLabel("9번문제");
		label_14.setFont(new Font("굴림", Font.PLAIN, 20));
		label_14.setBounds(0, 0, 77, 34);
		layeredPane_8.add(label_14);
		
		textField_112 = new JTextField();
		textField_112.setColumns(10);
		textField_112.setBounds(72, 0, 316, 31);
		layeredPane_8.add(textField_112);
		
		label_15 = new JLabel("정답");
		label_15.setFont(new Font("굴림", Font.PLAIN, 20));
		label_15.setBounds(389, 0, 49, 34);
		layeredPane_8.add(label_15);
		
		textField_113 = new JTextField();
		textField_113.setColumns(10);
		textField_113.setBounds(435, 0, 297, 31);
		layeredPane_8.add(textField_113);
		
		textField_114 = new JTextField();
		textField_114.setHorizontalAlignment(SwingConstants.CENTER);
		textField_114.setColumns(10);
		textField_114.setBounds(10, 38, 37, 36);
		layeredPane_8.add(textField_114);
		
		textField_115 = new JTextField();
		textField_115.setHorizontalAlignment(SwingConstants.CENTER);
		textField_115.setColumns(10);
		textField_115.setBounds(61, 38, 37, 36);
		layeredPane_8.add(textField_115);
		
		textField_116 = new JTextField();
		textField_116.setHorizontalAlignment(SwingConstants.CENTER);
		textField_116.setColumns(10);
		textField_116.setBounds(112, 38, 37, 36);
		layeredPane_8.add(textField_116);
		
		textField_117 = new JTextField();
		textField_117.setHorizontalAlignment(SwingConstants.CENTER);
		textField_117.setColumns(10);
		textField_117.setBounds(163, 38, 37, 36);
		layeredPane_8.add(textField_117);
		
		textField_118 = new JTextField();
		textField_118.setHorizontalAlignment(SwingConstants.CENTER);
		textField_118.setColumns(10);
		textField_118.setBounds(214, 38, 37, 36);
		layeredPane_8.add(textField_118);
		
		textField_119 = new JTextField();
		textField_119.setHorizontalAlignment(SwingConstants.CENTER);
		textField_119.setColumns(10);
		textField_119.setBounds(265, 38, 37, 36);
		layeredPane_8.add(textField_119);
		
		textField_120 = new JTextField();
		textField_120.setHorizontalAlignment(SwingConstants.CENTER);
		textField_120.setColumns(10);
		textField_120.setBounds(316, 38, 37, 36);
		layeredPane_8.add(textField_120);
		
		textField_121 = new JTextField();
		textField_121.setHorizontalAlignment(SwingConstants.CENTER);
		textField_121.setColumns(10);
		textField_121.setBounds(367, 38, 37, 36);
		layeredPane_8.add(textField_121);
		
		textField_122 = new JTextField();
		textField_122.setHorizontalAlignment(SwingConstants.CENTER);
		textField_122.setColumns(10);
		textField_122.setBounds(418, 38, 37, 36);
		layeredPane_8.add(textField_122);
		
		textField_123 = new JTextField();
		textField_123.setHorizontalAlignment(SwingConstants.CENTER);
		textField_123.setColumns(10);
		textField_123.setBounds(470, 38, 37, 36);
		layeredPane_8.add(textField_123);
		
		textField_124 = new JTextField();
		textField_124.setHorizontalAlignment(SwingConstants.CENTER);
		textField_124.setColumns(10);
		textField_124.setBounds(521, 38, 37, 36);
		layeredPane_8.add(textField_124);
		
		textField_125 = new JTextField();
		textField_125.setHorizontalAlignment(SwingConstants.CENTER);
		textField_125.setColumns(10);
		textField_125.setBounds(572, 38, 37, 36);
		layeredPane_8.add(textField_125);
		
		button_7 = new JButton("수정");
		button_7.setBounds(623, 38, 109, 36);
		layeredPane_8.add(button_7);
		
		layeredPane_9 = new JLayeredPane();
		layeredPane_9.setBounds(0, 833, 732, 73);
		contentPane.add(layeredPane_9);
		
		label_16 = new JLabel("10번문제");
		label_16.setFont(new Font("굴림", Font.PLAIN, 18));
		label_16.setBounds(0, 0, 77, 34);
		layeredPane_9.add(label_16);
		
		textField_126 = new JTextField();
		textField_126.setColumns(10);
		textField_126.setBounds(72, 0, 316, 31);
		layeredPane_9.add(textField_126);
		
		label_17 = new JLabel("정답");
		label_17.setFont(new Font("굴림", Font.PLAIN, 20));
		label_17.setBounds(389, 0, 49, 34);
		layeredPane_9.add(label_17);
		
		textField_127 = new JTextField();
		textField_127.setColumns(10);
		textField_127.setBounds(435, 0, 297, 31);
		layeredPane_9.add(textField_127);
		
		textField_128 = new JTextField();
		textField_128.setHorizontalAlignment(SwingConstants.CENTER);
		textField_128.setColumns(10);
		textField_128.setBounds(10, 38, 37, 36);
		layeredPane_9.add(textField_128);
		
		textField_129 = new JTextField();
		textField_129.setHorizontalAlignment(SwingConstants.CENTER);
		textField_129.setColumns(10);
		textField_129.setBounds(61, 38, 37, 36);
		layeredPane_9.add(textField_129);
		
		textField_130 = new JTextField();
		textField_130.setHorizontalAlignment(SwingConstants.CENTER);
		textField_130.setColumns(10);
		textField_130.setBounds(112, 38, 37, 36);
		layeredPane_9.add(textField_130);
		
		textField_131 = new JTextField();
		textField_131.setHorizontalAlignment(SwingConstants.CENTER);
		textField_131.setColumns(10);
		textField_131.setBounds(163, 38, 37, 36);
		layeredPane_9.add(textField_131);
		
		textField_132 = new JTextField();
		textField_132.setHorizontalAlignment(SwingConstants.CENTER);
		textField_132.setColumns(10);
		textField_132.setBounds(214, 38, 37, 36);
		layeredPane_9.add(textField_132);
		
		textField_133 = new JTextField();
		textField_133.setHorizontalAlignment(SwingConstants.CENTER);
		textField_133.setColumns(10);
		textField_133.setBounds(265, 38, 37, 36);
		layeredPane_9.add(textField_133);
		
		textField_134 = new JTextField();
		textField_134.setHorizontalAlignment(SwingConstants.CENTER);
		textField_134.setColumns(10);
		textField_134.setBounds(316, 38, 37, 36);
		layeredPane_9.add(textField_134);
		
		textField_135 = new JTextField();
		textField_135.setHorizontalAlignment(SwingConstants.CENTER);
		textField_135.setColumns(10);
		textField_135.setBounds(367, 38, 37, 36);
		layeredPane_9.add(textField_135);
		
		textField_136 = new JTextField();
		textField_136.setHorizontalAlignment(SwingConstants.CENTER);
		textField_136.setColumns(10);
		textField_136.setBounds(418, 38, 37, 36);
		layeredPane_9.add(textField_136);
		
		textField_137 = new JTextField();
		textField_137.setHorizontalAlignment(SwingConstants.CENTER);
		textField_137.setColumns(10);
		textField_137.setBounds(470, 38, 37, 36);
		layeredPane_9.add(textField_137);
		
		textField_138 = new JTextField();
		textField_138.setHorizontalAlignment(SwingConstants.CENTER);
		textField_138.setColumns(10);
		textField_138.setBounds(521, 38, 37, 36);
		layeredPane_9.add(textField_138);
		
		textField_139 = new JTextField();
		textField_139.setHorizontalAlignment(SwingConstants.CENTER);
		textField_139.setColumns(10);
		textField_139.setBounds(572, 38, 37, 36);
		layeredPane_9.add(textField_139);
		
		button_8 = new JButton("수정");
		button_8.setBounds(623, 38, 109, 36);
		layeredPane_9.add(button_8);
	}

}
