package ua.kas.server_first;

import javax.swing.JOptionPane;

public class PersonBeanModel {

	private String name = null;
	private String email = null;
	
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
		setEmail("["+getEmail()+"]");
		
		if(name.equals("Alex")){
			JOptionPane.showMessageDialog(null, "Alex");
		}
	}
}
