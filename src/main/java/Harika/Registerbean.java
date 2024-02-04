 package Harika;

public class Registerbean<Date> {
private  int equip_id;
private  String type;
private String color;
private  String location;
private    Date install_date;
public int getEquip_id() {
	return equip_id;
}
public void setEquip_id(int equip_id) {
	this.equip_id = equip_id;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getInstall_date() {
	return (String) install_date;
}
public void setInstall_date(Date install_date) {
	this.install_date = install_date;
}
public Registerbean() {
	super();
	
}
public Registerbean(int equip_id, String type, String color, String location, Date install_date) {
	super();
	this.equip_id = equip_id;
	this.type = type;
	this.color = color;
	this.location = location;
	this.install_date = install_date;
}

}