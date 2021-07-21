package backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import backend.IGroup;
import backend.datalayer.GroupRepository;
import database.Group;

public class GroupService implements IGroup {

	private static GroupRepository groupRepository;

	public GroupService() throws IOException, ClassNotFoundException, SQLException {
		groupRepository = new GroupRepository();
	}

	public ArrayList<Group> getListGroup() throws SQLException, IOException, ClassNotFoundException {
		return groupRepository.getListGroup();
	}

	public void createGroup(String groupname, int creatorID, String createdate) throws Exception {
		groupRepository.createGroup(groupname, creatorID, createdate);
	}

	public Group getGroupByID(int groupID) throws SQLException {
		return groupRepository.getGroupByID(groupID);
	}

	public boolean isGroupExists(String groupname) throws SQLException {
		return groupRepository.isGroupExists(groupname);
	}

	public boolean isGroupExists(int groupID) throws SQLException {
		return groupRepository.isGroupExists(groupID);
	}

	public void updateGroupByID(int groupID, String newGroupName) throws SQLException, Exception {
		groupRepository.updateGroupByID(groupID, newGroupName);
	}

	public void deleteGroup(int groupID) throws Exception {
		groupRepository.deleteGroup(groupID);
	}

}
