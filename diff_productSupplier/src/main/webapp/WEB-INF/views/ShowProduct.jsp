<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="header.html" %>
  <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2 style="color:lightgreen"><u>Product Lists</u></h2> 
<h3 style="color:blue">
<table border="2" style="border-color:cyan">
<tr>
<th>Product Name</th>
<th>Purchase Price</th>
<th>Sales Price</th>
<th>Stock</th>
</tr>
<c:forEach  items="${productList}" var="product">
<tr>
         <td>${product.productName}</td>
         <td>${product.purchasePrice}</td>
         <td>${product.salesPrice}</td>
         <td>${product.stock}</td>
        </tr>
         </c:forEach>
 </table>
 </h3>
 <a href="index.jsp">return</a>
 </div>
</body>
</html>