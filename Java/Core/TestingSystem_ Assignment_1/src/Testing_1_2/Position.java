package Testing_1_2;

public class Position {
	int				id;
	PositionName	name;
	
	public Position(int id, PositionName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
}
