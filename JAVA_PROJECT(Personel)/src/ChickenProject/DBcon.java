package ChickenProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class DBcon {
	private DBcon() {

	}

	private static DBcon dbcon = new DBcon();

	public static DBcon getInstance() {
		return dbcon;
	}

	private Connection getConnection() {
		Connection conn = null;
		String url = "jdbc:oracle:thin:@192.168.0.76:1521:xe";
		String user = "hwangcnim";
		String password = "hyj21028";
		String driver = "oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(driver);// 
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return conn;

	}

	public ArrayList<Admin> selectAdmin() {
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
				System.out.println("입력완료");
			} else {
				System.out.println("입력되지 않았습니다");
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
		String sql = "update adminIfo set adMinNo=?, adminPw =?, adminName = ?, "
				+ "adminPosition = ? where adminId =?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, ad.getAdminNo());
			ps.setString(2, ad.getAdminPw());
			ps.setString(3,ad.getAdminName());
			ps.setString(4, ad.getAdminPosition());
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
				System.out.println("삭제완료");
			} else {
				System.out.println("삭제가되지 않았습니다");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}
	}// DELETE TO ADMINSTRATER DATA

	public int confirm(String adminId, String adminPw) {
		int n = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select adminPw from adminInfo where adminId =?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, adminId);
			rs = ps.executeQuery();
			if (rs.next()) {
				String pw = rs.getString("adminPw");
				if (pw.equals(adminPw)) {
					n = 1;
				} else {
					n = 0;
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return n;
	} // ID and PASSWORD CONFIRM

	public int confirm1(String adminId) {
		int n = -1;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from adminInfo where adminId =?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, adminId);
			rs = ps.executeQuery();
			if (rs.next()) {
				String id = rs.getString("adminId");
				if (id.equals(adminId)) {
					n = 1;
				} else {
					n = 0;

				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return n;
	}
	
	public ArrayList<mainMenu> selectMain() {// ���θ޴� DB �ۼ�
		ArrayList<mainMenu> mainlist = new ArrayList<mainMenu>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from mainMenu";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				mainMenu main = new mainMenu();
			
				main.setMainMenuCode(rs.getString("mainMenuCode"));
				main.setMainMenuName(rs.getString("mainMenuName"));
				main.setMainMenuPrice(rs.getInt("mainMenuPrice"));
			
				mainlist.add(main);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return mainlist;
	}

	public mainMenu selectMainMenu(String mainMenuName) {
		mainMenu main = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from mainMenu where mainMenuName=?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, mainMenuName);// 
			rs = ps.executeQuery();

			if (rs.next()) {
				main = new mainMenu();
				main.setMainMenuCode(rs.getString("mainMenuCode"));
				main.setMainMenuName(rs.getString("mainMenuName"));
				main.setMainMenuPrice(rs.getInt("mainMenuPrice"));
		

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return main;

	}
	
	public void mainInsert(mainMenu main) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into mainMenu (mainMenuCode, mainMenuName, mainMenuPrice) "
				+ " values (?,?,?)";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, main.getMainMenuCode());
			ps.setString(2, main.getMainMenuName());
			ps.setInt(3, main.getMainMenuPrice());
		

			int n = ps.executeUpdate();
			if (n == 1) {
				System.out.println("입력완료");
			} else {
				System.out.println("입력실패");
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}
	} // INSERT TO ADMINSTRATER DATA

	public void mainUpdate(mainMenu main) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "update mainMenu set mainMenuCode =?,mainMenuCode=?, mainMenuName = ? , mainMenuPrice = ? where mainMenuName =?";
				
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, main.getMainMenuCode());
			ps.setString(2,main.getMainMenuName());
			ps.setInt(3, main.getMainMenuPrice());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}

	}// UPDATE TO ADMINSTRATER DATA

	public void mainDelete(String mainMenuName) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "delete from mainMenu where mainMenuName=?";

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, mainMenuName);
			int n = ps.executeUpdate();
			if (n == 1) {
				System.out.println("삭제완료");
			} else {
				System.out.println("삭제실패");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}
	}
	
	public ArrayList<sideMenu> selectSide() {
		ArrayList<sideMenu> sidelist = new ArrayList<sideMenu>();
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from sideMenu";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				sideMenu side = new sideMenu();
				side.setSideMenuCode(rs.getString("sideMenuCode"));
				side.setSideMenuName(rs.getString("sideMenuName"));
				side.setSideMenuPrice(rs.getInt("sideMenuPrice"));
			
				sidelist.add(side);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return sidelist;
	}
	
	public sideMenu selectSideMenu(String sideMenuName) {
		sideMenu side = null;
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select * from sideMenu where sideMenuName=?";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, sideMenuName);
			rs = ps.executeQuery();

			if (rs.next()) {
				side = new sideMenu();
				side.setSideMenuCode(rs.getString("sideMenuCode"));
				side.setSideMenuName(rs.getString("sideMenuName"));
				side.setSideMenuPrice(rs.getInt("sideMenuPrice"));
		

			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps, rs);
		}
		return side;

	}

	public void sideInsert(sideMenu side) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "insert into sideMenu (sideMenuCode,sideMenuName, sideMenuPrice) "
				+ " values(?,?,?)";
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, side.getSideMenuCode());
			ps.setString(2, side.getSideMenuName());
			ps.setInt(3, side.getSideMenuPrice());
		

			int n = ps.executeUpdate();
			if (n == 1) {
				System.out.println("입력완료");
			} else {
				System.out.println("입력실패");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}
	} // INSERT TO ADMINSTRATER DATA

	public void sideUpdate(sideMenu side) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "update sideMenu set sideMenuCode = ?, sideMenuName = ? , sideMenuPrice = ? where sideMenuName =?";
				
		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, side.getSideMenuCode());
			ps.setString(2,side.getSideMenuName());
			ps.setInt(3, side.getSideMenuPrice());
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}

	}// UPDATE TO ADMINSTRATER DATA
	
	public void sideDelete(String sideMenuName) {
		Connection conn = null;
		PreparedStatement ps = null;
		String sql = "delete from sideMenu where sideMenuName=?";

		try {
			conn = getConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, sideMenuName);
			int n = ps.executeUpdate();
			if (n == 1) {
				if (n == 1) {
					System.out.println("삭제완료");
				} else {
					System.out.println("삭제실패");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			dbClose(conn, ps);
		}
	}// DELETE TO ADMINSTRATER DATA
	
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