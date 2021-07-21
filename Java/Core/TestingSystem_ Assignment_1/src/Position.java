
public class Position {
	int				id;
	PositionName	name;
	
	Position(int id, PositionName name) {
		this.id=id;
		this.name=name;
	}
	
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
}
