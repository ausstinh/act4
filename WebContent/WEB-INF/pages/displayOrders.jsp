<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<h2>User Information</h2>
<table>
	<tr>
		<th><label>Order No</label></th>
		<th><label>Order Price</label></th>
		<th><label>Product Name</label></th>
		<th><label>Quantity</label></th>
	</tr>
	
	<c:forEach var="order" items="${orders}">
		<tr>
			<td><label>${order.orderNo}</label></td>
			<td><label>${order.price}</label></td>
			<td><label>${order.productName}</label></td>
			<td><label>${order.quantity}</label></td>
		</tr>
	</c:forEach>
	
	<tr>
		<td colspan= "2">
		<a href="add">Add a User</a>
		</td>
	</tr>
</table>