import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	Connection connection;
	PreparedStatement pst;
	
	public String addUser(String user, String passCode) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into login values(?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, passCode);
		pst.executeUpdate();
		
		return "Account Created...";
	}
	public int authenticate(String user, String passCode) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt  from Login where userName=? AND passcode=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, passCode);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}
}
