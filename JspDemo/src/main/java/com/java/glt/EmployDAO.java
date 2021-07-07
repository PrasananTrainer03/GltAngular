package com.java.glt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String updateEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		Employ res = searchEmploy(employ.getEmpno());
		if (res!=null) {
			String cmd = "Update Employ set Name=?, Dept=?, Desig=?,  "
					+ " Basic = ? where empno = ?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, employ.getName());
			pst.setString(2, employ.getDept());
			pst.setString(3, employ.getDesig());
			pst.setInt(4, employ.getBasic());
			pst.setInt(5, employ.getEmpno());
			pst.executeUpdate();
			return "Record Updated...";
		} else {
			return "Record Not Found...";
		}
	}
	public String deleteEmploy(int empno) throws SQLException, ClassNotFoundException {
		Employ res = searchEmploy(empno);
		if (res!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "Delete from Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Record Deleted...";
		} else {
			return "Record Not Found...";
		}
		
	}
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if (rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
		}
		return employ;
	}
	
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ Values(?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employ.getEmpno());
		pst.setString(2, employ.getName());
		pst.setString(3, employ.getDept());
		pst.setString(4, employ.getDesig());
		pst.setInt(5, employ.getBasic());
		pst.executeUpdate();
		return "Record Inserted Successfully...";
	}
}
