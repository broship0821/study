package ex45GUI2;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

public class ElectronicDisplay_GUI2 {
    //ElectronicDisplay_GUI2.java
public static void main(String args[]) {
     new EDisplay();
    }
}

class EDisplay extends Frame implements ActionListener{
        static int sw=0;////////
        
        static String s1 = "           I LOVE YOU";//////////
        Timer t1 = new Timer ();//back ground thread 임
        //////////
        ///GUI
        private Button b1 = new Button ("시~작~");
        private Button b2 = new Button ("끄~");
        private TextField tf1 = new TextField();//글상자
        
        public EDisplay() {
			this.setLayout(null); //AbsoluteLayout으로 하겠다
			
			b1.setSize(200,70);
			b1.setForeground(new Color(0,0,255));
			b1.setBackground(new Color(255,180,100));
			b1.setFont(new Font("돋움", Font.BOLD, 20));
			b1.setLocation(150,200);
			this.add(b1);
			b1.addActionListener(this); //이벤트 등록
			
			//------------------b2-----------------------
			b2.setSize(200,70);//버튼 크기
	        b2.setForeground(new Color(0,0,255));
	        b2.setBackground(new Color(255,180,100));
	        b2.setFont(new Font("돋움",Font.BOLD,20));
	        b2.setLocation(150,300); //버튼 내부위치 
		    this.add(b2);//버튼 추가 
	        b2.addActionListener(this); ///버튼 이벤트를 위하여 이벤트등록 

	        tf1.setSize(400,50);
		    tf1.setForeground(new Color(0,0,255));
		    tf1.setBackground(new Color(255,255,0));
	        tf1.setFont(new Font("굴림",Font.BOLD,35));
		    tf1.setLocation(30, 70);//텍스트 내부위치 
		    this.add(tf1); 
		    
		
		    this.setBackground(new Color(0,200,0)); 
		    this.setTitle("자바는 FUN FUN FUN !!!!!!");
		    this.setSize(460, 400); //프레임 크기
		    this.setVisible(true);
		  
		    addWindowListener(new WindowAdapter(){ //////////////////
		    	 public void windowClosing(WindowEvent e1){
		    		 dispose();
		    		 System.exit(0);
		    	 }
		    });
	  }//생성자-end
        
		@Override
		public void actionPerformed(ActionEvent arg0) { //ActionEvent arg0-> 발생된 이벤트
			if(arg0.getSource()==b1 && sw==0) {//시작버튼이 눌어졌으면(이벤트) 방금 발생한 이벤트가 b1이냐?
//				b1.setEnabled(false); //아이콘을 반투명으로(버튼을 눌러도 무반응)
//				b1.setVisible(false); //버튼 아예 안보임
				
				//scheduleAtFixedRate(인자1,인자2,인자3);
				t1.scheduleAtFixedRate(new TimerTask() {//타이머는 쓰레드 출신
					
					@Override
					public void run() { //새로운 쓰레드 추가
						s1=s1.substring(1,s1.length()) + s1.substring(0,1);
						//s1의 1~마지막 + s1의 0번째
						//LOVE -> OVEL 이렇게됨
						
						
						tf1.setText(s1);//화면출력
						
					} //run-end
				}, 0, 250);//0초 delay후 가동 //// schedule-end
				//시작한지 0초 지나고 250밀리세컨드(1/4초)지날때 마다 run() 실행
				
			}//if-end
//			t1.schedule도 좋다
			sw=1; //시작버튼이 한번만 작동되게
			if(arg0.getSource()==b2) {//끝 버튼이 눌러졌으면(이벤트)
				t1.cancel();//타이머 끝
				
			}
			
		}
}