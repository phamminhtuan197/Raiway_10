
public class Answer {
	public Answer(int i, String string, Question questioni, boolean b) {
		id = i;
		content = string;
		question = questioni;
		isCorrect = b;
		
	}
	int			id;
	String		content;
	Question	question;
	boolean		isCorrect;
	public void display() {System.out.println(id + " " + content + " " + question + " " + isCorrect);}

		
	
}
