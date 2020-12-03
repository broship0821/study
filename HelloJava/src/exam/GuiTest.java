package exam;

import javax.swing.JFrame;

class GoodBurger extends JFrame {
	
	//필드들

	
	
	//생성자
	public GoodBurger() {
		setTitle("어서오세요 굿버거입니다");
		setLayout(null);
	}
	

}

public class GuiTest {
	public static void main(String[] args) {
		new GoodBurger().setVisible(true);;

	}
}
