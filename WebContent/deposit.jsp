<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>存款</title>
</head>
<body>
欢迎来到存款页面
<form action="<%= request.getContextPath() %>/depositServlet" method="post" name="depositForm">
		<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver" align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#E8E8E8">用户存款</td>
			</tr>
			<tr>
				<td>银行卡号：</td>
				<td><input type="text" name="accountNum"/></td>
			</tr>
			<tr>
				<td>金额：</td>
				<td><input type="text" name="money"/></td>
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