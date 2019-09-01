package ChickenProject;

public class totalsalesInfo {
 private int tableNo;
 private String menuName;
 private int menuQuantity;
 private int menuPrice;
public totalsalesInfo() {
	super();
}
public totalsalesInfo(int tableNo, String menuName, int menuQuantity, int menuPrice) {
	super();
	this.tableNo = tableNo;
	this.menuName = menuName;
	this.menuQuantity = menuQuantity;
	this.menuPrice = menuPrice;
}
public int getTableNo() {
	return tableNo;
}
public void setTableNo(int tableNo) {
	this.tableNo = tableNo;
}
public String getMenuName() {
	return menuName;
}
public void setMenuName(String menuName) {
	this.menuName = menuName;
}
public int getMenuQuantity() {
	return menuQuantity;
}
public void setMenuQuantity(int menuQuantity) {
	this.menuQuantity = menuQuantity;
}
public int getMenuPrice() {
	return menuPrice;
}
public void setMenuPrice(int menuPrice) {
	this.menuPrice = menuPrice;
}
@Override
public String toString() {
	return tableNo + ", " + menuName + "" + menuQuantity
			+ " " + menuPrice ;
}
 
 
 
}
