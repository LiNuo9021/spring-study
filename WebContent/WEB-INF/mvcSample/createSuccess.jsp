<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>用户创建成功</title>
</head>
<body>
      恭喜，用户${user.name}创建成功，您的年龄是${user.age}
   
   <img alt="" src="<c:url value='/resources/image/decorator.png'/>">   
      
</body>
</html>