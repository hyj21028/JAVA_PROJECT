package Temple;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;



public class printbill extends JFrame  {
   
   static int total;
   static ArrayList <String> bname=new ArrayList<>();
   static ArrayList <String> bprice=new ArrayList<>();
   static ArrayList<Integer> totalprice = new ArrayList<>();
   printbill() {
      
      setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\billrg.png"));
      setTitle("영수증");
      getContentPane().setBackground(new Color(255, 245, 238));
      String source = null;
      String[] token = null;
      

      if(Frame.tablenumber==1) {source=basket.table1; basket.table1="";}
      if(Frame.tablenumber==2) {source=basket.table2; basket.table2="";}
      if(Frame.tablenumber==3) {source=basket.table3; basket.table3="";}
      if(Frame.tablenumber==4) {source=basket.table4; basket.table4="";}
      if(Frame.tablenumber==5) {source=basket.table5; basket.table5="";}
      if(Frame.tablenumber==6) {source=basket.table6; basket.table6="";}
      if(Frame.tablenumber==7) {source=basket.table7; basket.table7="";}
      if(Frame.tablenumber==8) {source=basket.table8; basket.table8="";}
      if(Frame.tablenumber==9) {source=basket.table9; basket.table9="";}
      if(Frame.tablenumber==10) {source=basket.table10; basket.table10="";}
      if(Frame.tablenumber==11) {source=basket.table11; basket.table11="";}
      if(Frame.tablenumber==12) {source=basket.table12; basket.table12="";}
      if(Frame.tablenumber==13) {source=basket.table13; basket.table13="";}
      if(Frame.tablenumber==14) {source=basket.table14; basket.table14="";}
      if(Frame.tablenumber==15) {source=basket.table15; basket.table15="";}
      if(Frame.tablenumber==16) {source=basket.table16; basket.table16="";}
      if(Frame.tablenumber==17) {source=basket.table17; basket.table17="";}
      if(Frame.tablenumber==18) {source=basket.table18; basket.table18="";}
     
      

      StringTokenizer st = new StringTokenizer(source, " \n");
      token = new String[st.countTokens()];
//      System.out.println(source);

      int j = 0;
      while (st.hasMoreTokens()) {
         token[j] = st.nextToken();
         j++;
      }

//      for(int i=0;i<token.length;i++)
//      {
//         System.out.println(token[i]);
//      }

      for (int i = 0; i < token.length; i++) {
         if (i % 2 == 0)
            bname.add(token[i]);
         else {
            bprice.add(token[i]);
         }
//         else if(i%2==0)
//            bname.add(token[i]);
//         else if(i%2==1)
//            bprice.add(token[i]);

      }

//      for(int i=0;i<bname.size();i++)
//      {
//         System.out.println(bname.get(i));
//      }
//      
//      for(int i=0;i<bprice.size();i++)
//      {
//         System.out.println(bprice.get(i));
//      }

      setBounds(100, 100, 293, 494);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      getContentPane().setLayout(null);
      
      JLabel label2 = new JLabel("JAVA\uC5D0 \uBE60\uC9C4\uB2ED!");
      label2.setHorizontalAlignment(SwingConstants.LEFT);
      label2.setFont(new Font("굴림", Font.BOLD, 24));
      label2.setBounds(82, 17, 186, 25);
      getContentPane().add(label2);
      
      JLabel label3 = new JLabel("\uBD80\uC0B0\uAD11\uC5ED\uC2DC \uBD80\uC0B0\uC9C4\uAD6C \uBD80\uC804\uB3D9 111 - 1");
      label3.setFont(new Font("굴림", Font.PLAIN, 11));
      label3.setBounds(82, 39, 186, 24);
      getContentPane().add(label3);

      JLabel label = new JLabel("\uACC4 \uC0B0 \uC11C");
      label.setFont(new Font("굴림", Font.BOLD, 22));
      label.setBounds(92, 87, 165, 25);
      getContentPane().add(label);

      JPanel panel = new JPanel();
      panel.setBorder(new LineBorder(new Color(0, 0, 0)));
      panel.setBackground(new Color(255, 245, 238));
      panel.setBounds(12, 122, 256, 300);
      getContentPane().add(panel);
      panel.setLayout(null);

      String orderlist = "<html>";
      for (int i = 0; i < bname.size(); i++) {
         orderlist += "<br>" + bname.get(i);
      }
      orderlist += "<html>";
      JLabel lblNewLabel = new JLabel(orderlist);
      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 12));
      lblNewLabel.setBackground(Color.GREEN);
      lblNewLabel.setBounds(12, 38, 76, 184);
      panel.add(lblNewLabel);

      String ordercount = "<html>";
      for (int i = 0; i < bprice.size(); i++) {
         ordercount += "<br>" + bprice.get(i);
      }
      ordercount += "<html>";
      JLabel label_2 = new JLabel(ordercount);
      label_2.setBounds(100, 38, 57, 184);
      panel.add(label_2);

      String price = "<html>";

      for (int i = 0; i < bname.size(); i++) {
         totalprice.add(menutype.menuname.get(bname.get(i)) * Integer.parseInt(bprice.get(i)));
         price += "<br>" + (menutype.menuname.get(bname.get(i)) * Integer.parseInt(bprice.get(i)));

      }
      price += "<html>";
      JLabel label_1 = new JLabel(price);
      label_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
      label_1.setBounds(192, 38, 64, 184);
      panel.add(label_1);

//      JLabel lblNewLabel_1 = new JLabel(Integer.toString(bill.totalprice));
//      lblNewLabel_1.setBounds(164, 275, 36, 15);
//      panel.add(lblNewLabel_1);

      JLabel lblNewLabel_2 = new JLabel("\uC8FC\uBB38\uB0B4\uC5ED");
      lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
      lblNewLabel_2.setBounds(12, 13, 52, 15);
      panel.add(lblNewLabel_2);

      JLabel label_3 = new JLabel("\uC8FC\uBB38\uC218\uB7C9");
      label_3.setFont(new Font("굴림", Font.BOLD, 12));
      label_3.setBounds(100, 13, 52, 15);
      panel.add(label_3);

      JLabel label_4 = new JLabel("\uAC1C\uBCC4\uAE08\uC561");
      label_4.setFont(new Font("굴림", Font.BOLD, 12));
      label_4.setBounds(192, 13, 52, 15);
      panel.add(label_4);

      JLabel label_5 = new JLabel("\uD569\uACC4");
      label_5.setFont(new Font("굴림", Font.BOLD, 12));
      label_5.setBounds(83, 260, 57, 15);
      panel.add(label_5);

      total = 0;
      for (int i = 0; i < totalprice.size(); i++) {
         total += totalprice.get(i);
      }

      JLabel label_6 = new JLabel(Integer.toString(total));
      label_6.setFont(new Font("굴림", Font.BOLD, 12));
      label_6.setBounds(152, 260, 57, 15);
      panel.add(label_6);
      
      JLabel label1 = new JLabel(" - \uAC10\uC0AC\uD569\uB2C8\uB2E4 - ");
      label1.setBounds(83, 285, 94, 15);
      panel.add(label1);
      label1.setFont(new Font("굴림", Font.PLAIN, 11));
      
      JLabel label4 = new JLabel("Tel. 051 - 123 - 4567");
      label4.setFont(new Font("굴림", Font.PLAIN, 11));
      label4.setBounds(82, 62, 119, 15);
      getContentPane().add(label4);
      
      JLabel lbIMGrg = new JLabel("");
      lbIMGrg.setIcon(new ImageIcon("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\LoginRg.png"));
      lbIMGrg.setBounds(12, 12, 65, 65);
      getContentPane().add(lbIMGrg);
      
      JButton btnReceipt = new JButton("\uC601\uC218\uC99D\uCD9C\uB825");
      btnReceipt.setForeground(Color.WHITE);
      btnReceipt.setBackground(Color.GRAY);
      btnReceipt.setBounds(82, 420, 107, 23);
      getContentPane().add(btnReceipt);
      btnReceipt.addActionListener(new ActionListener() {
         
         @Override
         public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String cmd =e.getActionCommand();
            if(cmd.trim().equals("영수증출력")) {
               dispose();
               new receipt();
            }
         }
      });
      
//      JButton btnBack = new JButton("\uB4A4\uB85C");
//      btnBack.setForeground(Color.WHITE);
//      btnBack.setBackground(Color.GRAY);
//      btnBack.setBounds(12, 422, 97, 23);
//      getContentPane().add(btnBack);
//      btnBack.addActionListener(new ActionListener() {
//         
//         @Override
//         public void actionPerformed(ActionEvent e) {
//            // TODO Auto-generated method stub
//            String cmd =e.getActionCommand();
//            if(cmd.trim().equals("뒤로")) {
//               dispose();
//               
//            }
//         }
//      });
//      
      setVisible(true);
   }

}

