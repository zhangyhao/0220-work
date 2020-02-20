<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="list" method="post">
时间查询:<input type="text" name="dt1" value="${dt1}">--<input type="text" name="dt2" value="${dt2}">
<select name="select">
	<option value="1">创建时间</option>
	<option value="2">修改时间</option>
</select>

<input type="submit" value="查询">
<table>
	<tr>
		<td>编号</td>
		<td>标题</td>
		<td>热门</td>
		<td>状态</td>
		<td>创建时间</td>
		<td>修改时间</td>
	</tr>
	<c:forEach items="${list}" var="l">
	<tr>
		<Td>${l.id}</Td>
		<Td>${l.title}</Td>
		<Td>${l.hot==0?'非热门':'热门'}</Td>
		<Td>${l.status==0?'未审核':'审核'}</Td>
		<td><fmt:formatDate value="${l.created}"/></td>
		<td><fmt:formatDate value="${l.updated}"/></td>
	</tr>
	</c:forEach>
</table>
</form>
</body>
</html>