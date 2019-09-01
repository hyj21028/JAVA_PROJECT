package ChickenProject;

public class sideMenu {
	private String sideMenuCode;
	private String sideMenuName;
	private int sideMenuPrice;

	public sideMenu() {
		super();
	}

	public sideMenu(String sideMenuCode,String sideMenuName, int sideMenuPrice) {
		super();
		this.sideMenuCode = sideMenuCode;
		this.sideMenuName = sideMenuName;
		this.sideMenuPrice = sideMenuPrice;
	}

	public String getSideMenuName() {
		return sideMenuName;
	}

	public void setSideMenuName(String sideMenuName) {
		this.sideMenuName = sideMenuName;
	}

	public int getSideMenuPrice() {
		return sideMenuPrice;
	}

	public void setSideMenuPrice(int sideMenuPrice) {
		this.sideMenuPrice = sideMenuPrice;
	}
	
	

	public String getSideMenuCode() {
		return sideMenuCode;
	}

	public void setSideMenuCode(String sideMenuCode) {
		this.sideMenuCode = sideMenuCode;
	}

	@Override
	public String toString() {
		return sideMenuCode+" "+sideMenuName + " " + sideMenuPrice;
	}

}
