<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>


	<h3>Books List</h3>
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
				<c:forEach items="${empss }" var="emp">
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

