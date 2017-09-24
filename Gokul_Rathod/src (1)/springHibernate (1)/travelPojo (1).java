package springHibernate;
public class travelPojo {
String email;
String name;
String mobile;
String pass;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

public travelPojo(String email)
{
	this.email = email;
}
public travelPojo(String name, String mobile, String email, String pass) {
	super();
	this.name = name;
	this.mobile = mobile;
	this.email = email;
	this.pass = pass;
}
public travelPojo() {
	super();
	// TODO Auto-generated constructor stub
}


}
