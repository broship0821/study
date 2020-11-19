package ex44wb;
/*
#########JList

-. JScrollpane 놓고 그위에 JList 놓는다
이것이 잘 안되면 먼저 JList를 만들고
왼쪽 Structure 창 JList에 마우스놓고
-마오- surround with - JScrollpane을 선택 하면 조금 편리하다

-.selectionMode를 선택
예) single_SELECTION

-. visible rowcount 를 선택
예) 5개

-. 이벤트에서 listSelection - valueChanged 선택
*/
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.AbstractListModel;

public class JList extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JList frame = new JList();
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
	public JList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 61, 203, 106);
		contentPane.add(scrollPane);
		
		javax.swing.JList list = new javax.swing.JList();
		list.setModel(new AbstractListModel() {
			//model에서 설정
			String[] values = new String[] {"한우", "햄버거", "육회", "감자튀김", "피자", "비빔면", "양꼬치", "마라탕"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {//선택된 값이 바뀌면 이벤트 발생
				if(arg0.getSource()==list) {
					int size = list.getModel().getSize();//JList전체 갯수 구하는법
					int index = list.getSelectedIndex(); //선택된 index 구하기
					String indexElement=(String)list.getModel().getElementAt(index); //선택된 값 구하기
					JOptionPane.showMessageDialog(null, "전체갯수는 "+String.valueOf(size)+" 선택된 element는 "+indexElement);
				}
			}
		});
		list.setVisibleRowCount(5);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);
	}

}
