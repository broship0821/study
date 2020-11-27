package ex44wb;
/*
버튼에 이미지 넣기
	1) c드라이브, d드라이브 컴폼더에있는 이미지를 넣으려면
		absolute path 선택한다
		방법은 design 왼쪽 속성창에서
		아이콘 - 삼점버튼 - absolute path... - browse
		- 이미지 선택 - 속성창 text에는 "이미지" 라는 글자 입력
		- 버튼 크기를 적당히 조절하면 이미지와 글씨가 잘 들어가 있는
		것을 보게된다.
	2) 만일 이클립스 src 아래에 만든 images 패키지방에서 이미지를
	가져와 넣으려면 아이콘 - 삼점버튼 - 맨위 classpath resource를
	선택한다 -> 배포할때는 이 방법이 더 좋음
	
	(참고) image 취소는 다시 삼점으로 들어가 no image 선택
*/
/*
	#### JToolbar

1) src - new - 패키지 하여 images 폴더 하나 준비한 후
그 안에 .png 파일들을 복사하여 넣는다

2) JToolbar를 design에 올리고
3) 버튼을 그 안에 넣는다
#. JButton을 드래그 드롭으로 넣은 후 속성창 icon에
classpath를 선택하여
color1.png를 넣고 text 부분의 new button 글자를 삭제한다
필요시 JToolbar의 행을 약간 늘려 크기를 맞춘다

#. 이어서 JButton을 추가한 후 같은 방법으로 만들어간다
4) 라벨을 하나 만들어 글자를 넣은 후
첫번쨰 툴바의 버튼 - 마오 - add event handler - ...
- mouse clicked .. 그리고 두번째 버튼 ~~~
5) 코딩한 후 만일 액박에 러시 JLabel questionLabel~~~ 문장을
상단에 올려 전역으로 만들면 된다.
*/
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ImgButton_JToolbar extends JFrame {

	private JPanel contentPane;
	JLabel label = new JLabel("오저치고?");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ImgButton_JToolbar frame = new ImgButton_JToolbar();
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
	public ImgButton_JToolbar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 376);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(38, 61, 536, 72);
		contentPane.add(toolBar);
		
		JButton button00 = new JButton("");
		button00.setToolTipText("민트색");
		button00.addMouseListener(new MouseAdapter() {//addMouseListener -> 마우스 액션 등록 메소드, MouseAdapter -> 여러 마우스 액션 중 하나만 사용하게끔 도와줌
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setForeground(Color.CYAN);//마우스 클릭 이벤트 발생 시 라벨 색갈 변함
			}
		});
		button00.setIcon(new ImageIcon(ImgButton_JToolbar.class.getResource("/img/iconmonstr-paintbrush-3-48.png")));
		toolBar.add(button00);
		
		JButton button = new JButton("");
		button.setToolTipText("퍼런색");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setForeground(Color.blue);
			}
		});
		button.setIcon(new ImageIcon(ImgButton_JToolbar.class.getResource("/img/iconmonstr-paintbrush-4-48.png")));
		toolBar.add(button);
		
		JButton button02 = new JButton("");
		button02.setToolTipText("대따커짐");
		button02.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setFont(new Font("굴림", Font.BOLD, 35));
			}
		});
		button02.setIcon(new ImageIcon(ImgButton_JToolbar.class.getResource("/img/iconmonstr-text-1-48.png")));
		toolBar.add(button02);
		
		JButton button03 = new JButton("");
		button03.setToolTipText("원래대로");
		button03.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				label.setFont(new Font("굴림", Font.PLAIN, 15));
			}
		});
		button03.setIcon(new ImageIcon(ImgButton_JToolbar.class.getResource("/img/iconmonstr-text-1-48 (1).png")));
		toolBar.add(button03);
		
		JButton button04 = new JButton("");
		button04.setToolTipText("나가기");
		button04.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				System.exit(0);
			}
		});
		button04.setBounds(635, 64, 55, 55);
		contentPane.add(button04);
		button04.setIcon(new ImageIcon(ImgButton_JToolbar.class.getResource("/img/iconmonstr-door-5-48.png")));
		
		
		label.setFont(new Font("굴림", Font.PLAIN, 20));
		label.setBounds(270, 180, 242, 47);
		contentPane.add(label);
	}

}
