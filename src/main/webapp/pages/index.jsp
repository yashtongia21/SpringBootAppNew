<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

			<h2>Employee Management</h2>
		
		
			<a href="home">Home</a>
			<a href="addEmp">New Employee</a>
		





	<h3>Employees List</h3>
	<c:choose>
		<c:when test="${emps==null || emps.size()==0 }">
			<h4>No Employees Found</h4>
		</c:when>
		<c:otherwise>
			<h4>${emps.size() } Employees(s) Found</h4>
			<table>
				<tr>
					<th>Emp#</th>
					<th>Name</th>
					<th>Basic</th>
					<th>Hra</th>
					<th>Department</th>
				</tr>
				<c:forEach items="${emps }" var="emp">
					<tr>
					<th>${emp.empid }</th>
					<th>${emp.name }</th>
					<th>${emp.basic }</th>
					<th>${emp.hra }</th>
					<th>${emp.dept }</th>
					<th>
						<a href="editEmp?empid=${emp.empid }">Edit</a>
						<span></span>
						<a href="delEmp?empid=${emp.empid }">Delete</a>
					</th>
				</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>

	
</body>
</html>