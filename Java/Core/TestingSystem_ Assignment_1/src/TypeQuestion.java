
public class TypeQuestion {
	int			id;
	TypeName	name;
	
	TypeQuestion(int id, TypeName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "TypeQuestion [id=" + id + ", name=" + name + "]";
	}
}
