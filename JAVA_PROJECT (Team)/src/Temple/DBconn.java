package Temple;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class DBconn {
	private DBconn() {

	}

	private static DBconn dbconn = new DBconn();

	public static DBconn getInstance() {
		return dbconn;
	}

	private Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@192.168.0.76:1521:xe";
		String user = "hwangcnim";
		String password = "hyj21028";
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);// ����Ŭ ����̹� ���̺귯���� ���� �ϰԲ��ϴ� ��
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;

	}

	public ArrayList<Admin> selectAdmin() {// ������ ���� DB �ۼ�
		ArrayList<Admin> list = new ArrayList<Admin>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from adminInfo";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Admin ad = new Admin();
				ad.setAdminNo(rs.getInt("adminNo"));
				ad.setAdminId(rs.getString("adminId"));
				ad.setAdminPw(rs.getString("adminPw"));
				ad.setAdminName(rs.getString("adminName"));
				ad.setAdminPosition(rs.getString("adminPosition"));
				list.add(ad);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return list;
	}// CONFIRM TO ENROLLED ADMINSTRATER DATA 
	
	public Admin selectOne(String id) {// �Ѱ��� ���, PRIMARY KEY
		Admin ad = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from adminInfo where adminId=?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);// id setting
			rs = ps.executeQuery();// sql�� ������ ������ �����͸� ������

			if (rs.next()) {
				ad = new Admin();
				ad.setAdminNo(rs.getInt("adminNo"));
				ad.setAdminId(rs.getString("adminId"));
				ad.setAdminPw(rs.getString("adminPw"));
				ad.setAdminName(rs.getString("adminName"));
				ad.setAdminPosition(rs.getString("adminPosition"));
			

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return ad;

	}

	public void insert(Admin ad) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into adminInfo (adminNo, adminId, adminPw, adminName, adminPosition) "
				   + " values (?,?,?,?,?)";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, ad.getAdminNo());
			ps.setString(2, ad.getAdminId());
			ps.setString(3, ad.getAdminPw());
			ps.setString(4, ad.getAdminName());
			ps.setString(5, ad.getAdminPosition());

			int n = ps.executeUpdate();
			if (n == 1) {
				System.out.println("�Է¿Ϸ�");
			} else {
				System.out.println("�߸��Է��߽��ϴ�.");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}
	} // INSERT TO ADMINSTRATER DATA

	public void update(Admin ad) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "update into adminIfo set adMinNo=?, adminPw =?, adminName = ?, "
				+ "adminPosition = ? where adminId =?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, ad.getAdminNo());
			ps.setString(3, ad.getAdminPw());
			ps.setString(4, ad.getAdminName());
			ps.setString(5, ad.getAdminPosition());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}

	}// UPDATE TO ADMINSTRATER DATA

	public void delete(String adminId) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "delete from adminInfo where adminId=?";

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, adminId);
			int n = ps.executeUpdate();
			if (n == 1) {
				System.out.println("���� �Ϸ�");
			} else {
				System.out.println("���� ����");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}
	}// DELETE TO ADMINSTRATER DATA 
	
	public int confirm(String adminId, String adminPw) {
		int n =-1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select adminPw from adminInfo where adminId =?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, adminId);
			rs=ps.executeQuery();
			if(rs.next()) {
				String pw = rs.getString("adminPw");
				if(pw.equals(adminPw)) {
					n =1;
				}else {
					n =0;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			dbClose(conn, ps, rs);
		}
		return n;
	} //ID and PASSWORD CONFIRM
	
	public int confirm1(String adminId) { 
		int n =-1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from adminInfo where adminId =?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, adminId);
			rs=ps.executeQuery();
			if(rs.next()) {
				String id = rs.getString("adminId");
				if(id.equals(adminId)) {
					n =1;
				}else  {
					n =0;
				
					
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			dbClose(conn, ps, rs);
		}
		return n;
	}
//	public ArrayList<totalsalesInfo> InsertSales() {// ������ ���� DB �ۼ�
//		ArrayList<totalsalesInfo> salesList = new ArrayList<totalsalesInfo>();
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		String sql = "select * from totalsales";
//		try {
//			conn = getConnection();
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//				totalsalesInfo sale = new totalsalesInfo();
//				sale.setTableNo(rs.getInt("tableNo"));
//				sale.setMenuName(rs.getString("menuName"));
//				sale.setMenuQuantity(rs.getInt("menuQuantity"));
//				sale.setMenuPrice(rs.getInt("menuPrice"));
//			
//				salesList.add(sale);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			dbClose(conn, ps, rs);
//		}
//		return salesList;
//	}
//
//	
//	
	

//
//	public ArrayList<totalMenuInfo> selectMenu() {
//		ArrayList<totalMenuInfo> menuList = new ArrayList<totalMenuInfo>();
//		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		String sql = "select * from menuInfo";
//		try {
//			conn = getConnection();
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//				totalMenuInfo tMenu = new totalMenuInfo();
//				tMenu.setMainMenuNo(rs.getInt("MainMenuNo"));
//				tMenu.setMainMenuName(rs.getString("MainMenu"));
//				tMenu.setMainMenuPrice(rs.getInt("MainMenuPrice"));
//				tMenu.
//			
//
//				menuList.add(tMenu);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			dbClose(conn, ps, rs);
//		}
//		return menuList;
//	}// ���θ޴� DB
//
//	public void manuUptate(menuInfo tmenu) {
//		Connection conn = null;
//		PreparedStatement ps = null;
//		String sql = "update into mainMenu set mainMenuNo =? ,mainMenuPrice =? " +
//		             "where mainMenuName =?";
//		try {
//			conn = getConnection();
//			ps = conn.prepareStatement(sql);
//			ps.setInt(1, tmenu.getMainMenuNo());
//			ps.setString(2, tmenu.getMainMenuName());
//			ps.setInt(3, tmenu.getMainMenuPrice());
//
//			int n = ps.executeUpdate();
//			if (n == 1) {
//				System.out.println("�Է¼���");
//			} else {
//				System.out.println("�Է½���");
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			dbClose(conn, ps);
//		}
//	} // �޴� �޴� ������Ʈ
//
//	public void menuDelete(String mainMenuName) {
//		Connection conn = null;
//		PreparedStatement ps = null;
//		String sql = "delete from menuInfo where mainMenuName = ?";
//
//		try {
//			conn = getConnection();
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, mainMenuName);
//			int n = ps.executeUpdate();
//			if (n == 1) {
//				System.out.println("���� �Ϸ�");
//			} else {
//				System.out.println("���� ����");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			dbClose(conn, ps);
//		}
//	}
//	public ArrayList<TotalmenuInfo> selectSideMenu() {
//		ArrayList<TotalmenuInfo> sMenuList = new ArrayList<menuInfo>();
// 		Connection conn = null;
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		String sql = "select * from sideMenu";
//		try {
//			conn = getConnection();
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
//
//			while (rs.next()) {
//				menuInfo sMenu = new menuInfo();
//			sMenu.setSideMenuNo(rs.getInt("SideMenuNo"));
//				sMenu.setSideMenuName(rs.getString("SideMenu"));
//				sMenu.setSideMenuPrice(rs.getInt("SideMenuPrice"));
//
//				sMenuList.add(sMenu);
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			dbClose(conn, ps, rs);
//		}
//		return sMenuList;
//	}// ���̵�޴�DB
//
//	public void sMenuUpdate(menuInfo tSmenu) {
//		Connection conn = null;
//		PreparedStatement ps = null;
//		String sql = "update into sideMenu set sideMenuNo = ? ," + "sideMenuPrice =? where sideMenuName =?";
//		try {
//			conn = getConnection();
//			ps = conn.prepareStatement(sql);
//			ps.setInt(1, tSmenu.getSideMenuNo());
//			ps.setString(2, tSmenu.getSideMenuName());
//			ps.setInt(3, tSmenu.getSideMenuPrice());
//
//			int n = ps.executeUpdate();
//			if (n == 1) {
//				System.out.println("�Է¼���");
//			} else {
//				System.out.println("�Է½���");
//			}
//
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			dbClose(conn, ps);
//		}
//	} // ���̵�޴��߰�
//
//	public void sMenuDelete(String sideMenuName) {
//		Connection conn = null;
//		PreparedStatement ps = null;
//		String sql = "Al";
//
//		try {
//			conn = getConnection();
//			ps = conn.prepareStatement(sql);
//			ps.setString(1, sideMenuName);
//			
//			int n = ps.executeUpdate();
//			if (n == 1) {
//				System.out.println("���� �Ϸ�");
//			} else {
//				System.out.println("���� ����");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		} finally {
//			dbClose(conn, ps);
//		}
//	}// ���̵�޴�����

//	public ArrayList<SalesInfo> salesInfo() {
	//	ArrayList<SalesInfo> salesInfo = new ArrayList<SalesInfo>();
		//Connection conn = null;
		
	//	PreparedStatement ps = null;
//		PreparedStatement ps1 = null;
//		PreparedStatement ps2 = null;
//		PreparedStatement ps3 = null;
		
		//ResultSet rs = null;
		
		//String sql = "select sum(mainMenuQuantity) from mainMenu";
//		String sql1 = "select sum(mainMenuPrice) from mainMenu";
//		String sql2 = "select sum(mainMenuQuantity) from sideMenu";
//		String sql3 = "select sum(sideMenuPrice) from sideMenu";
		//try {
			//conn = getConnection();
			//ps = conn.prepareStatement(sql);
//			ps1 = conn.prepareStatement(sql1);
//			ps2 = conn.prepareStatement(sql2);
//			ps3 = conn.prepareStatement(sql3);
			
		//	rs = ps.executeQuery();
//			rs = ps1.executeQuery();
//			rs = ps2.executeQuery();
//			rs = ps3.executeQuery();
	//	} catch (Exception e) { // TODO: handle exception
		//	e.printStackTrace();
	//	}

		//return salesInfo;

	//}

	private void dbClose(Connection conn, PreparedStatement ps, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void dbClose(Connection conn, PreparedStatement ps) {
		try {

			if (ps != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}