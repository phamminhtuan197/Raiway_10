import java.util.Date;
public class Account {
	int			id;
	String		email;
	String		userName;
	String		fullName;
	Department	department;
	Position	position;
	Date		createDate;
	Group[]		groups;
	
	Account(int id,String email, String userName, String fullName, Department department, Position position){
		this.id=id;
		this.email=email;
		this.userName=userName;
		this.fullName=fullName;
		this.department=department;
		this.position=position;
	}
	
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", department=" + department + ", position=" + position + ", createDate=" + createDate + ", groups=" + groups + "]";
	}
}
