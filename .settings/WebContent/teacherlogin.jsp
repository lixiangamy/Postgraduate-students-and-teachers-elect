<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>导师登录</title>
</head>
<body>
<center>
   <s:form action="tlogin">
                <s:textfield name="temail" label="邮箱"></s:textfield>
                <s:textfield name="tnumber" label="密码"></s:textfield>
                <s:submit value="确定"/>
                <s:reset value="重置"/>
   </s:form>
</center>
</body>
</html>