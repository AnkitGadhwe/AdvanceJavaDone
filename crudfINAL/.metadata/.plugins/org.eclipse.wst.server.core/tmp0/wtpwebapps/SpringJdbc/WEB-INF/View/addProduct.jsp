<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Product</title>
</head>
<body>
  <form action="formdatasubmit" Method="Post">
     Id : <input type="number" placeholder="Enter Id" id="proid" name="proid"/>
     Product Name : <input type="text" placeholder="Enter name" id="proname" name="proname"/>
     Rate : <input type="number" placeholder="Enter Rate" id="prorate" name="prorate"/>
     <button>Submit</button>
  </form>
</body>
</html>