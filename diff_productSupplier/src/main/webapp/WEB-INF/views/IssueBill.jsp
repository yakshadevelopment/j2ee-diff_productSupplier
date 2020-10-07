<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="header.html" %>
  <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="color:red">
<h2 style="color:blue"><u>Customer Bill</u></h2> 
<h3>
Customer Name:${customerName}
<table border="2" style="border-color:yellow">
<tr>
<th>Product Name</th>
<th>Sales Price</th>
<th>Quantity</th>
<th>Amount</th>
</tr>
<c:forEach  items="${itemList}" var="billItem">
<tr>
<c:set var="arrayofItem" value="${fn:split(billItem,',')}"/>
<c:forEach var="i" begin="0" end="3">
          <td> ${arrayofItem[i]}</td>
   </c:forEach>
       </tr>
         </c:forEach>
         <tr>
         <td/><td/>
         <td>Total</td>
         <td>${totalAmount}</td>
         </tr>
         
 </table>
 <a href="index.jsp">Return</a>
</body>
</html>