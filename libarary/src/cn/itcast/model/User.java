package cn.itcast.model;

public class User {

	private	String userName;
	
	private	String password;
	
	

	public User() {
		super();
	}

	public User(String userName , String password) {
		this.userName = userName;
		this.password = password;
	}
	
		
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "�û���"+ this.userName +" ���룺"+ this.password;
	}
	
}
