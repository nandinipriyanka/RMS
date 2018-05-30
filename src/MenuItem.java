
public class MenuItem {
int menuItemId, price;
String name, description;
public MenuItem(int menuItemId, int price, String name, String description) {
	super();
	this.menuItemId = menuItemId;
	this.price = price;
	this.name = name;
	this.description = description;
}
public MenuItem() {
	super();
}
public int getMenuItemId() {
	return menuItemId;
}
public void setMenuItemId(int menuItemId) {
	this.menuItemId = menuItemId;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
@Override
public String toString() {
	return "MenuItem [menuItemId=" + menuItemId + ", price=" + price + ", name=" + name + ", description=" + description
			+ "]";
}



}
