package mainproject.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class MainPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage frame = new MainPage();
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
	public MainPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\uC2EC\uC2EC\uD574\uB2F7\uCEF4");
		lblNewLabel.setBounds(49, 32, 131, 47);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\uC544");
		lblNewLabel_1.setBounds(219, 46, 62, 18);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblC = new JLabel("c");
		lblC.setBounds(335, 46, 62, 18);
		contentPane.add(lblC);
		
		JLabel label_1 = new JLabel("\uB098");
		label_1.setBounds(445, 46, 62, 18);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\uC5F0");
		label_2.setBounds(571, 46, 62, 18);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\uC544");
		label_3.setBounds(96, 153, 62, 18);
		contentPane.add(label_3);
		
		JLabel lblC_1 = new JLabel("c");
		lblC_1.setBounds(96, 225, 62, 18);
		contentPane.add(lblC_1);
		
		JLabel label_5 = new JLabel("\uB098");
		label_5.setBounds(96, 305, 62, 18);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\uC5F0");
		label_6.setBounds(96, 398, 62, 18);
		contentPane.add(label_6);
	}

}
