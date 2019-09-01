package ChickenProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class tableSet extends JFrame {
//	private Frame frame;
	private JPanel contentPane;
	private Frame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					tableSet frame = new tableSet();
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
	public tableSet(Frame frame) {
		this.frame = frame;
		
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 371, 213);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 239, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(170, 76, 141, 38);
		contentPane.add(spinner);
		
		JLabel la = new JLabel("\uD14C\uC774\uBE14 \uAC2F\uC218");
		la.setHorizontalAlignment(SwingConstants.CENTER);
		la.setBounds(40, 75, 131, 39);
		contentPane.add(la);
		
		JLabel laTableSet = new JLabel("\uD14C\uC774\uBE14 \uC22B\uC790\uB97C \uC815\uD558\uC2DC\uC624");
		laTableSet.setFont(new Font("����", Font.PLAIN, 24));
		laTableSet.setHorizontalAlignment(SwingConstants.CENTER);
		laTableSet.setBounds(40, 25, 280, 41);
		contentPane.add(laTableSet);
		
		JButton btnApply = new JButton("\uC801\uC6A9");
		btnApply.setForeground(Color.WHITE);
		btnApply.setBackground(Color.GRAY);
		btnApply.setBounds(62, 124, 109, 40);
		contentPane.add(btnApply);
		btnApply.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if(cmd.trim().equals("����")) {
					// setTableCount �Լ��� �ѱ�
					int TableCount = (int)spinner.getValue();
					frame.setTableCount(TableCount);
				}
			}
		});
		
		
		JButton btnCancel = new JButton("\uCDE8\uC18C");
		btnCancel.setForeground(Color.WHITE);
		btnCancel.setBackground(Color.GRAY);
		btnCancel.setBounds(202, 124, 109, 40);
		contentPane.add(btnCancel);
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if(cmd.trim().equals("���")) {
					dispose();
					
				}
			}
		});
		
		
		setVisible(true);
	}
}
