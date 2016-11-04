<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生登录</title>
</head>
<body>
<center>
   <s:form action="slogin">
                <s:textfield name="semail" label="邮箱"></s:textfield>
                <s:password name="snumber" label="密码"></s:password>
                <s:submit value="确定"/>
                <s:reset value="重置"/>
   </s:form>
</center>
</body>
</html>