<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ include file="header.html" %>
  <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Purchase Product</title>



</head>
<body>
<div align="center">
<h2 style="color:lightgreen"><u>Product Purchase</u></h2> 

<form action="ProductServlet" method="post" id="purchaseForm">
<input type="hidden" name="hidden" value="1"/>
<h3>
Pick Up Supplier Name <select id="supplierName" name="supplierPerson">
<c:forEach  items="${supplierList}" var="supplier">
<option value="${supplier}">${supplier}</option>
   </c:forEach>
</select>
</h3>
<h3>
<table>
<tr>
<td>Enter Product name</td>
<td><input type="text" name="productName" required/></td>
</tr>
<tr>
<td>Enter Purchase Price</td>
<td><input type="text" name="purchasePrice" id="purchasePrice" required/></td>
</tr><tr>
<td>Enter Sales Price</td>
<td><input type="text" name="salesPrice" id="salesPrice" required/></td>
</tr><tr>
<td>Enter Purchase Quantity</td>
<td><input type="text" name="purchaseQuantity" id="purchaseQuantity" value="0" required/></td>
</tr><tr>
<td><button type="reset">reset</button></td>
<td><button type="submit">submit</button></td>
</tr>
</table>
</h3>
</form>
</div>
</body>
</html>