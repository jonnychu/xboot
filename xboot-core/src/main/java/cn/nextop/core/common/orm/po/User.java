package cn.nextop.core.common.orm.po;

public class User {
	//
	private String email;
	private String userName;
	private String password;

	//
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		StringBuilder r = new StringBuilder();
		r.append("userName : ").append(this.userName).append(", password : ").append(this.password).append(", email : ").append(this.email);
		return r.toString();
	}
}
