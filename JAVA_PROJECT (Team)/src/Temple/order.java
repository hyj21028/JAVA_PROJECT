package Temple;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class order extends JFrame {
	private Frame main;
	private JPanel c, p1;
	private JLabel laCnt;
	private JTextField textField;
	private JButton ApplyBtn, CancelBtn, OkBtn, ResetBtn, btnPr;
	public static JTextArea taResult;
	public static JComboBox strList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					/*
					 * order frame = new order(); frame.setVisible(true);
					 */
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public order() {

		setTitle("주문");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 272);
		c = new JPanel();
		c.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(c);
		c.setLayout(null);

		// String[] str = { "�Ķ��̵�ġŲ", "���ġŲ", "����ġŲ", "�Ĵ�", "�ݶ�", "���̴�", "�ܻ�����" }; // �޴�
		// �̸� 7��
		strList = new JComboBox(menutype.menuname2);
		strList.setBounds(12, 12, 124, 27);

		p1 = new JPanel();
		p1.setBackground(new Color(255, 245, 238));
		p1.setBounds(0, 0, 284, 216);
		p1.setLayout(null);
		p1.add(strList);
		c.add(p1);

		laCnt = new JLabel("\uC218\uB7C9");
		laCnt.setFont(new Font("����", Font.BOLD, 12));
		laCnt.setBounds(12, 51, 26, 18);
		p1.add(laCnt);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(47, 51, 86, 21);
		p1.add(textField);
		textField.setColumns(10);

		MyAction a = new MyAction(this);
		JButton ApplyBtn = new JButton("Apply"); // Apply����Ǹ� taResultâ�� "�޴� �̸�, ���� 5��"�� ���
		ApplyBtn.setForeground(Color.WHITE);
		ApplyBtn.setBackground(Color.GRAY);
		ApplyBtn.setFont(new Font("Arial", Font.BOLD, 12));
		ApplyBtn.setBounds(12, 84, 124, 35); // Apply��ư���� taResult�� ���ʴ�� ����� �޴� ���-����
		ApplyBtn.addActionListener(a);
		p1.add(ApplyBtn);

		CancelBtn = new JButton("Cancel"); // Cancel�� ó�� ���� ȭ������ ���ư���
		CancelBtn.setForeground(Color.WHITE);
		CancelBtn.setBackground(Color.GRAY);
		CancelBtn.setFont(new Font("Arial", Font.BOLD, 12));
		CancelBtn.setBounds(148, 128, 124, 35);
		CancelBtn.addActionListener(a);
		p1.add(CancelBtn);

		OkBtn = new JButton("OK");
		OkBtn.setForeground(Color.WHITE);
		OkBtn.setBackground(Color.GRAY);
		OkBtn.setFont(new Font("Arial", Font.BOLD, 12));
		OkBtn.setBounds(12, 128, 124, 35);
		OkBtn.addActionListener(a);
		p1.add(OkBtn);

		/*
		 * OK��ư ������ ���� ȭ�� Order�� 0�� ���̺�>>
		 */

		ResetBtn = new JButton("Reset");
		ResetBtn.setForeground(Color.WHITE);
		ResetBtn.setBackground(Color.GRAY);
		ResetBtn.setFont(new Font("Arial", Font.BOLD, 12));
		ResetBtn.setBounds(148, 84, 124, 35);
		ResetBtn.addActionListener(a);
		p1.add(ResetBtn);

		taResult = new JTextArea();
		if (Frame.tablenumber == 1) {
			taResult.setText(basket.table1);
		}
		if (Frame.tablenumber == 2) {
			taResult.setText(basket.table2);
		}
		if (Frame.tablenumber == 3) {
			taResult.setText(basket.table3);
		}
		if (Frame.tablenumber == 4) {
			taResult.setText(basket.table4);
		}
		if (Frame.tablenumber == 5) {
			taResult.setText(basket.table5);
		}
		if (Frame.tablenumber == 6) {
			taResult.setText(basket.table6);
		}
		if (Frame.tablenumber == 7) {
			taResult.setText(basket.table7);
		}
		if (Frame.tablenumber == 8) {
			taResult.setText(basket.table9);
		}
		if (Frame.tablenumber == 9) {
			taResult.setText(basket.table8);
		}
		if (Frame.tablenumber == 10) {
			taResult.setText(basket.table10);
		}
		if (Frame.tablenumber == 11) {
			taResult.setText(basket.table11);
		}
		if (Frame.tablenumber == 12) {
			taResult.setText(basket.table12);
		}
		if (Frame.tablenumber == 13) {
			taResult.setText(basket.table13);
		}
		if (Frame.tablenumber == 14) {
			taResult.setText(basket.table14);
		}
		if (Frame.tablenumber == 15) {
			taResult.setText(basket.table15);
		}
		if (Frame.tablenumber == 16) {
			taResult.setText(basket.table16);
		}
		if (Frame.tablenumber == 17) {
			taResult.setText(basket.table17);
		}
		if (Frame.tablenumber == 18) {
			taResult.setText(basket.table18);
		}
		

		taResult.setBackground(Color.WHITE);
		taResult.setBounds(148, 12, 124, 59);
		p1.add(taResult);

		btnPr = new JButton("Payment");
		btnPr.setForeground(Color.WHITE);
		btnPr.setBackground(Color.GRAY);
		btnPr.setFont(new Font("Arial", Font.BOLD, 12));
		btnPr.addActionListener(a);
		btnPr.setBounds(12, 173, 124, 35);
		p1.add(btnPr);

		this.setVisible(true); // ������ ���� �� ���̰� �ϴ� ��
	}

	class MyAction implements ActionListener {
		order frame;

		MyAction(order frame) {
			this.frame = frame;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();

			switch (cmd) {
			case "Apply":
				order.taResult.append(
						strList.getSelectedItem().toString() + " " + Integer.parseInt(textField.getText()) + "\n");
				textField.setText("");
				break;
			case "Reset":
				taResult.setText("");
				textField.setText("");
				break;
			case "Cancel":
				taResult.setText("");
				textField.setText("");
				dispose();
				break;
			case "Payment":
				if (Frame.tablenumber == 1) {
					basket.table1 = order.taResult.getText();
				}
				if (Frame.tablenumber == 2) {
					basket.table2 = order.taResult.getText();
				}
				if (Frame.tablenumber == 3) {
					basket.table3 = order.taResult.getText();
				}
				if (Frame.tablenumber == 4) {
					basket.table4 = order.taResult.getText();
				}
				if (Frame.tablenumber == 5) {
					basket.table5 = order.taResult.getText();
				}
				if (Frame.tablenumber == 6) {
					basket.table6 = order.taResult.getText();
				}
				if (Frame.tablenumber == 7) {
					basket.table7 = order.taResult.getText();
				}
				if (Frame.tablenumber == 8) {
					basket.table8 = order.taResult.getText();
				}
				if (Frame.tablenumber == 8) {
					basket.table8 = order.taResult.getText();
				}

				if (Frame.tablenumber == 9) {
					basket.table9 = order.taResult.getText();
				}

				if (Frame.tablenumber == 10) {
					basket.table10 = order.taResult.getText();
				}

				if (Frame.tablenumber == 11) {
					basket.table11 = order.taResult.getText();
				}

				if (Frame.tablenumber == 12) {
					basket.table12 = order.taResult.getText();
				}

				if (Frame.tablenumber == 13) {
					basket.table13 = order.taResult.getText();
				}

				if (Frame.tablenumber == 14) {
					basket.table14 = order.taResult.getText();
				}

				if (Frame.tablenumber == 15) {
					basket.table15 = order.taResult.getText();
				}

				if (Frame.tablenumber == 16) {
					basket.table16 = order.taResult.getText();
				}

				if (Frame.tablenumber == 17) {
					basket.table17 = order.taResult.getText();
				}
				if (Frame.tablenumber == 18) {
					basket.table18 = order.taResult.getText();
				}

				

				taResult.setText("");
				textField.setText("");
				new printbill();
				dispose();
				break;
			case "OK":
				if (Frame.tablenumber == 1) {
					basket.table1 = order.taResult.getText();
				}
				if (Frame.tablenumber == 2) {
					basket.table2 = order.taResult.getText();
				}
				if (Frame.tablenumber == 3) {
					basket.table3 = order.taResult.getText();
				}
				if (Frame.tablenumber == 4) {
					basket.table4 = order.taResult.getText();
				}
				if (Frame.tablenumber == 5) {
					basket.table5 = order.taResult.getText();
				}
				if (Frame.tablenumber == 6) {
					basket.table6 = order.taResult.getText();
				}
				if (Frame.tablenumber == 7) {
					basket.table7 = order.taResult.getText();
				}
				if (Frame.tablenumber == 8) {
					basket.table8 = order.taResult.getText();
				}
				
				if (Frame.tablenumber == 9) {
					basket.table9 = order.taResult.getText();
				}

				if (Frame.tablenumber == 10) {
					basket.table10 = order.taResult.getText();
				}

				if (Frame.tablenumber == 11) {
					basket.table11 = order.taResult.getText();
				}

				if (Frame.tablenumber == 12) {
					basket.table12 = order.taResult.getText();
				}

				if (Frame.tablenumber == 13) {
					basket.table13 = order.taResult.getText();
				}

				if (Frame.tablenumber == 14) {
					basket.table14 = order.taResult.getText();
				}

				if (Frame.tablenumber == 15) {
					basket.table15 = order.taResult.getText();
				}

				if (Frame.tablenumber == 16) {
					basket.table16 = order.taResult.getText();
				}

				if (Frame.tablenumber == 17) {
					basket.table17 = order.taResult.getText();
				}
				if (Frame.tablenumber == 18) {
					basket.table18 = order.taResult.getText();
				}

				taResult.setText("");
				textField.setText("");
				dispose();
				break;
			}
		}
	}
}
