<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 致狗蛋最爱的狗剩.狗蛋:狗剩狗剩我爱你 -->
	<form action="${pageContext.request.contextPath }/getShoepadDatas.do" method="post" enctype="multipart/form-data">
		<input type="text" name="userId"> 右脚校验码<br>
		<input type="file" name="rightFile"> 文件上传1 <br>
		<input type="file" name="leftFile"> 文件上传 2<br>
		<input type="text" name="access_token"> access_token<br>
		<input type="text" name="creationtime"> 此数据测量的时间<br>
		<input type="text" name="type"> 类型<br>
		<input type="text" name="name"> 姓名<br>
		<input type="text" name="gender"> 性别<br>
		<input type="text" name="age"> 年龄<br>
		<input type="text" name="height"> 身高<br>
		<input type="text" name="weight"> 体重<br>
		<input type="text" name="phone"> 电话<br>
		<input type="text" name="tag"> 目的<br>
		<input type="text" name="leftchecksum"> 左脚校验码<br>
		<input type="text" name="rightchecksum"> 右脚校验码<br>
		<input type="submit" value="提交"> <br>
	</form>
</body>
</html>