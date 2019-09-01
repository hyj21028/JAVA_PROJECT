package ChickenProject;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class AdminRegister extends JFrame {

	private JPanel contentPane;
	private JTextField tfno, tfna, tfid, tfpos;
	private JLabel laNo, na, laId, laPw, pos;
	private JButton BtnSave, BtnCancel, BtnDelete, BtnIdCheck;
	private LoginFrame loginFrame;
	private JLabel laIdwarn, laPwWarn, lapwCheck;
	private JPasswordField tfpwtest,tfpw;
	private JLabel laPwtestWarn, laposWarn, lanameWarn;
	private JLabel laIMG;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// MemberShip frame = new MemberShip();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminRegister(LoginFrame loginFrame) {
		this.loginFrame = loginFrame;
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\Admin.png"));
		setTitle("관리자관리");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 410);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 245, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		laNo = new JLabel("No");
		laNo.setBounds(219, 27, 97, 23);
		contentPane.add(laNo);
		laNo.setFont(new Font("Arial", Font.BOLD, 15));

		tfno = new JTextField();
		tfno.setBounds(328, 27, 178, 23);
		contentPane.add(tfno);
		tfno.setColumns(10);

		JLabel tfnoWarn = new JLabel("");
		tfnoWarn.setBounds(510, 70, -182, -20);
		contentPane.add(tfnoWarn);
		tfnoWarn.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfno.getText().length() == 0) {
					tfnoWarn.setText("필수 정보입니다.");
				} else {
					tfnoWarn.setText(" ");
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfno.getText().length() == 0) {
					tfnoWarn.setText("필수 정보입니다");
				} else {
					tfnoWarn.setText(" ");
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		laId = new JLabel("ID");
		laId.setBounds(219, 74, 97, 23);
		contentPane.add(laId);
		laId.setFont(new Font("Arial", Font.BOLD, 15));

		tfid = new JTextField();
		tfid.setBounds(328, 74, 178, 23);
		contentPane.add(tfid);
		tfid.setColumns(10);
		tfid.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfid.getText().length() == 0) {
					laIdwarn.setText("필수정보입니다.");
				} else {
					laIdwarn.setText("");
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfid.getText().length() == 0) {
					laIdwarn.setText("필수정보입니다.");
				} else {
					laIdwarn.setText("");
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		laIdwarn = new JLabel("");
		laIdwarn.setBounds(328, 99, 178, 15);
		contentPane.add(laIdwarn);

		laPw = new JLabel("PW");
		laPw.setBounds(219, 124, 97, 23);
		contentPane.add(laPw);
		laPw.setFont(new Font("Arial", Font.BOLD, 15));

		laPwWarn = new JLabel("");
		laPwWarn.setBounds(109, 93, 178, 15);
		contentPane.add(laIdwarn);

		tfpw = new JPasswordField();
		tfpw.setColumns(10);
		tfpw.setBounds(328, 124, 178, 23);
		contentPane.add(tfpw);
		
		lapwCheck = new JLabel("PW CHECK");
		lapwCheck.setFont(new Font("Arial", Font.BOLD, 15));
		lapwCheck.setBounds(219, 168, 97, 23);
		contentPane.add(lapwCheck);

		tfpwtest = new JPasswordField();
		tfpwtest.setColumns(10);
		tfpwtest.setBounds(328, 168, 178, 23);
		contentPane.add(tfpwtest);

		laPwtestWarn = new JLabel("");
		laPwtestWarn.setBounds(328, 193, 178, 15);
		contentPane.add(laPwtestWarn);

		tfpwtest.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfpwtest.getText().equals(tfpw.getText())) {
					laPwtestWarn.setText("일치합니다.");
				} else
					laPwtestWarn.setText("일치하지않습니다");

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfpwtest.getText().equals(tfpw.getText())) {
					laPwtestWarn.setText("일치합니다.");
				} else
					laPwtestWarn.setText("일치하지않습니다");
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				// TODO Auto-generated method stub
				if (tfpwtest.getText().equals(tfpw.getText())) {
					laPwtestWarn.setText("일치합니다.");
				} else
					laPwtestWarn.setText("일치하지않습니다");

			}

		});

		na = new JLabel("NAME");
		na.setBounds(219, 218, 97, 23);
		contentPane.add(na);
		na.setFont(new Font("Arial", Font.BOLD, 15));

		tfna = new JTextField();
		tfna.setBounds(328, 218, 178, 23);
		contentPane.add(tfna);
		tfna.setColumns(10);

		lanameWarn = new JLabel("");
		lanameWarn.setBounds(328, 241, 178, 15);
		contentPane.add(lanameWarn);

		lanameWarn.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfna.getText().length() == 0) {
					lanameWarn.setText("필수정보입니다");
				} else {
					lanameWarn.setText("");
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfna.getText().length() == 0) {
					lanameWarn.setText("필수정보입니다");
				} else {
					lanameWarn.setText("");
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		pos = new JLabel("POSITION");
		pos.setBounds(219, 268, 97, 23);
		contentPane.add(pos);
		pos.setFont(new Font("Arial", Font.BOLD, 15));

		tfpos = new JTextField();
		tfpos.setBounds(328, 268, 178, 23);
		contentPane.add(tfpos);
		tfpos.setColumns(10);

		laposWarn = new JLabel("");
		laposWarn.setBounds(328, 297, 178, 15);
		contentPane.add(laposWarn);

		laposWarn.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfpos.getText().length() == 0) {
					laIdwarn.setText("필수정보입니다");
				} else {
					laIdwarn.setText("");
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if (tfpos.getText().length() == 0) {
					laIdwarn.setText("필수정보입니다");
				} else {
					laIdwarn.setText("");
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		BtnSave = new JButton("Save");
		BtnSave.setForeground(Color.BLACK);
		BtnSave.setBackground(Color.WHITE);
		BtnSave.setFont(new Font("Arial", Font.BOLD, 15));
		BtnSave.setBounds(199, 324, 99, 23);
		contentPane.add(BtnSave);
		BtnSave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();

				if (cmd.trim().equals("Save")) {
					int no = Integer.parseInt(tfno.getText());
					String id = tfid.getText();// ���̵�
					String password = tfpw.getText();// ��й�ȣ
					String passwordCheck = tfpwtest.getText();
					String name = tfna.getText();// ������
					String position = tfpos.getText();// ���� ����
					Admin ad = new Admin(no, id, password, position, name);
					DBcon dbcon = DBcon.getInstance();
					dbcon.insert(ad);
					init();

					JOptionPane.showMessageDialog(null, "가입되었습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "가입되지않았습니다.");
				}
				// dispose();

			}
		});// ID SAVING

		BtnCancel = new JButton("Cancel");
		BtnCancel.setForeground(Color.BLACK);
		BtnCancel.setBackground(Color.WHITE);
		BtnCancel.setFont(new Font("Arial", Font.BOLD, 15));
		BtnCancel.setBounds(421, 324, 99, 23);
		contentPane.add(BtnCancel);
		setVisible(true);
		BtnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();

				if (cmd.trim().equals("Cancel")) {

					dispose();
					loginFrame.setVisible(true);

				}

			}

		}); // CANCEL FOR MAKING ID

		BtnDelete = new JButton("Delete");
		BtnDelete.setForeground(Color.BLACK);
		BtnDelete.setBackground(Color.WHITE);
		BtnDelete.setFont(new Font("Arial", Font.BOLD, 15));
		BtnDelete.setBounds(310, 324, 99, 23);
		contentPane.add(BtnDelete);
		setVisible(true);

		BtnDelete.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();

				if (cmd.trim().equals("Delete")) {
					String id = tfid.getText();
					DBcon dbcon = DBcon.getInstance();
					dbcon.delete(id);
					init();

					JOptionPane.showMessageDialog(null, "삭제되었습니다.");
				} else {
					JOptionPane.showMessageDialog(null, "삭제되지않았습니다.");
				}

			}
		}); // delete to User Information

		BtnIdCheck = new JButton("Check");
		BtnIdCheck.setForeground(Color.WHITE);
		BtnIdCheck.setBackground(Color.GRAY);
		BtnIdCheck.setFont(new Font("Arial", Font.BOLD, 15));
		BtnIdCheck.setBounds(518, 74, 110, 23);
		contentPane.add(BtnIdCheck);

		laIMG = new JLabel("");
		laIMG.setBackground(Color.GRAY);
		laIMG.setIcon(new ImageIcon("C:\\yjh\\project\\javaProject\\TeamProJect\\src\\Temple\\images\\AdiminIMG.png"));
		laIMG.setBounds(12, 43, 195, 248);
		contentPane.add(laIMG);

		setVisible(true);

		BtnIdCheck.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cmd = e.getActionCommand();
				if (cmd.trim().equals("Check")) {
					String adminId = tfid.getText();
					DBcon dbcon = DBcon.getInstance();
					int n = dbcon.confirm1(adminId);

					if (n == 1) {
						init();
						JOptionPane.showMessageDialog(null, "동일한아이디가 존재합니다.");
					} else {
						JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");

					}

				}

			}

		});
	}// confirm to duplicate

	private void init() {
		tfno.setText(" ");
		tfid.setText(" ");
		tfpw.setText("");
		tfna.setText(" ");
		tfpos.setText(" ");
		tfpwtest.setText("");
		laPwtestWarn.setText("");

	}

}
