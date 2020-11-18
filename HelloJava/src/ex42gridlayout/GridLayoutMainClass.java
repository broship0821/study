package ex42gridlayout;
//AWT 사용
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GridLayoutMainClass extends Frame {
	
	public GridLayoutMainClass() {
		// 자동주문기계에서 화면 구성하기 Grid: 격자
		this.setLayout(new GridLayout(2,3, 5, 5)); //2행 3열로 -> 간격 없음
		//this.setLayout(new GridLayout(2,3,10,10)); -> 간격 10 10 (margin)
		//GridLayout(2,3,30,30) 2행 3열이면서 -> 간격은 30,30
		//GridLayout(0,3) 0이면 개수만큼 알아서 정해라 (12가 들어오면 4가됨)
		//.setLayout(null) null값 주면 개발자 임의대로 (absolute layout)
		this.add(new Button("눌러1"));
		this.add(new Button("눌러2"));
		this.add(new Button("눌러3"));
		this.add(new Button("눌러4"));
		this.add(new Button("눌러5"));
		this.add(new Button("눌러6"));
		
		this.setSize(300,300);
		this.setVisible(true);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e1) { //창문닫기 메소드
				dispose();
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		GridLayoutMainClass flc1 = new GridLayoutMainClass();

	}

}
