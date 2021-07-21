package utils;

import java.io.Serializable;

public class MoneyCard implements Serializable {
	String userName;
	String nameCard;
	String codeCard;
	int valueCard;

	public String getNameCard() {
		return nameCard;
	}

	public void setNameCard(String nameCard) {
		this.nameCard = nameCard;
	}

	public String getCodeCard() {
		return codeCard;
	}

	public void setCodeCard(String codeCard) {
		this.codeCard = codeCard;
	}

	public int getValueCard() {
		return valueCard;
	}

	public void setValueCard(int valueCard) {
		this.valueCard = valueCard;
	}

	public MoneyCard(String userName, String nameCard, String codeCard, int valueCard) {
		super();
		this.userName = userName;
		this.nameCard = nameCard;
		this.codeCard = codeCard;
		this.valueCard = valueCard;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public MoneyCard() {
	}

	@Override
	public String toString() {
		return "MoneyCard [userName=" + userName + ", nameCard=" + nameCard + ", codeCard=" + codeCard + ", valueCard="
				+ valueCard + "]";
	}

}
