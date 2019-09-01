package ChickenProject;

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
	private Frame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
//					receipt frame = new receipt();
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
	public receipt(Frame frame) {
		this.frame = frame;
		setTitle("영수증처리");
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
			if(cmd.trim().equals("네")){
				msg="출력합니다.";
				
				String fileNm = "C:\\Users\\it\\Desktop\\JAVA\\Receipt.txt";
				File file = new File(fileNm);
				
				FileWriter fw = null;
		
				try {
					fw = new FileWriter(file,true);
					
					fw.flush();
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}finally{
					
					if(fw !=null)
						try {
							fw.close();
							
						} catch (IOException e3) {
							// TODO: handle exception
							
						}
				}
			    
			}else if(cmd.trim().equals("아니요")) {
				msg = "출력하지않습니다.";
			}
			JOptionPane.showMessageDialog(null, msg);
//			switch(cmd) {
//			case "��":
//				msg = "�������� ����մϴ�."; break;
//			case "�ƴϿ�":
//				msg = "�������� ������� �ʽ��ϴ�"; break;
//			}
		
				
			
		}
		
	}

}
