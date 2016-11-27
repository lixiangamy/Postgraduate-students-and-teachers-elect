<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理</title>
</head>
<body style="background:url('D:/t012e2f3f94da_副本_副本.jpg') no-repeat;">	
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
<a href="sinfor?semail=${semail}&sna=<s:property value="sna"/>">个人信息</a> 
        
<a href="stui?semail=${semail}&sna=<s:property value="sna"/>">系统推荐</a> 
        
<a href="schoose?semail=${semail}&sna=<s:property value="sna"/>">选择导师</a> 
        
<a href="syi?semail=${semail}&sna=<s:property value="sna"/>">已申请导师</a> 
        
<a href="syao?semail=${semail}&sna=<s:property value="sna"/>">导师邀请</a> 
</center>
</body>
</html>