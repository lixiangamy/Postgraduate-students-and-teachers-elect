<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导师信息管理</title>
</head>
<body>	
您好，
<s:property value="tname"/>
老师！
<br>
</br>

<a href="tinfor?temail=${temail}">个人信息</a> 
        
<a href="ttui?temail=${temail}">系统推荐</a> 
        
<a href="tchoose?temail=${temail}">选择学生</a> 
        
<a href="tyi?temail=${temail}">已邀请学生</a> 
        
<a href="tyao?temail=${temail}">学生申请</a> 
</body>
</html>