<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Product Discount Calculator </title>
</head>
<body>
<h3>Product Discount Calculator</h3><br/>
<form action="${pageContext.request.contextPath}/discount-servlet" method="post">
  <input type="text" name="Product_Description" placeholder="Product Description"/> <br/><br/>
  <input type="text" name="price" placeholder="List Price"/> <br/><br/>
  <input type="text" name="percent" placeholder="Discount Percent"/> <br/><br/>
  <input type="submit"  name="Submit" />
</form>
</body>
</html>