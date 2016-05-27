<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SEwork登陆</title>
<link href="login.css" type="text/css" rel="stylesheet">

</head>
<body>
<form action="<%= request.getContextPath() %>/loginServlet" method="post" name="loginForm">
    <div id="login_head">
        <div id="login_head_contian">
            <div id="login_head_title">个人网银登陆</div>
            <div id="login_head_value">
                <ul id="login_head_list">
                    <li><a href="#">首页</a></li>
                    <li><a href="register.jsp">注册</a></li>
                    <li><a href="#">安全保障</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div id="login_body">
        <div id="login_body_logn">
            <div id="login_body_logn_head">用户登陆</div>
            <div id="login_body_table">
                    <div class="textbox">
                        <input type="text" name="accountNum" class="textbox_input" tabindex="1" placeholder="用户名"/>
                    </div>
                    <div class="textbox">
                        <input type="password" name="password" class="textbox_input" tabindex="2" placeholder="输入密码"/>
                    </div>
                    <div class="forget">
                        <label><input type="checkbox" class="hostpassward">记住密码</label>
                        <a href="#" id="ald">忘记密码?</a>
                    </div>
                    <div class="login_button">
                    	<button type="submit" id="btn" tabindex="3" onclick="return check(this)">登陆</button>
                        <!-- <input type="submit" id="btn" tabindex="3" value="登陆"/> -->
                    </div>
            </div>
        </div>
    </div>
    <div id="login_bottom"></div>	
</form>
<script type="text/javascript">
	function check(form) {
		if (document.forms.loginForm.accountNum.value=="") {
			alert("请输入用户名！");
			document.forms.loginForm.accountNum.focus();
			return false;
		}
		if (document.forms.loginForm.password.value=="") {
			alert("请输入密码！");
			document.forms.loginForm.password.focus();
			return false;
		}
		
	} 
</script>
</body>
</html>