package commands;

import database.DBHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AddMembersToAGroupChat {

    DBHandler dbHandler;
    String adminUserNumber;
    String numberOfMemberToBeAdded;
    int groupChatId;

    /**
     * Constructor
     *
     * @param dbHandler
     * @param adminUserNumber
     * @param numberOfMemberToBeAdded
     * @param groupChatId
     *
     */

    public AddMembersToAGroupChat(DBHandler dbHandler, String adminUserNumber, String numberOfMemberToBeAdded, int groupChatId) {
        this.dbHandler = dbHandler;
        this.adminUserNumber = adminUserNumber;
        this.numberOfMemberToBeAdded = numberOfMemberToBeAdded;
        this.groupChatId = groupChatId;
    }

    /**
     * Execute the add members to a group chat command
     * Check first that this adminUsernumber is an admin of this group chat and add the members
     *
     * @return Result Set
     * @throws SQLException
     */
    public ResultSet execute() throws SQLException {


        String add_member_to_a_group_chat = "SELECT add_members_to_a_group_chat(" + "'" + adminUserNumber + "'" + ", " + "'" + groupChatId + "'"+", " + "'" + numberOfMemberToBeAdded + "'" + ");";
        return this.dbHandler.executeSQLQuery(add_member_to_a_group_chat);
    }
}
