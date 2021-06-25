import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployShowAll {

	public static void main(String[] args) {
		try {
			Connection con = ConnectionHelper.getConnection();
			String cmd = "select * from Employ";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(cmd);
			while(rs.next()) {
				System.out.println("Employ No  " +rs.getInt("empno"));
				System.out.println("Employ Name  " +rs.getString("name"));
				System.out.println("Department   " +rs.getString("dept"));
				System.out.println("Designation   " +rs.getString("desig"));
				System.out.println("Basic   " +rs.getInt("basic"));
				System.out.println("--------------------------------------");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
