package ChickenProject;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class Frame extends JFrame {
	public static int tablenumber;
	private JPanel pnIcon, pnTableSet;
	private JButton btnTable1, btnTable2, btnTable3, btnTable4, btnTable5, btnTable6, btnTable7, btnTable8, btnTable9,
			btnTable10, btnTable11, btnTable12, btnTable13, btnTable14, btnTable15, btnTable16, btnTable17, btnTable18;
	private LoginFrame loginFrame;

	private JButton btnTableSet, btnReceipt, btnSales, btnOrder;

	private JButton[] table = { btnTable1, btnTable2, btnTable3, btnTable4, btnTable5, btnTable6, btnTable7, btnTable8,
			btnTable9, btnTable10, btnTable11, btnTable12, btnTable13, btnTable14, btnTable15, btnTable16, btnTable17,
			btnTable18 };

	int TableCount;
	private JTable tbOrder, maintable;
	private JScrollPane scMain, scSide;
	private JTabbedPane tpSales;
	Frame frame;

	void setTableCount(int tc) {
		this.TableCount = tc;
	}

	public Frame(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;

		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\LoginRg.png"));
		getContentPane().setBackground(new Color(255, 245, 238));

		setTitle("테이블 현황");
		setBounds(100, 100, 847, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		pnIcon = new JPanel();
		pnIcon.setBackground(new Color(255, 245, 238));
		pnIcon.setBounds(0, 0, 831, 674);
		getContentPane().add(pnIcon);
		pnIcon.setLayout(null);

		pnTableSet = new JPanel();
		pnTableSet.setBorder(new TitledBorder(null, "Table", TitledBorder.LEFT, TitledBorder.TOP, null, Color.GRAY));
		pnTableSet.setBounds(12, 10, 409, 310);
		pnIcon.add(pnTableSet);
		pnTableSet.setBackground(new Color(255, 245, 238));
		pnTableSet.setLayout(null);

		btnTable1 = new JButton("A");
		btnTable1.setForeground(Color.WHITE);
		btnTable1.setBackground(Color.GRAY);
		btnTable1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("A")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable1.setBounds(34, 28, 97, 34);
		pnTableSet.add(btnTable1);

		btnTable2 = new JButton("B");
		btnTable2.setForeground(Color.WHITE);
		btnTable2.setBackground(Color.GRAY);
		btnTable2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("B")) {
					new OrderSheet(frame);
				}

			}

		});
		btnTable2.setBounds(157, 28, 97, 34);
		pnTableSet.add(btnTable2);

		btnTable3 = new JButton("C");
		btnTable3.setForeground(Color.WHITE);
		btnTable3.setBackground(Color.GRAY);
		btnTable3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("C")) {
					new OrderSheet(frame);
				}

			}
		});
		btnTable3.setBounds(34, 72, 97, 34);
		pnTableSet.add(btnTable3);

		btnTable4 = new JButton("D");
		btnTable4.setForeground(Color.WHITE);
		btnTable4.setBackground(Color.GRAY);
		btnTable4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("D")) {
					new OrderSheet(frame);
				}

			}
		});
		btnTable4.setBounds(157, 72, 97, 34);
		pnTableSet.add(btnTable4);

		btnTable5 = new JButton("E");
		btnTable5.setForeground(Color.WHITE);
		btnTable5.setBackground(Color.GRAY);
		btnTable5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("E")) {
					new OrderSheet(frame);
				}

			}
		});
		btnTable5.setBounds(34, 116, 97, 34);
		pnTableSet.add(btnTable5);

		btnTable6 = new JButton("F");
		btnTable6.setForeground(Color.WHITE);
		btnTable6.setBackground(Color.GRAY);
		btnTable6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("F")) {
					new OrderSheet(frame);
				}

			}
		});
		btnTable6.setBounds(157, 116, 97, 34);
		pnTableSet.add(btnTable6);

		btnTable7 = new JButton("G");
		btnTable7.setBackground(Color.GRAY);
		btnTable7.setForeground(Color.WHITE);
		btnTable7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("G")) {
					new OrderSheet(frame);
				}

			}
		});
		btnTable7.setBounds(34, 160, 97, 34);
		pnTableSet.add(btnTable7);

		btnTable8 = new JButton("H");
		btnTable8.setForeground(Color.WHITE);
		btnTable8.setBackground(Color.GRAY);
		// btnTable8.setBackground(Color.WHITE);
		btnTable8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("H")) {
					new OrderSheet(frame);
				}

			}
		});
		btnTable8.setBounds(157, 160, 97, 34);
		pnTableSet.add(btnTable8);

		btnTable9 = new JButton("I");
		btnTable9.setForeground(Color.WHITE);
		btnTable9.setBackground(Color.GRAY);
		btnTable9.setBounds(34, 206, 97, 34);
		pnTableSet.add(btnTable9);
		btnTable9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("I")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable10 = new JButton("J");
		btnTable10.setForeground(Color.WHITE);
		btnTable10.setBackground(Color.GRAY);
		btnTable10.setBounds(157, 206, 97, 34);
		pnTableSet.add(btnTable10);
		btnTable10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("J")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable11 = new JButton("K");
		btnTable11.setForeground(Color.WHITE);
		btnTable11.setBackground(Color.GRAY);
		btnTable11.setBounds(34, 252, 97, 34);
		pnTableSet.add(btnTable11);
		btnTable11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("K")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable12 = new JButton("L");
		btnTable12.setForeground(Color.WHITE);
		btnTable12.setBackground(Color.GRAY);
		btnTable12.setBounds(157, 252, 97, 34);
		pnTableSet.add(btnTable12);
		btnTable12.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("L")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable13 = new JButton("M");
		btnTable13.setForeground(Color.WHITE);
		btnTable13.setBackground(Color.GRAY);
		btnTable13.setBounds(277, 28, 97, 34);
		pnTableSet.add(btnTable13);
		btnTable13.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("M")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable14 = new JButton("N");
		btnTable14.setForeground(Color.WHITE);
		btnTable14.setBackground(Color.GRAY);
		btnTable14.setBounds(277, 72, 97, 34);
		pnTableSet.add(btnTable14);
		btnTable14.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("N")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable15 = new JButton("O");
		btnTable15.setForeground(Color.WHITE);
		btnTable15.setBackground(Color.GRAY);
		btnTable15.setBounds(277, 119, 97, 34);
		pnTableSet.add(btnTable15);
		btnTable15.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("O")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable16 = new JButton("P");
		btnTable16.setForeground(Color.WHITE);
		btnTable16.setBackground(Color.GRAY);
		btnTable16.setBounds(277, 163, 97, 34);
		pnTableSet.add(btnTable16);
		btnTable16.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("P")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable17 = new JButton("Q");
		btnTable17.setForeground(Color.WHITE);
		btnTable17.setBackground(Color.GRAY);
		btnTable17.setBounds(277, 206, 97, 34);
		pnTableSet.add(btnTable17);
		btnTable17.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("Q")) {
					new OrderSheet(frame);
				}

			}
		});

		btnTable18 = new JButton("R");
		btnTable18.setForeground(Color.WHITE);
		btnTable18.setBackground(Color.GRAY);
		btnTable18.setBounds(277, 252, 97, 34);
		pnTableSet.add(btnTable18);
		btnTable18.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("R")) {
					new OrderSheet(frame);
				}

			}
		});

		btnReceipt = new JButton("\uC601\uC218\uC99D \uCD9C\uB825");
		btnReceipt.setForeground(Color.WHITE);
		btnReceipt.setBackground(Color.GRAY);
		btnReceipt.setBounds(295, 372, 114, 28);
		pnIcon.add(btnReceipt);
		btnReceipt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("영수증 출력")) {
					dispose();
					new receipt(frame);

				}
			}
		});

		btnSales = new JButton("\uB9E4\uCD9C\uD604\uD669");
		btnSales.setBounds(429, 332, 114, 28);
		pnIcon.add(btnSales);
		btnSales.setForeground(Color.WHITE);
		btnSales.setBackground(Color.GRAY);

		btnTableSet = new JButton("\uD14C\uC774\uBE14\uC14B\uD305");
		btnTableSet.setBounds(158, 332, 125, 28);
		pnIcon.add(btnTableSet);
		btnTableSet.setForeground(Color.WHITE);
		btnTableSet.setBackground(Color.GRAY);

		btnTableSet.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("테이블세팅")) {
					new tableSet(frame);
				}

			}
		});

		btnOrder = new JButton("\uC8FC\uBB38\uD604\uD669");
		btnOrder.setForeground(Color.WHITE);
		btnOrder.setBackground(Color.GRAY);
		btnOrder.setBounds(295, 332, 114, 28);
		pnIcon.add(btnOrder);
		btnOrder.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("주문현황")) {

				}

			}
		});

		JButton btnMenuMan = new JButton("\uBA54\uB274\uAD00\uB9AC");
		btnMenuMan.setForeground(Color.WHITE);
		btnMenuMan.setBackground(Color.GRAY);
		btnMenuMan.setBounds(32, 332, 114, 28);
		pnIcon.add(btnMenuMan);
		btnMenuMan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("메뉴관리")) {
					new ManuManage(frame);

				}

			}
		});

		tpSales = new JTabbedPane(JTabbedPane.TOP);
		tpSales.setBounds(433, 6, 380, 312);
		pnIcon.add(tpSales);

		JTextArea taOrder = new JTextArea();
		taOrder.setWrapStyleWord(true);
		taOrder.setRows(4);
		taOrder.setLineWrap(true);
		tpSales.addTab("주문현황", null, taOrder, null);

		JTextArea taSales = new JTextArea();
		tpSales.addTab("매출현황", null, taSales, null);

		JButton btnMainMenu = new JButton("메인메뉴현황");
		btnMainMenu.setForeground(Color.WHITE);
		btnMainMenu.setBackground(Color.GRAY);
		btnMainMenu.setBounds(32, 372, 114, 28);
		pnIcon.add(btnMainMenu);

		btnMainMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("메인메뉴현황")) {

					String[] colname = { "메뉴코드", "메뉴명", "가격" };
					DBcon dbcon = DBcon.getInstance();
					ArrayList<mainMenu> mainlist = dbcon.selectMain();
					int n = mainlist.size();
					// System.out.println(n);
					Object[][] obj = new Object[n][colname.length];

					for (int i = 0; i < mainlist.size(); i++) {
						mainMenu ma = mainlist.get(i);

						obj[i][0] = ma.getMainMenuCode();
						obj[i][1] = ma.getMainMenuName();
						obj[i][2] = ma.getMainMenuPrice();

					}

					// DefaultTableModel model = new DefaultTableModel(obj, colname);
					maintable = new JTable(obj, colname);
					scMain = new JScrollPane(maintable);

				}
				tpSales.add(scMain);

				tpSales.addTab("메인메뉴현황", null, scMain, null);
			}
		});
		JButton btnSideMenu = new JButton("사이드메뉴현황");
		btnSideMenu.setForeground(Color.WHITE);
		btnSideMenu.setBackground(Color.GRAY);
		btnSideMenu.setBounds(158, 372, 125, 28);
		pnIcon.add(btnSideMenu);
		btnSideMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("메인메뉴현황")) {

					String[] colname = { "메뉴코드", "메뉴명", "가격" };
					DBcon dbcon = DBcon.getInstance();

					ArrayList<sideMenu> sidelist = dbcon.selectSide();
					int n = sidelist.size();
					DefaultTableModel model = new DefaultTableModel(colname, 0);
					Object[][] obj = new Object[n][colname.length];

					for (int i = 0; i < sidelist.size(); i++) {
						sideMenu sd = sidelist.get(i);
						obj[i][0] = sd.getSideMenuCode();
						obj[i][1] = sd.getSideMenuName();
						obj[i][2] = sd.getSideMenuPrice();

					}
					// DefaultTableModel sideModel = new DefaultTableModel(obj, colname);
					JTable sidetable = new JTable(obj, colname);
					JScrollPane scSide = new JScrollPane(sidetable);

				}

				tpSales.add(scMain);
				tpSales.addTab("사이드메뉴현황", null, scSide, null);

			}

		});

		btnSales.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("매출현황")) {
					Connection con = null;
					PreparedStatement pstmt = null;
					ResultSet rs = null;

					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						String url = "jdbc.oracle:thin@localhost:1521:xe";
						con = DriverManager.getConnection(url, "hwangcnim", "hyj21028");
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}

			}
		});

		setVisible(true);
	}

	public static void main(String[] args) {
		// new Frame();
	}
}
