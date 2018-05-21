package entity;

import java.util.Date;

public class User {
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String mypassword;
	/**
	 * 电邮
	 */
	private String email;
	/**
	 * 性别
	 */
	private String gender;
	/**
	 * 生日
	 */
	private Date birthday;
	/**
	 * 爱好
	 */
	private String[] favorites;
	/**
	 * 自我介绍
	 */
	private String introduce;
	/**
	 * 接受协议
	 */
	private boolean acceptState;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMypassword() {
		return mypassword;
	}
	public void setMypassword(String mypassword) {
		this.mypassword = mypassword;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String[] getFavorites() {
		return favorites;
	}
	public void setFavorites(String[] favorites) {
		this.favorites = favorites;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	public boolean isAcceptState() {
		return acceptState;
	}
	public void setAcceptState(boolean acceptState) {
		this.acceptState = acceptState;
	}
}
