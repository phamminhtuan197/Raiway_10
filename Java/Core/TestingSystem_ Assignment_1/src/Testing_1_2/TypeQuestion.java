package Testing_1_2;

public class TypeQuestion {
	int			id;
	TypeName	name;
	
	public TypeQuestion(int id, TypeName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "TypeQuestion [id=" + id + ", name=" + name + "]";
	}
}
