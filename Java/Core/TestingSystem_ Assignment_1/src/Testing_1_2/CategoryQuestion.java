package Testing_1_2;

public class CategoryQuestion {
	int				id;
	CategoryName	name;
	
	public CategoryQuestion(int id, CategoryName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "CategoryQuestion [id=" + id + ",name=" + name + "]";
	}
}
