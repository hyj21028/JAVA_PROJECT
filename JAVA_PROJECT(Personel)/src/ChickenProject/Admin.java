package ChickenProject;
public class Admin {
	private int adminNo;
	private String adminId;
	private String adminPw;
	private String adminPosition;
	private String adminName;
	
	public Admin() {}

	public Admin(int adminNo, String adminId, String adminPw, String adminPosition, String adminName) {
		
		this.adminNo = adminNo;
		this.adminId = adminId;
		this.adminPw = adminPw;
		this.adminPosition = adminPosition;
		this.adminName = adminName;
	}
	
	

	public int getAdminNo() {
		return adminNo;
	}

	public void setAdminNo(int adminNo) {
		this.adminNo = adminNo;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getAdminPw() {
		return adminPw;
	}

	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}

	public String getAdminPosition() {
		return adminPosition;
	}

	public void setAdminPosition(String adminPosition) {
		this.adminPosition = adminPosition;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	@Override
	public String toString() {
		return  adminNo+""+adminId + " " + adminPw + " " + adminPosition
				+ " " + adminName;
	}
	
	
}
