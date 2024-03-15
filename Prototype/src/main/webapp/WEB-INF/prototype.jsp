
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.prototype.Button" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Prototype Pattern Demo</title>
</head>
<body>
    <h1>Prototype Pattern Demo</h1>
    
 <%
        // Accessing the clonedButton attribute set in the servlet
  Button clonedButton = (Button) request.getAttribute("clonedButton");
 %>
    
    <p>Cloned Button:</p>
    <p>X: <%= clonedButton.getX() %></p>
    <p>Y: <%= clonedButton.getY() %></p>
    <p>Color: <%= clonedButton.getColor() %></p>
</body>
</html>
