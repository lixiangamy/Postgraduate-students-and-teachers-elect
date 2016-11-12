<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>重复选导师</title>
</head>
<body>
<center>
<tr>
<td>
您好，
<s:property value="sna"/>
同学！
</td>
</tr>
<br>
</br>
<a href="sinfor?semail=${semail}&sna=${sna}">个人信息</a> 
        
<a href="stui?semail=${semail}&sna=${sna}">系统推荐</a> 
        
<a href="schoose?semail=${semail}&sna=${sna}">选择导师</a> 
        
<a href="syi?semail=${semail}&sna=${sna}">已申请导师</a> 
        
<a href="syao?semail=${semail}&sna=${sna}">导师邀请</a> 
<h1>无</h1>
</center>
</body>
</html>