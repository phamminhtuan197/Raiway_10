package database;

import java.time.LocalDate;

public class Group {
	int groupID;
	String groupname;
	int creatorID;
	LocalDate createdate;

	public int getGroupID() {
		return groupID;
	}

	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

	public int getCreatorID() {
		return creatorID;
	}

	public void setCreatorID(int creatorID) {
		this.creatorID = creatorID;
	}

	public LocalDate getCreatedate() {
		return createdate;
	}

	public void setCreatedate(String createdate) {
		this.createdate = LocalDate.parse(createdate);
	}

	public Group(int groupID, String groupname, int creatorID, String createdate) {
		super();
		this.groupID = groupID;
		this.groupname = groupname;
		this.creatorID = creatorID;
		this.createdate = LocalDate.parse(createdate);
	}

	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupname=" + groupname + ", creatorID=" + creatorID + ", createdate="
				+ createdate + "]";
	}

	public Group() {
		super();
	}

}
