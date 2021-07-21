package utils;

import java.io.Serializable;

public class Admin extends User implements Serializable{

	public Admin(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public Admin() {
	}
	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return super.getUserName();
	}

	@Override
	public void setUserName(String userName) {
		// TODO Auto-generated method stub
		super.setUserName(userName);
	}

	@Override
	public String getPassWord() {
		// TODO Auto-generated method stub
		return super.getPassWord();
	}

	@Override
	public void setPassWord(String passWord) {
		// TODO Auto-generated method stub
		super.setPassWord(passWord);
	}

	@Override
	public String toString() {
		return "Admin [userName=" + userName + ", passWord=" + passWord + "]";
	}
	
}
