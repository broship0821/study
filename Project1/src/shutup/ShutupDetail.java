package shutup;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;


public class ShutupDetail extends JFrame {

   private JPanel contentPane;
   Timer time;
   int idx = 0;

   private int imageWidth = 773;
   private int imageHeight = 386;
   private DrawPanel pnlImageg;
   private JTextArea txtInfo; 

   private ArrayList<BufferedImage> lstImages;
   private String info;
   private JButton btnNewButton;
   private JButton btnPause;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               ShutupDetail frame = new ShutupDetail();
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
   public ShutupDetail() {
	   
      // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      setBounds(100, 100, 1024, 800);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

      pnlImageg = new DrawPanel(imageWidth, imageHeight);
      pnlImageg.setBorder(new EmptyBorder(5, 5, 5, 5)); // new BevelBorderimageWidth(BevelBorder.LOWERED, null, null,
                                                        // null, null));
      pnlImageg.setBounds(85, 27, imageWidth, imageHeight);
      contentPane.add(pnlImageg);

      txtInfo = new JTextArea();
      txtInfo.setFont(new Font("Monospaced", Font.PLAIN, 25));
      txtInfo.setBounds(88, 461, 760, 230);
      contentPane.add(txtInfo);
      
      btnNewButton = new JButton("닫기");
      
      // 닫기
      btnNewButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            dispose();
         }
      });
      btnNewButton.setFont(new Font("굴림", Font.PLAIN, 25));
      btnNewButton.setBounds(859, 63, 126, 64);
      contentPane.add(btnNewButton);
      
      btnPause = new JButton("멈춤");
      
      // 멈춤
      btnPause.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
         }
      });
      btnPause.setFont(new Font("굴림", Font.PLAIN, 25));
      btnPause.setBounds(859, 154, 126, 64);
      contentPane.add(btnPause);
   }

   public ShutupDetail(ArrayList<BufferedImage> lstImages, String info) {
      this();

      this.lstImages = lstImages;
      this.info = info;
      time = new Timer(1000, new ActionListener() {
  		
  		@Override
  		public void actionPerformed(ActionEvent e) {
  			BufferedImage image = lstImages.get(idx++);
  			pnlImageg.setImage(image);
  			if(idx==4) {
  				idx = 0;
  			}
  		}
  	});
      time.start();
      txtInfo.setText(info);
   }
}

// ---------------------------------------------------------------

class DrawPanel extends JPanel {

   BufferedImage image = null; // new BufferedImage(10, 10, BufferedImage.TYPE_BYTE_GRAY);

   public DrawPanel(int width, int height) {
      setPreferredSize(new Dimension(width, height));
   }

   public void setImage(BufferedImage image) {
      this.image = image;
      repaint();
   }

   // 출처: http://blog.naver.com/PostView.nhn?blogId=lobolook&logNo=220022598513
   @Override
   public void paint(Graphics g) {
      if(image != null) {
         g.drawImage(image, 0, 0, null);
      }
   }

//   @Override
//   public void paintComponent(Graphics g) {
//       super.paintComponent(g);
//       
//       if(image != null) {
//          g = image.getGraphics();
//          g.drawImage(image, 0, 0, null);
//          System.out.println("paintComponent: " + image.getWidth() + " X " + image.getHeight());
//       }
//       else {
//          System.out.println("...image is null.");
//       }
//   }

}