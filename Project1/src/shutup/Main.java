package shutup;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
   
   private static Main mainForm;
   Timer time;

   public static Main getMainForm() {
      return mainForm;
   }

   public static void setMainForm(Main mainForm) {
      Main.mainForm = mainForm;
   }

   private JPanel contentPane;
   private JCheckBox cbocPart001 = new JCheckBox("상체 전면");
   private JCheckBox cbocPart002 = new JCheckBox("상체 후면");
   private JCheckBox cbocPart003 = new JCheckBox("어깨");
   private JCheckBox cbocPart004 = new JCheckBox("삼두");
   private JCheckBox cbocPart005 = new JCheckBox("이두");
   private JCheckBox cbocPart006 = new JCheckBox("상체 전면");
   private JCheckBox cbocPart007 = new JCheckBox("후면 허리");
   private JCheckBox cbocPart008 = new JCheckBox("전면 복근");
   private JCheckBox cbocPart009 = new JCheckBox("하체 후면 둔근");
   private JCheckBox cbocPart010 = new JCheckBox("하체 전면 대퇴부");

   private JCheckBox[] arrChkBoxs = new JCheckBox[] {
         cbocPart001, 
         cbocPart002, 
         cbocPart003, 
         cbocPart004, 
         cbocPart005, 
         cbocPart006, 
         cbocPart007, 
         cbocPart008, 
         cbocPart009, 
         cbocPart010 
   };
   
   private JTextField textField;
   private final JButton btnJiWoong = new JButton("지웅아!!!");

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
	   
      // Main instance 저장
      setMainForm(this);
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(0, 0, 1920, 1080);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 694, 90);
      contentPane.add(panel);
      panel.setLayout(null);
      
      JLabel lblTitle = new JLabel("닭치고 스쿼트");
      lblTitle.setFont(new Font("굴림", Font.BOLD, 60));
      lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
      lblTitle.setBounds(55, 0, 571, 72);
      panel.add(lblTitle);
      
      JButton btnLogin = new JButton("Login");
      
      // login 버튼 클릭
      btnLogin.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
//            Login login = new Login(Main.getMainForm());
//            login.setVisible(true);
         }
      });
      btnLogin.setBounds(757, 15, 147, 33);
      contentPane.add(btnLogin);
      
      JPanel panel_1 = new JPanel();
      panel_1.setBounds(10, 108, 1846, 837);
      contentPane.add(panel_1);
      panel_1.setLayout(null);
      
      JLabel lblKindOfPart = new JLabel("운동부위");
      lblKindOfPart.setHorizontalAlignment(SwingConstants.LEFT);
      lblKindOfPart.setFont(new Font("굴림", Font.BOLD, 40));
      lblKindOfPart.setBounds(19, 0, 571, 56);
      panel_1.add(lblKindOfPart);
      
      // JCheckBox cbocPart001 = new JCheckBox("상체 전면");
      cbocPart001.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart001.setBounds(19, 94, 322, 56);
      panel_1.add(cbocPart001);
      
      // JCheckBox cbocPart002 = new JCheckBox("상체 후면");
      cbocPart002.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart002.setBounds(402, 94, 322, 56);
      panel_1.add(cbocPart002);
      
      // JCheckBox cbocPart003 = new JCheckBox("어깨");
      cbocPart003.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart003.setBounds(772, 94, 322, 56);
      panel_1.add(cbocPart003);
      
      // JCheckBox cbocPart004 = new JCheckBox("삼두");
      cbocPart004.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart004.setBounds(1105, 94, 322, 56);
      panel_1.add(cbocPart004);
      
      // JCheckBox cbocPart005 = new JCheckBox("이두");
      cbocPart005.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart005.setBounds(1447, 94, 322, 56);
      panel_1.add(cbocPart005);
      
      // JCheckBox cbocPart006 = new JCheckBox("상체 전면");
      cbocPart006.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart006.setBounds(-351, 208, 322, 56);
      panel_1.add(cbocPart006);
      
      // JCheckBox cbocPart007 = new JCheckBox("후면 허리");
      cbocPart007.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart007.setBounds(32, 309, 322, 56);
      panel_1.add(cbocPart007);
      
      // JCheckBox cbocPart008 = new JCheckBox("전면 복근");
      cbocPart008.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart008.setBounds(402, 208, 322, 56);
      panel_1.add(cbocPart008);
      
      // JCheckBox cbocPart009 = new JCheckBox("하체 후면 둔근");
      cbocPart009.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart009.setBounds(772, 208, 422, 56);
      panel_1.add(cbocPart009);
      
      // JCheckBox cbocPart010 = new JCheckBox("하체 전면 대퇴부");
      cbocPart010.setFont(new Font("굴림", Font.PLAIN, 50));
      cbocPart010.setBounds(1244, 208, 429, 56);
      panel_1.add(cbocPart010);
      
      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(32, 411, 1795, 408);
      panel_1.add(scrollPane);
      
      JTable table = new JTable();
      scrollPane.setViewportView(table);
      
      JButton btnSearch = new JButton("처방 검색");
      btnSearch.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            searchAndPutResult();
         }
      });
      btnSearch.setFont(new Font("굴림", Font.PLAIN, 40));
      btnSearch.setBounds(1569, 345, 258, 56);
      panel_1.add(btnSearch);
      
      // 지웅아!!!
      btnJiWoong.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            String[] imageFiles = {
                  "D:/tmp/1.jpg",
                  "D:/tmp/2.jpg",
                  "D:/tmp/3.jpg",
                  "D:/tmp/4.jpg"
            };
            ArrayList<BufferedImage> lstImages = readImages(imageFiles);
            String info = "어떻게 운동해야 하나요\n 닥치고 스쿼트!!!\nOh my God!!!\n\n\n 끝";
            ShutupDetail shutup = new ShutupDetail(lstImages, info);
            shutup.setVisible(true);
         }
      });
      btnJiWoong.setBounds(17, 376, 265, 50);
      
      panel_1.add(btnJiWoong);
      
      textField = new JTextField();
      textField.setFont(new Font("굴림", Font.PLAIN, 30));
      textField.setBounds(0, 942, 1896, 74);
      contentPane.add(textField);
      textField.setColumns(10);
   }

   // 기능: 처방 검색 및 결과 출력
   public void searchAndPutResult() {
      ArrayList<String> lstKeyWords = new ArrayList<>();
      
      for(JCheckBox chk : arrChkBoxs) {
         if(chk.isSelected()) {
            lstKeyWords.add(chk.getText());
         }
      }
      
      ArrayList result = search(lstKeyWords);
      showMsg(lstKeyWords.toString());
   }

   // 기능: DB에서 조건에 대한 결과를 검색한다. 
   public ArrayList search(ArrayList<String> lstKeyWords) {
      return null;
   }

   // 기능: 하단 메시자 창에 메시지를 출력한다.
   public void showMsg(String msg) {
      textField.setText(msg);      
   }

   // Login 화면에서 Login 성공시 불리는 Method. 이곳ㅇ[ㅔ서 Login 된 사용자 정보를 보관한다.
   public void addLoginUser(String userId) {
      System.out.println(userId);
      showMsg(userId);
   }

   // 기능: File에서 Image들을 불러 응답한다.
   public ArrayList<BufferedImage> readImages(String[] imageFiles) {
      ArrayList<BufferedImage> result = new ArrayList<BufferedImage>();
      
      if(imageFiles != null) {
         for(String fileName : imageFiles) {
            fileName = fileName.trim();
            
            if(!"".equals(fileName)) {
               File fi = new File(fileName);
               BufferedImage img = null;
               
               try {
                  img = ImageIO.read(fi);
                  if(img != null) {
                     result.add(img);
                  }
               } catch (IOException ex) {
                  ex.printStackTrace();
               }
            }
         }
      }
      
      return result;
   }

}