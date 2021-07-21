
public class Answer {
	int			id;
	String		content;
	Question	question;
	boolean		isCorrect;
	
	Answer(int id, String content, Question question, boolean isCorrect) {
		this.id=id;
		this.content=content;
		this.question=question;
		this.isCorrect=isCorrect;
	}
	
	public String toString() {
		return "Answer [id=" + id + ", content="+ content + ", question=" + question + ", isCorrect="+ isCorrect + "]";
	}
}
