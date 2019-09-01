package ChickenProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class OrderSheet extends JFrame {

	private JPanel contentPane;
	JComboBox comboBox;
	JLabel laOrder;
	Frame frame;
	private JTextField tfMainQuantity;
	private JTextField tfSideQuantity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				//	OrderSheet frame = new OrderSheet();
			//	frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrderSheet(Frame frame) {
		this.frame = frame;
		setTitle("주문창");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 280);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel laOrder = new JLabel("주문합니까?");
		laOrder.setBounds(12, 12, 376, 29);
		laOrder.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(laOrder);
		
		JLabel laMain = new JLabel("메인메뉴");
		laMain.setBounds(12, 48, 85, 36);
		laMain.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(laMain);
		
		JComboBox mainOrder = new JComboBox();
		mainOrder.setBounds(92, 53, 112, 31);
		mainOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DBcon dbcon = DBcon.getInstance();
				ArrayList<mainMenu> mainlist = dbcon.selectMain();
				DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
				JComboBox mainOrder = new JComboBox(dcbm);
				for(int i =0; i<mainlist.size();i++) {
					dcbm.addElement(mainlist.get(i));
				}
				JTextArea jta = new JTextArea();
				mainOrder.addActionListener(this);
				JScrollPane jsp = new JScrollPane(jta);
			}
		});
			
			
		contentPane.add(mainOrder);
		
		
		JLabel laSide = new JLabel("사이드메뉴");
		laSide.setBounds(12, 103, 85, 29);
		laSide.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(laSide);
		
		JComboBox MainOrder = new JComboBox();
		MainOrder.setBounds(92, 104, 112, 29);
		contentPane.add(MainOrder);
		
		JButton btnOrder = new JButton("주문");
		btnOrder.setBounds(83, 180, 97, 23);
		contentPane.add(btnOrder);
		btnOrder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if(cmd.trim().equals("주문")) {
					init();
					String mainMenuName = comboBox.getName();
					int mainMenuQuantity = Integer.parseInt(tfMainQuantity.getText());
					String sideMenuName = comboBox.getName();
					int sideMenuQuantity = Integer.parseInt(tfSideQuantity.getText());
				}
			}
		});
		
		
		JButton btnOrderCancel = new JButton("취소");
		btnOrderCancel.setBounds(221, 180, 97, 23);
		contentPane.add(btnOrderCancel);
		btnOrderCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if(cmd.trim().equals("취소")) {
					dispose();
					init();
				}
				
				
			}
		});
		
		
		
		tfMainQuantity = new JTextField();
		tfMainQuantity.setBounds(216, 52, 127, 29);
		contentPane.add(tfMainQuantity);
		tfMainQuantity.setColumns(10);
			
		
		
		tfSideQuantity = new JTextField();
		tfSideQuantity.setColumns(10);
		tfSideQuantity.setBounds(216, 104, 127, 29);
		contentPane.add(tfSideQuantity);
	
	
		setVisible(true);
	}
	void init() {
		tfMainQuantity.setText("");
		tfSideQuantity.setText("");
	}
}