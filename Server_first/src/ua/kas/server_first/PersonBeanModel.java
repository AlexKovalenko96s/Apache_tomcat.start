package ua.kas.server_first;

public class PersonBeanModel {

	private String name = null;
	private String email = null;
	private String password = null;
	private String r_password = null;
	
	public String getR_password() {
		return r_password;
	}
	public void setR_password(String r_password) {
		this.r_password = r_password;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void doSomething(){
		setName("["+getName()+"]");
		setPassword("["+getPassword()+"]");
		setR_password("["+getR_password()+"]");
		setEmail("["+getEmail()+"]");
	}
}
