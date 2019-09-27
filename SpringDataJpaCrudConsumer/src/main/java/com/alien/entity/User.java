package com.alien.entity;
import java.util.Date;



public class User extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = -2526578008782829736L;
	


    private String username;
    private Date birthday;
    private String sex;
    private String address;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
    
    
    
}