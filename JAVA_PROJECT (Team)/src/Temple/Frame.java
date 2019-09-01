package Temple;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Frame extends JFrame {
	public static int tablenumber;
	private JPanel pnIcon, pnTable;
	private JButton btnTable1, btnTable2, btnTable3, btnTable4, btnTable5, btnTable6, btnTable7, btnTable8,
	btnTable9,btnTable10,btnTable11,btnTable12,btnTable13,btnTable14,btnTable15,btnTable16,btnTable17,btnTable18;
	private LoginFrame loginFrame;
	private JButton btnSales;

	public Frame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\LoginRg.png"));
		getContentPane().setBackground(new Color(255, 245, 238));

		new menutype();

		setTitle("테이블현황");
		setBounds(100, 100, 451, 352);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		pnIcon = new JPanel();
		pnIcon.setBackground(new Color(255, 245, 238));
		pnIcon.setBounds(0, 0, 467, 374);
		getContentPane().add(pnIcon);
		pnIcon.setLayout(null);

		pnTable = new JPanel();
		pnTable.setBorder(new TitledBorder(null, "Table", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GRAY));
		pnTable.setBounds(12, 10, 412, 301);
		pnIcon.add(pnTable);
		pnTable.setBackground(new Color(255, 245, 238));
		pnTable.setLayout(null);

		btnTable1 = new JButton("A");
		btnTable1.setForeground(Color.WHITE);
		btnTable1.setBackground(Color.GRAY);
		btnTable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 1;
				new order();
			}
		});

		btnTable1.setBounds(34, 28, 97, 34);
		pnTable.add(btnTable1);

		btnTable2 = new JButton("B");
		btnTable2.setForeground(Color.WHITE);
		btnTable2.setBackground(Color.GRAY);
		btnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 2;
				new order();
			}
		});
		btnTable2.setBounds(157, 28, 97, 34);
		pnTable.add(btnTable2);

		btnTable3 = new JButton("C");
		btnTable3.setForeground(Color.WHITE);
		btnTable3.setBackground(Color.GRAY);
		btnTable3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 3;
				new order();
			}
		});
		btnTable3.setBounds(34, 72, 97, 34);
		pnTable.add(btnTable3);

		btnTable4 = new JButton("D");
		btnTable4.setForeground(Color.WHITE);
		btnTable4.setBackground(Color.GRAY);
		btnTable4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 4;
				new order();
			}
		});
		btnTable4.setBounds(157, 72, 97, 34);
		pnTable.add(btnTable4);

		btnTable5 = new JButton("E");
		btnTable5.setForeground(Color.WHITE);
		btnTable5.setBackground(Color.GRAY);
		btnTable5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 5;
				new order();
			}
		});
		btnTable5.setBounds(34, 116, 97, 34);
		pnTable.add(btnTable5);

		btnTable6 = new JButton("F");
		btnTable6.setForeground(Color.WHITE);
		btnTable6.setBackground(Color.GRAY);
		btnTable6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 6;
				new order();
			}
		});
		btnTable6.setBounds(157, 116, 97, 34);
		pnTable.add(btnTable6);

		btnTable7 = new JButton("G");
		btnTable7.setBackground(Color.GRAY);
		btnTable7.setForeground(Color.WHITE);
		btnTable7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 7;
				new order();
			}
		});
		btnTable7.setBounds(34, 160, 97, 34);
		pnTable.add(btnTable7);

		btnTable8 = new JButton("H");
		btnTable8.setForeground(Color.WHITE);
		btnTable8.setBackground(Color.GRAY);
		// btnTable8.setBackground(Color.WHITE);
		btnTable8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 8;
				new order();
			}
		});
		btnTable8.setBounds(157, 160, 97, 34);
		pnTable.add(btnTable8);
		
		JButton btnTable9 = new JButton("I");
		btnTable9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 9;
				new order();
			}
		});
		btnTable9.setForeground(Color.WHITE);
		btnTable9.setBackground(Color.GRAY);
		btnTable9.setBounds(34, 206, 97, 34);
		pnTable.add(btnTable9);
		
		JButton btnTable10 = new JButton("J");
		btnTable10.setForeground(Color.WHITE);
		btnTable10.setBackground(Color.GRAY);
		btnTable10.setBounds(157, 206, 97, 34);
		pnTable.add(btnTable10);
		btnTable10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 10;
				new order();
			}
		});
		
		JButton btnTable11 = new JButton("K");
		btnTable11.setForeground(Color.WHITE);
		btnTable11.setBackground(Color.GRAY);
		btnTable11.setBounds(34, 252, 97, 34);
		pnTable.add(btnTable11);
		btnTable11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 11;
				new order();
			}
		});
		
		JButton btnTable12 = new JButton("L");
		btnTable12.setForeground(Color.WHITE);
		btnTable12.setBackground(Color.GRAY);
		btnTable12.setBounds(157, 252, 97, 34);
		pnTable.add(btnTable12);
		btnTable12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 12;
				new order();
			}
		});
		
		JButton btnTable13 = new JButton("M");
		btnTable13.setForeground(Color.WHITE);
		btnTable13.setBackground(Color.GRAY);
		btnTable13.setBounds(279, 28, 97, 34);
		pnTable.add(btnTable13);
		btnTable13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 13;
				new order();
			}
		});
		
		JButton btnTable14 = new JButton("N");
		btnTable14.setForeground(Color.WHITE);
		btnTable14.setBackground(Color.GRAY);
		btnTable14.setBounds(279, 75, 97, 34);
		pnTable.add(btnTable14);
		btnTable14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 14;
				new order();
			}
		});
		
		JButton btnTable15 = new JButton("O");
		btnTable15.setForeground(Color.WHITE);
		btnTable15.setBackground(Color.GRAY);
		btnTable15.setBounds(279, 119, 97, 34);
		pnTable.add(btnTable15);
		btnTable15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 15;
				new order();
			}
		});
		
		JButton btnTable16 = new JButton("P");
		btnTable16.setForeground(Color.WHITE);
		btnTable16.setBackground(Color.GRAY);
		btnTable16.setBounds(279, 163, 97, 34);
		pnTable.add(btnTable16);
		btnTable16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 16;
				new order();
			}
		});
		
		JButton btnTable17 = new JButton("Q");
		btnTable17.setForeground(Color.WHITE);
		btnTable17.setBackground(Color.GRAY);
		btnTable17.setBounds(279, 209, 97, 34);
		pnTable.add(btnTable17);
		btnTable17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 17;
				new order();
			}
		});
		
		JButton btnTable18 = new JButton("R");
		btnTable18.setForeground(Color.WHITE);
		btnTable18.setBackground(Color.GRAY);
		btnTable18.setBounds(279, 252, 97, 34);
		pnTable.add(btnTable18);
		btnTable18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tablenumber = 18;
				new order();
			}
		});
		
//		btnSales = new JButton("\uB9E4\uCD9C\uD604\uD669");
//		btnSales.setForeground(Color.WHITE);
//		btnSales.setBackground(Color.GRAY);
//		btnSales.setBounds(96, 206, 98, 28);
//		pnTable.add(btnSales);
//		
//		btnSales.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				String cmd = e.getActionCommand();
//				if(cmd.trim().equals("������Ȳ")) {
//					dispose();
//				//	new totalsales();
//				}
//			}
//		});
//		
		
		setVisible(true);

	}

	public static void main(String[] args) {
		// new Frame();
	}
}
