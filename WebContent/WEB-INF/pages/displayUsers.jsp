<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>User Information</h2>
<table>
	<tr>
		<th><label>First Name</label></th>
		<th><label>Last Name</label></th>
		<th><label>Gender</label></th>
	</tr>
	
	<c:forEach var="user" items="${users}">
		<tr>
			<td><label>${user.firstName}</label></td>
			<td><label>${user.lastName}</label></td>
			<td><label>
				<c:choose>
					<c:when test="${user.gender == 1}">
						Male
					</c:when>
					<c:when test="${user.gender == 2}">
						Female 
					</c:when>
				</c:choose>
			</label></td>
		</tr>
	</c:forEach>
	
	<tr>
		<td colspan= "2">
		<a href="add">Add a User</a>
		</td>
	</tr>
</table>
