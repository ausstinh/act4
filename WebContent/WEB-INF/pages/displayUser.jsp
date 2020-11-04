<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>User Information</h2>
<table>
	<tr>
		<th><label>First Name</label></th>
		<th><label>Last Name</label></th>
	</tr>
	
	<c:forEach var="user" items="${users}">
		<tr>
			<td><label>${user.firstName}</label></td>
			<td><label>${user.lastName}</label></td>
		</tr>
	</c:forEach>
	
	<tr>
		<td colspan= "2">
		<a href="add">Add a User</a>
		</td>
	</tr>
</table>