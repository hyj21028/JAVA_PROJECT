package Temple;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class receipt extends JFrame {

   private JPanel contentPane;
   private printbill print;
   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
//               receipt frame = new receipt();
//               frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   /**
    * Create the frame.
    */
   public receipt() {
      
      setTitle("영수증 출력");
      setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\LoginRg.png"));
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 255, 166);
      
      contentPane = new JPanel();
      contentPane.setBackground(new Color(255, 245, 238));
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(new FlowLayout());
      
      JPanel pnQuestion = new JPanel();
      pnQuestion.setBackground(new Color(255, 245, 238));
      contentPane.add(pnQuestion);
      
      JLabel laQuestion = new JLabel("\uC601\uC218\uC99D \uCD9C\uB825\uD569\uB2C8\uAE4C?");
      laQuestion.setBackground(new Color(255, 218, 185));
      pnQuestion.add(laQuestion);
      
      JPanel pnBtn = new JPanel();
      contentPane.add(pnBtn);
      
      JButton btnYes = new JButton("\uC608");
      pnBtn.add(btnYes);
      btnYes.setForeground(Color.WHITE);
      btnYes.setBackground(Color.GRAY);
      
      JButton btnNo = new JButton("\uC544\uB2C8\uC624");
      pnBtn.add(btnNo);
      btnNo.setForeground(Color.WHITE);
      btnNo.setBackground(Color.GRAY);
      
      btnYes.addActionListener(new MyListener());
      btnNo.addActionListener(new MyListener());   
      
      setVisible(true);
      }
   class MyListener implements ActionListener{

      @Override
      public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
         String cmd = e.getActionCommand();
         String msg= "";
         if(cmd.trim().equals("예")){
            msg="출력합니다";
            
            String fileNm = "C:\\Users\\it\\Desktop\\JAVA\\Receipt.txt";
            File file = new File(fileNm);
            
            FileWriter fw = null;
      
            try {
               fw = new FileWriter(file.getPath());
               
               for(int i=0;i<printbill.bname.size();i++)
               {
               fw.write(printbill.bname.get(i)+"\t"+printbill.bprice.get(i)+"\t"+printbill.totalprice.get(i)+"\r\n");
               }
               fw.write("총합:\t\t"+Integer.toString(printbill.total));
               fw.flush();
               fw.close();
               dispose();
            }catch(Exception e2) {}
               
         }else if(cmd.trim().equals("아니오")) {
            msg = "출력하지 않습니다";
            dispose();
         }
         JOptionPane.showMessageDialog(null, msg);
         switch(cmd) {
         case "예":
            msg = "영수증을 출력합니다."; break;
         case "아니오":
            msg = "영수증을 출력하지 않습니다"; break;
         }
      }
   }
}
            
         
