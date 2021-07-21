package backend.presentationlayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import backend.IGroup;
import backend.businesslayer.GroupService;
import database.Group;

public class GroupController implements IGroup {

	private static GroupService groupService;

	public GroupController() throws ClassNotFoundException, IOException, SQLException {
		groupService = new GroupService();
	}

	public ArrayList<Group> getListGroup() throws SQLException, IOException, ClassNotFoundException {
		return groupService.getListGroup();
	}

	public void createGroup(String groupname, int creatorID, String createdate) throws Exception {
		groupService.createGroup(groupname, creatorID, createdate);
	}

	public Group getGroupByID(int groupID) throws SQLException {
		return groupService.getGroupByID(groupID);
	}

	public boolean isGroupExists(String groupname) throws SQLException {
		return groupService.isGroupExists(groupname);
	}

	public boolean isGroupExists(int groupID) throws SQLException {
		return groupService.isGroupExists(groupID);
	}

	public void updateGroupByID(int groupID, String newGroupName) throws SQLException, Exception {
		groupService.updateGroupByID(groupID, newGroupName);
	}

	public void deleteGroup(int groupID) throws Exception {
		groupService.deleteGroup(groupID);
	}

}
