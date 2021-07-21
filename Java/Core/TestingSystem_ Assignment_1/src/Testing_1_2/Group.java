package Testing_1_2;
import java.util.Date;

public class Group {
	int			id;
	String		name;
	Account 	creator;
	public Date		createDate;
	public Account[]	accounts;

	public Group(int id, String name, Account creator) {
		this.id=id;
		this.name=name;
		this.creator=creator;
	}
	
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator + ", createDate=" + createDate + ", accounts=" + accounts + "]";
	}
}
