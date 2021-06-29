import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AgentDao {

	Connection connection;
	PreparedStatement pst;
	
	public String addAgent(Agent agent) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Agent(Name,City,Gender,MaritalStatus,Premium) "
				+ " values(?, ?, ?, ?, ?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, agent.getName());
		pst.setString(2, agent.getCity());
		String gen = String.valueOf(agent.getGender());
		pst.setString(3, gen);
		pst.setInt(4, agent.getMaritalStatus());
		pst.setDouble(5, agent.getPremium());
		pst.executeUpdate();
		return "Record Added Successfully...";
	}
}
