package ChickenProject;

public class mainMenu {
	private String mainMenuCode;
	private String mainMenuName;
	private int mainMenuPrice;

	public mainMenu() {
		super();
	}

	public mainMenu(String mainMenuCode, String mainMenuName, int mainMenuPrice) {
		super();
		this.mainMenuCode = mainMenuCode;
		this.mainMenuName = mainMenuName;
		this.mainMenuPrice = mainMenuPrice;
	}

	public String getMainMenuName() {
		return mainMenuName;
	}

	public void setMainMenuName(String mainMenuName) {
		this.mainMenuName = mainMenuName;
	}

	public int getMainMenuPrice() {
		return mainMenuPrice;
	}

	public void setMainMenuPrice(int mainMenuPrice) {
		this.mainMenuPrice = mainMenuPrice;
	}

	public String getMainMenuCode() {
		return mainMenuCode;
	}

	public void setMainMenuCode(String mainMenuCode) {
		this.mainMenuCode = mainMenuCode;
	}

	@Override
	public String toString() {
		return mainMenuCode + " " + mainMenuName + " " + mainMenuPrice;
	}

}
