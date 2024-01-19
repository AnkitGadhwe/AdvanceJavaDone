<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   <h1>Product Table</h1>
   <table border=1>
   <thead>
   <tr>
   <th>Id</th>
   <th>Name</th>
   <th>Rate</th>
   </tr>
   </thead>
   <tbody>
   <c:forEach var="p" items="${list}">
     <tr>
     <td>${p.id}</td>
     <td>${p.name}</td>
     <td>${p.rate}</td>
     <td><a href="Editproduct/${p.id}">Edit</a></td>
     <td><a href="Deleteproduct/${p.id}">Delete</a></td>
     </tr>
   </c:forEach>
   </tbody>
   </table>
   <a href="addProduct">Add Product</a>
</body>


</html>