<%@page import="com.java.glt.Employ"%>
<%@page import="com.java.glt.EmployDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		int empno = Integer.parseInt(request.getParameter("empno"));
		EmployDAO dao = new EmployDAO();
		Employ employ = dao.searchEmploy(empno);
		if (employ!=null) {
			out.println("Employ Name   " +employ.getName() + "<br/>");
			out.println("Department  " +employ.getDept() + "<br/>");
			out.println("Designation  " +employ.getDesig() + "<br/>");
			out.println("Salary   " +employ.getBasic() + "<br/>");
		} else {
			out.println("*** Record Not Found ***");
		}
	%>
</body>
</html>