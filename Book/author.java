package Book;

public class author {
String name;
String email;
String gender;
public String getName() {
	return name;
	
}
public void setName(String name) {
	this.name=name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email =email;
}

public String getGender() {
	return gender;
}
public void setgender(String gender) {
	this.gender = gender;
}
public author(String name, String email,String gender) {
	super();
	this.name = name;
	this.email = email;
	this.gender = gender;
}
}

