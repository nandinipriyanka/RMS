
public class Restaurant {
int rest_id;
String name;
String location;
int phoneNumber;
int hours_id;
String emailID;
public Restaurant(int rest_id, String name, String location, int phoneNumber, int hours_id, String emailID) {
	super();
	this.rest_id = rest_id;
	this.name = name;
	this.location = location;
	this.phoneNumber = phoneNumber;
	this.hours_id = hours_id;
	this.emailID = emailID;
}
public Restaurant() {
	super();
}
public int getRest_id() {
	return rest_id;
}
public void setRest_id(int rest_id) {
	this.rest_id = rest_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public int getHours_id() {
	return hours_id;
}
public void setHours_id(int hours_id) {
	this.hours_id = hours_id;
}
public String getEmailID() {
	return emailID;
}
public void setEmailID(String emailID) {
	this.emailID = emailID;
}
@Override
public String toString() {
	return "Restaurant [rest_id=" + rest_id + ", name=" + name + ", location=" + location + ", phoneNumber="
			+ phoneNumber + ", hours_id=" + hours_id + ", emailID=" + emailID + "]";
}




}
