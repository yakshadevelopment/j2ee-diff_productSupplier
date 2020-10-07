<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ include file="header.html" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<div align="center" style="color:magenta">
<h2 style="color:lightgreen"><u>Product Issue To Customer</u></h2>
<form action="ProductServlet" method="post" id="issueForm">
<input type="hidden" name="hidden" value="2"/>
<h3>
Enter Customer Name <input type="text"  name="customerName" required/>
</h3>
<br/><br/>
<h4>
<table border="1" style="border-color:#FF5733">
<tr>
<th>No.</th>
<th>Enter Product name</th>
<th>Quantity Sale</th>
</tr>
<tr>
<td>1</td>
<td><input type="text" name="productName1"  value="--" required/></td>
<td><input type="text" name="quantity1" value="0" id="quantity1" required/></td>
</tr><tr>
<td>2</td>
<td><input type="text" name="productName2"  value="--"/></td>
<td><input type="text" name="quantity2" value="0"/></td>
</tr><tr>
<td>3</td>
<td><input type="text" name="productName3"  value="--"/></td>
<td><input type="text" name="quantity3" value="0"/></td>
</tr><tr>
<td>4</td>
<td><input type="text" name="productName4"  value="--"/></td>
<td><input type="text" name="quantity4" value="0"/></td>
</tr><tr>
<td>5</td>
<td><input type="text" name="productName5"  value="--"/></td>
<td><input type="text" name="quantity5" value="0"/></td>
</tr>
</table>
</h4>
<br/>
<button type="reset">reset</button>
<button type="submit">Submit</button>
</form>
</body>
</html>