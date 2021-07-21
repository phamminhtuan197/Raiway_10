package Testing_1_2;
import java.util.Date;

public class Exam {
	int					id;
	int					code;
	String				title;
	CategoryQuestion	category;
	int					duration;
	Account				creator;
	public Date				createDate;
	public Question[]			questions;

	public Exam(int id, int code, String title, CategoryQuestion category, int duration, Account creator){
		this.id=id;
		this.code=code;
		this.title=title;
		this.category=category;
		this.duration=duration;
		this.creator=creator;
	}
	
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", category="
				+ category + ", duration=" + duration + ", creator=" + creator + ", createDate=" + createDate + ", questions=" + questions + "]";
	}
}
