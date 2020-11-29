package project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel mainLabel = new JLabel("\uC544\uC7AC\uAC1C\uADF8 \uD14C\uC2A4\uD2B8");
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setFont(new Font("휴먼편지체", Font.BOLD, 55));
		mainLabel.setBounds(0, 33, 732, 72);
		contentPane.add(mainLabel);
		
		JButton startButton = new JButton("Game Start!");
		startButton.setFont(new Font("Bauhaus 93", Font.PLAIN, 30));
		startButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setVisible(false);
				dispose();
				new GameAction(0, 0);
			}
		});
		startButton.setForeground(Color.BLACK);
		startButton.setBackground(SystemColor.info);
		startButton.setBounds(213, 602, 319, 72);
		contentPane.add(startButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/img/smile.jpg")));
		lblNewLabel.setBounds(158, 132, 425, 437);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\uAD00\uB9AC\uC790\uD654\uBA74");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new IdCheckPage().setVisible(true);
				dispose();
				setVisible(false);
			}
		});
		btnNewButton.setBounds(627, 676, 105, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\uD648\uC73C\uB85C");
		btnNewButton_1.setBounds(0, 676, 105, 27);
		contentPane.add(btnNewButton_1);
	}
}
