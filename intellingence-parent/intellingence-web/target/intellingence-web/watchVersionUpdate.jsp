<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>低调低调</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/uploadByWatch.do" method="post" enctype="multipart/form-data">
		<input type="file" name="file"> 文件 <br>
		<input type="password" name="password"> 上传密匙(公司里最帅的是谁?)<br>
		<input type="text" name="versioncode"> 整型的版本号<br>
		<input type="text" name="versionname"> 版本号<br>
		<input type="text" name="remark"> 版本说明<br>
		<input type="submit" value="提交"> <br>
	</form>
</body>
</html>