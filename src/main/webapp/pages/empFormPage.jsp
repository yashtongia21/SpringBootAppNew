<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri= "http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri= "http://java.sun.com/jstl/core_rt" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	


		<h1>Employee Form</h1>
		
		<form:form action="saveEmp" modelAttribute="emp" method="POST">
			<div>
				<form:label path="empid">Employee Id:</form:label>
				<c:choose>
					<c:when test="${emp.empid==0 }">
						<form:input path="empid" type="number" />
					</c:when>
					<c:otherwise>
						<form:input path="empid" type="number" readonly="true"/>
					</c:otherwise>
				</c:choose>
			</div>
			<div>
				<form:label path="name">Employee Name:</form:label>
				<form:input path="name" />
			</div>
			<div>
				<form:label path="basic">Employee Basic:</form:label>
				<form:input path="basic" type="decimal"/>
			</div>
			<div>
				<form:label path="hra">Employee hra </form:label>
				<form:input path="hra" type="decimal"/>
			</div>
			
			<div>
				<form:label path="dept">Employee department:</form:label>
				<form:select path="dept">
					<form:option value="">--SELECT--</form:option>
					<form:options items="${possibCatgs }"/>
				</form:select>
			</div>
			
			<div>
				<form:button type="submit">Submit</form:button>
			</div>
		</form:form>
	

</body>
</html>