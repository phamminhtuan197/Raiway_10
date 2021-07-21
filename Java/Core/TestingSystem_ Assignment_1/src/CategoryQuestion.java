
public class CategoryQuestion {
	int				id;
	CategoryName	name;
	
	CategoryQuestion(int id, CategoryName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "CategoryQuestion [id=" + id + ",name=" + name + "]";
	}
}
