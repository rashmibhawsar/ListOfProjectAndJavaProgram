package CoreSpring5JAVADI;

public class Driver {

private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
private String username;
private String password;
@Override
public String toString() {
	return "Driver [name=" + name + ", username=" + username + ", password=" + password + "]";
}


	

}
