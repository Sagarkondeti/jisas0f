package com.imaginnovate.users.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity(name = "Users")
@Table(name = "USERS")
public class Users {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
	@Column(name = "NAME")
    private String name;
	@Column(name = "USER_NAME")
    private String username;
	@Column(name = "EMAIL")
    private String email;
	@Column(name = "ADDRESS")
    private String address;
	@Column(name = "PHONE_NO")
    private long phoneno;
	@Column(name = "COMPANY_NAME")
    private String companyname;
	

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Users(int id, String name, String username, String email, String address, long phoneno, String companyname) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phoneno = phoneno;
		this.companyname = companyname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}


	
}
