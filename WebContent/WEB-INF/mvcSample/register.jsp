<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>新增用户</title>
</head>
<body>
  <form method="post" action="<c:url value="/user/save2"/>">
    <table>
	    <tr>
	       <td>用户名：</td>
	       <td><input type="text" name="name"  value="${user.name}"/></td>
	    </tr>
	    <tr>
	     <td>年龄：</td>
	       <td><input type="text" name="age" value="${user.age}"/></td>
	    </tr>
	    <tr>
	     <td colspan="2"><input type="submit" name="提交"/></td>
	    </tr>	    
    </table>
  </form>
</body>
</html>