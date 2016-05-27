<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
	color:#000;
	font-size: 14px;
	margin:20px auto;
}
</style>
<script type="text/javascript">
	function check(form) {
		if (document.forms.securityForm.user.value=="") {
			alert("请输入账户名！");
			document.forms.securityForm.user.focus();
			return false;
		}
		if (document.forms.securityForm.npwd.value=="") {
			alert("请输入密码！");
			document.forms.securityForm.npwd.focus();
			return false;
		}
		if (document.forms.securityForm.rnpwd.value=="") {
			alert("请输入密码！");
			document.forms.securityForm.rnpwd.focus();
			return false;
		}
		if(document.forms.securityForm.npwd.value!=document.forms.securityForm.rnpwd.value) {
			alert("两次密码不一致！");
			return false;
		}
		
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%= request.getContextPath() %>/securityServlet" method="post" name="securityForm">
		<table border="1" cellspacing="0" cellpadding="5" bordercolor="silver" align="center">
			<tr>
				<td colspan="2" align="center" bgcolor="#E8E8E8">安全中心</td>
			</tr>
			<tr>
				<td>请输入账户号：</td>
				<td><input type="text" name="user"/></td>
			</tr>
			<tr>
				<td>请输入新密码：</td>
				<td><input type="password" name="npwd"/></td>
			</tr>
			<tr>
				<td>请输入新密码：</td>
				<td><input type="password" name="rnpwd"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="submit" onclick="return check(this)"/>
					<input type="reset" name="reset"/>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>