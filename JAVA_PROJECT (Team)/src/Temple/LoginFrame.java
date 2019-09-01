
package Temple;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class LoginFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel pn_JLID;
	private JLabel pn_JLPW;
	private JTextField pn_TextID;
	private JPasswordField pn_PWfield;
	private JLabel laLogo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\admin.png"));

		setTitle("관리자 로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 408, 277);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 245, 238));
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		pn_JLID = new JLabel("ID");
		pn_JLID.setBounds(59, 113, 73, 25);
		contentPane.add(pn_JLID);
		pn_JLID.setFont(new Font("Arial", Font.BOLD, 20));

		pn_TextID = new JTextField();
		pn_TextID.setBounds(177, 117, 136, 21);
		contentPane.add(pn_TextID);
		pn_TextID.setColumns(10);

		pn_JLPW = new JLabel("PW");
		pn_JLPW.setFont(new Font("Arial", Font.BOLD, 20));
		pn_JLPW.setBounds(59, 155, 73, 25);
		contentPane.add(pn_JLPW);

		pn_PWfield = new JPasswordField();
		pn_PWfield.setBounds(177, 159, 136, 21);
		contentPane.add(pn_PWfield);

		JButton BtnLogin = new JButton("Login");
		BtnLogin.setForeground(new Color(0, 0, 0));
		BtnLogin.setBackground(new Color(255, 255, 255));
		BtnLogin.setFont(new Font("Arial", Font.BOLD, 15));
		BtnLogin.setBounds(149, 205, 93, 23);
		contentPane.add(BtnLogin);

		JButton BtnCancel = new JButton("Cancel");
		BtnCancel.setForeground(new Color(0, 0, 0));
		BtnCancel.setBackground(new Color(255, 255, 255));
		BtnCancel.setFont(new Font("Arial", Font.BOLD, 15));
		BtnCancel.setBounds(287, 205, 93, 23);
		contentPane.add(BtnCancel);

		JButton BtnSignUp = new JButton("Sign UP");
		BtnSignUp.setBackground(new Color(255, 255, 255));
		BtnSignUp.setForeground(new Color(0, 0, 0));
		BtnSignUp.setFont(new Font("Arial", Font.BOLD, 15));
		BtnSignUp.setBounds(12, 205, 93, 23);
		contentPane.add(BtnSignUp);
		
		laLogo = new JLabel("");
		laLogo.setIcon(new ImageIcon("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\LoginR.png"));
		laLogo.setBounds(52, 10, 300, 93);
		contentPane.add(laLogo);
		BtnLogin.addActionListener(this);
		BtnCancel.addActionListener(this);
		BtnSignUp.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		switch (cmd) {
		case "Sign UP":

			this.setVisible(false);
			new AdminRegister(this);
			break;

		case "Cancel":

			this.dispose();
			break;
		case "Login":

			if (cmd.trim().equals("Login")) {
				String adminId = pn_TextID.getText();
				String adminPw = pn_PWfield.getText();
				DBconn dbconn = DBconn.getInstance();
				int n = dbconn.confirm(adminId, adminPw);
				String msg = "";
				if (n == 1) {
					Admin ad = dbconn.selectOne(adminId);
					//msg = "환영합니다" + adminId + " " + ad.getAdminName() + "님";
					msg = "환영합니다" + " " + ad.getAdminName() + "님";
					this.setVisible(false);
					new Frame(this);

				} else if (n == 0) {
					msg = "비밀번호가 틀렸습니다";

				} else {
					msg = adminId + "는 없는 회원입니다.";
				}
				JOptionPane.showMessageDialog(null, msg);

				// this.setVisible(false);

				init();

			}

			break;
		}

	}

	private void init() {
		pn_TextID.setText("");
		pn_PWfield.setText("");

	}
}
