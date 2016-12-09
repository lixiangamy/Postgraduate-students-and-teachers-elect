<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!doctype html>
<html>
<head>
	<title>学生登录</title>
    <link type="text/css" rel="stylesheet" href="css/login.css">
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
</head>
<body class="login_bj" >
<div class="zhuce_body">
	<div class="logo"><img src="images/logo.png" width="330" height="60" border="0"></div>
    <div class="zhuce_kong login_kuang">
    	<div class="zc">
        	<div class="bj_bai">
            <h3>登录</h3>
       	  	  <s:form action="slogin">
                <input name="semail" type="text" class="kuang_txt" placeholder="邮箱">
                <input name="snumber" type="password" class="kuang_txt" placeholder="密码">
                <s:submit value="登录" class="btn_zhuce"/>
                </s:form>
            </div>
        	
        </div>
      
    </div>

</div>
    
</body>
</html>