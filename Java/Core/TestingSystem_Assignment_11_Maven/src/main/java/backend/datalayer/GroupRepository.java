package backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import backend.IGroup;
import database.Account;
import database.Group;
import utils.DatabaseProperties;
import utils.JdbcUtils;

public class GroupRepository implements IGroup {
	private JdbcUtils jdbcUtils;
	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultSet;
	private static PreparedStatement preparedStatement;
	private static DatabaseProperties databaseProperties;

	public GroupRepository() throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		jdbcUtils = new JdbcUtils();
		connection = jdbcUtils.connect();
		databaseProperties = new DatabaseProperties();
	}

	public ArrayList<Group> getListGroup() throws SQLException, IOException, ClassNotFoundException {
		ArrayList<Group> groups = new ArrayList<Group>();
		String sql = "SELECT * FROM `group`;";
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		while (resultSet.next()) {
			Group group = new Group(resultSet.getInt("groupID"), resultSet.getString("groupname"),
					resultSet.getInt("creatorID"), resultSet.getString("createdate"));

			groups.add(group);
		}
		return groups;
	}

	public void createGroup(String groupname, int creatorID, String createdate) throws Exception {
		if (isGroupExists(groupname)) {
			throw new Exception(databaseProperties.getProperty("GROUP_IS_EXISTS"));
		} else {
			String createGroup = "INSERT INTO `group` (groupname, creatorID, createdate) VALUES (?,?,?);";
			preparedStatement = connection.prepareStatement(createGroup);
			preparedStatement.setString(1, groupname);
			preparedStatement.setInt(2, creatorID);
			preparedStatement.setString(3, createdate);
			preparedStatement.executeUpdate();
			System.out.println(databaseProperties.getProperty("CREATE_GROUP_COMPLETE"));
		}
	}

	public Group getGroupByID(int groupID) throws SQLException {
		String printGroupByID = "SELECT * FROM `group` WHERE groupID = ?;";
		preparedStatement = connection.prepareStatement(printGroupByID);
		preparedStatement.setInt(1, groupID);
		resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			Group group = new Group(resultSet.getInt("groupID"), resultSet.getString("groupname"),
					resultSet.getInt("creatorID"), resultSet.getString("createdate"));

			return group;
		} else {
			System.out.println(databaseProperties.getProperty("CANNOT_FIND_GROUP_BY_ID") + groupID);
			return null;
		}
	}

	public boolean isGroupExists(String groupname) throws SQLException {
		String searchGroup = "SELECT * FROM `group` WHERE groupname = ?;";
		preparedStatement = connection.prepareStatement(searchGroup);
		preparedStatement.setString(1, groupname);
		resultSet = preparedStatement.executeQuery();

		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isGroupExists(int groupID) throws SQLException {
		String sql = "SELECT * FROM `group` WHERE groupID = ?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, groupID);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
			return true;
		} else {
			return false;
		}
	}

	public void updateGroupByID(int groupID, String newGroupName) throws SQLException, Exception {
		if (!isGroupExists(groupID)) {
			throw new Exception(databaseProperties.getProperty("CANNOT_FIND_GROUP_BY_ID") + groupID);
		} else {
			if (isGroupExists(newGroupName)) {
				throw new Exception(databaseProperties.getProperty("GROUP_NAME_IS_EXISTS"));
			} else {
				String updateGroupName = "UPDATE `group` SET groupname = ? WHERE groupID = ?;";
				preparedStatement = connection.prepareStatement(updateGroupName);
				preparedStatement.setString(1, newGroupName);
				preparedStatement.setInt(2, groupID);
				preparedStatement.executeUpdate();
				System.out.println(databaseProperties.getProperty("UPDATE_SUCCESS"));
			}
		}
	}

	public void deleteGroup(int groupID) throws Exception {
		if (!isGroupExists(groupID)) {
			throw new Exception(databaseProperties.getProperty("CANNOT_FIND_GROUP_BY_ID") + groupID);
		} else {
			String deleteGroup = "DELETE FROM `group` WHERE groupID = ?;";
			preparedStatement = connection.prepareStatement(deleteGroup);
			preparedStatement.setInt(1, groupID);
			preparedStatement.executeUpdate();
			System.out.println(databaseProperties.getProperty("DELETE_GROUP_COMPLETE"));
		}
	}

}
