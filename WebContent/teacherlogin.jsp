<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导师登录</title>
</head>
<body style="background:url('D:/t012e2f3f94da_副本_副本_副本.jpg') no-repeat;">
<center>
<br>
</br>
<br>
</br>
<br>
</br>
<br>
</br>
<br>
</br>
   <s:form action="tlogin">
                <s:textfield name="temail" label="邮箱"></s:textfield>
               <s:password name="tnumber" label="密码"></s:password>
                <s:submit value="确定"/>
                <s:reset value="重置"/>
   </s:form>
</center>
</body>
</html>