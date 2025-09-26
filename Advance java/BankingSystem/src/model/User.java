package model;

public class User {
	private String name, email, mobile, password;

	public User(String name, String email, String mobile, String password) {
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
	}

	// Getters
	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getPassword() {
		return password;
	}
}
