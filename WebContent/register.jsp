<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户注册</title>
</head>
<body>
欢迎来到注册页面
<form action="<%= request.getContextPath() %>/registerServlet" method="post" name="registerForm">
		<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver" align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#E8E8E8">用户注册</td>
			</tr>
			<tr>
				<td>银行卡号：</td>
				<td><input type="text" name="accountNum"/></td>
			</tr>
			<tr>
				<td>身份证号：</td>
				<td><input type="text" name="ID"/></td>
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="clientName"/></td>
			</tr>
			<tr>
				<td>地址：</td>
				<td><input type="text" name="address"/></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="tel"/></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><input type="text" name="password"/></td>
			</tr>
			<tr>
				<td>本金：</td>
				<td><input type="text" name="principal"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="submit"/>
					<input type="reset" name="reset"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>