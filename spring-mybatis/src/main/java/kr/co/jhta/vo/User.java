package kr.co.jhta.vo;

public class User {
	
	private String id; 
	private String name;
	private String password;
	private String email;
	private String createdDate;
	
	public User () {}
	
	public User(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getCreatedDate() {
		return createdDate;
	}

	void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	
	
}
