<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>重复选学生</title>
</head>
<body>
<center>
<tr>
<td>
您好，
<s:property value="tna"/>
导师！
</td>
</tr>
<br>
</br>
<a href="tinfor?temail=${temail}&tna=${tna}">个人信息</a> 
        
<a href="ttui?temail=${temail}&tna=${tna}">系统推荐</a> 
        
<a href="tchoose?temail=${temail}&tna=${tna}">选择学生</a> 
        
<a href="tyi?temail=${temail}&tna=${tna}">已邀请学生</a> 
        
<a href="tyao?temail=${temail}&tna=${tna}">学生申请</a> 
<h1>已经成功与学生互选，禁止再次邀请学生</h1>
</center>
</body>
</html>