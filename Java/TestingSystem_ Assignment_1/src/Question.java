import java.util.Date;

public class Question {
	int					id;
	String				content;
	CategoryQuestion	category;
	TypeQuestion		type;
	Account				creator;
	Date				createDate;
	Exam[]				exams;
	
	Question(int id, String content, CategoryQuestion category, TypeQuestion type, Account creator) {
		this.id=id;
		this.content=content;
		this.category=category;
		this.type=type;
		this.creator=creator;
	}
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", category=" + category + ", type=" + type
				+ ", creator=" + creator + ", createDate=" + createDate + ", exams=" + exams + "]";
	}
		
	
}
