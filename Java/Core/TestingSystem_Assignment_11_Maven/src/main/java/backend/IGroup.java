package backend;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import database.Group;

public interface IGroup {
	ArrayList<Group> getListGroup() throws SQLException, IOException, ClassNotFoundException;

	void createGroup(String groupname, int creatorID, String createdate) throws Exception;

	Group getGroupByID(int groupID) throws SQLException;

	boolean isGroupExists(String groupname) throws SQLException;

	boolean isGroupExists(int groupID) throws SQLException;

	void updateGroupByID(int groupID, String newGroupName) throws SQLException, Exception;

	void deleteGroup(int groupID) throws Exception;
}
