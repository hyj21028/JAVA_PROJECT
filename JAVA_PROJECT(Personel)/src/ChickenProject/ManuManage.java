package ChickenProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class ManuManage extends JFrame {

	private JPanel contentPane;
	private JTextField tfMainAddMenu, tfSideAddPrice, tfSideAddMenu, tfMainAddPrice;
	private Frame frame;
	private JButton btnMainAdd, btnMainRevise, btnMainDel, btnSideAdd, btnSideRevise, btnSideDel;
	private JTextField tfMainCode;
	private JTextField tfSideCode;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					ManuManage frame = new ManuManage();
//					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManuManage(Frame frame) {
		this.frame = frame;
		setBackground(new Color(255, 239, 213));
		setTitle("메뉴관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 316, 218);
		contentPane.add(tabbedPane);

		JPanel pnMain = new JPanel();
		tabbedPane.addTab("\uBA54\uC778\uBA54\uB274", null, pnMain, null);
		pnMain.setBackground(new Color(255, 245, 238));
		pnMain.setLayout(null);

		JPanel pnMainMenu = new JPanel();
		pnMainMenu.setForeground(new Color(255, 245, 238));
		pnMainMenu.setBounds(33, 58, 224, 31);
		pnMain.add(pnMainMenu);
		pnMainMenu.setLayout(null);

		JLabel laMainName = new JLabel("\uBA54\uB274\uBA85");
		laMainName.setHorizontalAlignment(SwingConstants.CENTER);
		laMainName.setBounds(12, 7, 56, 18);
		pnMainMenu.add(laMainName);

		tfMainAddMenu = new JTextField();
		tfMainAddMenu.setBounds(79, 5, 114, 22);
		pnMainMenu.add(tfMainAddMenu);
		tfMainAddMenu.setColumns(10);

		JPanel PnMainPrice = new JPanel();
		PnMainPrice.setBounds(33, 101, 224, 31);
		pnMain.add(PnMainPrice);
		PnMainPrice.setLayout(null);

		JLabel laMainPrice = new JLabel("\uAC00\uACA9");
		laMainPrice.setHorizontalAlignment(SwingConstants.CENTER);
		laMainPrice.setBounds(12, 7, 60, 15);
		PnMainPrice.add(laMainPrice);

		tfMainAddPrice = new JTextField();
		tfMainAddPrice.setBounds(78, 4, 116, 21);
		PnMainPrice.add(tfMainAddPrice);
		tfMainAddPrice.setColumns(10);

		btnMainAdd = new JButton("\uBA54\uB274\uCD94\uAC00");
		btnMainAdd.setBounds(12, 144, 91, 23);
		pnMain.add(btnMainAdd);
		btnMainAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("메뉴추가")) {
					String mainMenuCode = tfMainCode.getText();
					String mainMenuName = tfMainAddMenu.getText();
					int mainMenuPrice = Integer.parseInt(tfMainAddPrice.getText());
					mainMenu main = new mainMenu(mainMenuCode, mainMenuName, mainMenuPrice);
					DBcon dbcon = DBcon.getInstance();
					dbcon.mainInsert(main);
					init();
					
					JOptionPane.showMessageDialog(null, "추가되었습니다");
				} else {
					JOptionPane.showMessageDialog(null, "추가되지않았습니다.");
				}

				}

			
		});

		btnMainRevise = new JButton("\uC218\uC815");
		btnMainRevise.setBounds(115, 144, 77, 23);
		pnMain.add(btnMainRevise);

		btnMainRevise.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("수정")) {
					String mainMenuCode = tfMainCode.getText();
					String mainMenuName = tfMainAddMenu.getText();
					int mainMenuPrice = Integer.parseInt(tfMainAddPrice.getText());
					mainMenu main = new mainMenu(mainMenuCode, mainMenuName, mainMenuPrice);
					DBcon dbcon = DBcon.getInstance();
					dbcon.mainUpdate(main);
					init();

					JOptionPane.showMessageDialog(null, "수정되었습니다");
				} else {
					JOptionPane.showMessageDialog(null, "수정되지않았습니다.");
				}
			}
		});

		btnMainDel = new JButton("\uC0AD\uC81C");
		btnMainDel.setBounds(204, 144, 73, 23);
		btnMainDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("삭제")) {
					String mainMenuName = tfMainAddMenu.getText();
					DBcon dbcon = DBcon.getInstance();
					dbcon.mainDelete(mainMenuName);
					init();

					JOptionPane.showMessageDialog(null, "삭제되었습니다");
				} else {
					JOptionPane.showMessageDialog(null, "삭제되지않았습니다.");
				}

			}
		});
		pnMain.add(btnMainDel);

		JPanel pnCode = new JPanel();
		pnCode.setLayout(null);
		pnCode.setForeground(new Color(255, 245, 238));
		pnCode.setBounds(33, 12, 224, 31);
		pnMain.add(pnCode);

		JLabel laMainCode = new JLabel("메뉴코드");
		laMainCode.setHorizontalAlignment(SwingConstants.CENTER);
		laMainCode.setBounds(12, 7, 60, 18);
		pnCode.add(laMainCode);

		tfMainCode = new JTextField();
		tfMainCode.setColumns(10);
		tfMainCode.setBounds(79, 5, 114, 22);
		pnCode.add(tfMainCode);

		JPanel pnSide = new JPanel();
		pnSide.setLayout(null);
		pnSide.setBackground(new Color(255, 245, 238));
		tabbedPane.addTab("\uC0AC\uC774\uB4DC\uBA54\uB274", null, pnSide, null);
		tabbedPane.setBackgroundAt(1, new Color(255, 245, 238));
		tabbedPane.setForegroundAt(1, Color.GRAY);

		JPanel pnSideMenu = new JPanel();
		pnSideMenu.setBounds(31, 58, 227, 31);
		pnSide.add(pnSideMenu);
		pnSideMenu.setLayout(null);

		JLabel laSideAddMenu = new JLabel("\uBA54\uB274\uBA85");
		laSideAddMenu.setHorizontalAlignment(SwingConstants.CENTER);
		laSideAddMenu.setBounds(12, 7, 62, 18);
		pnSideMenu.add(laSideAddMenu);

		tfSideAddMenu = new JTextField();
		tfSideAddMenu.setBounds(80, 5, 114, 22);
		tfSideAddMenu.setColumns(10);
		pnSideMenu.add(tfSideAddMenu);

		JPanel pnSidePrice = new JPanel();
		pnSidePrice.setLayout(null);
		pnSidePrice.setBounds(31, 101, 227, 31);
		pnSide.add(pnSidePrice);

		JLabel laSideAddPrice = new JLabel("\uAC00\uACA9");
		laSideAddPrice.setHorizontalAlignment(SwingConstants.CENTER);
		laSideAddPrice.setBounds(12, 7, 62, 15);
		pnSidePrice.add(laSideAddPrice);

		tfSideAddPrice = new JTextField();
		tfSideAddPrice.setColumns(10);
		tfSideAddPrice.setBounds(82, 4, 116, 21);
		pnSidePrice.add(tfSideAddPrice);

		JPanel pnSideCode = new JPanel();
		pnSideCode.setLayout(null);
		pnSideCode.setBounds(31, 15, 227, 31);
		pnSide.add(pnSideCode);

		JLabel laSideCode = new JLabel("메뉴코드");
		laSideCode.setHorizontalAlignment(SwingConstants.CENTER);
		laSideCode.setBounds(12, 7, 62, 18);
		pnSideCode.add(laSideCode);

		tfSideCode = new JTextField();
		tfSideCode.setColumns(10);
		tfSideCode.setBounds(80, 5, 114, 22);
		pnSideCode.add(tfSideCode);

		btnSideAdd = new JButton("\uBA54\uB274\uCD94\uAC00");
		btnSideAdd.setBounds(12, 144, 95, 23);
		pnSide.add(btnSideAdd);
		btnSideAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("메뉴추가")) {
					String sideMenuCode = tfSideCode.getText();
					String sideMenuName = tfSideAddMenu.getText();
					int sideMenuPrice = Integer.parseInt(tfSideAddPrice.getText());
					sideMenu side = new sideMenu(sideMenuCode, sideMenuName, sideMenuPrice);
					DBcon dbcon = DBcon.getInstance();
					dbcon.sideInsert(side);
					init();

					JOptionPane.showMessageDialog(null, "추가되었습니다");
				} else {
					JOptionPane.showMessageDialog(null, "추가되지않았습니다.");
				}

			}
		});

		btnSideRevise = new JButton("\uC218\uC815");
		btnSideRevise.setBounds(119, 144, 69, 23);
		pnSide.add(btnSideRevise);
		btnSideRevise.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("수정")) {
					String sideMenuCode = tfSideCode.getText();
					String sideMenuName = tfSideAddMenu.getText();
					int sideMenuPrice = Integer.parseInt(tfSideAddPrice.getText());
					sideMenu side = new sideMenu(sideMenuCode, sideMenuName, sideMenuPrice);
					DBcon dbcon = DBcon.getInstance();
					dbcon.sideUpdate(side);
					init();

					JOptionPane.showMessageDialog(null, "수정되었습니다");
				} else {
					JOptionPane.showMessageDialog(null, "수정되지않았습니다.");
				}
			}
		});

		btnSideDel = new JButton("\uC0AD\uC81C");
		btnSideDel.setBounds(201, 144, 81, 23);
		pnSide.add(btnSideDel);
		btnSideDel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("삭제")) {
					String sideMenuName = tfSideAddMenu.getText();
					DBcon dbcon = DBcon.getInstance();
					dbcon.sideDelete(sideMenuName);
					init();

					JOptionPane.showMessageDialog(null, "삭제되었습니다");
				} else {
					JOptionPane.showMessageDialog(null, "삭제되지않았습니다.");
				}
			}
		});

		JButton btnBack = new JButton("뒤로");
		btnBack.setBounds(118, 235, 91, 31);
		contentPane.add(btnBack);
		btnBack.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		setVisible(true);
	}

	private void init() {
		tfMainAddMenu.setText("");
		tfMainAddPrice.setText("");
		tfSideAddMenu.setText("");
		tfSideAddPrice.setText("");
		tfMainCode.setText("");
		tfSideCode.setText("");

	}
}
