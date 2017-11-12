<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Calc" method="get" align="center">
	Number 1 <input type="text" name="t1" value="${t1}"><br>
	Number 2 <input type="text" name="t2" value="${t2}"><br>
	<input type="submit" value="Add" name="add" id="add">
	<input type="submit" value="Subtract" name="sub" id = "sub"><br>
	Result = ${Calc}
	
</form>	
</body>
</html>