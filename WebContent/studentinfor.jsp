<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息</title>
</head>
<body>	
<center>
<tr>
<td>
您好，
<s:property value="sname"/>
同学！
</td>
</tr>
<br>
</br>
<a href="sinfor?semail=${semail}">个人信息</a> 
        
<a href="stui?semail=${semail}">系统推荐</a> 
        
<a href="schoose?semail=${semail}">选择导师</a> 
        
<a href="syi?semail=${semail}">已申请导师</a> 
        
<a href="syao?semail=${semail}">导师邀请</a> 
<br>
</br>
--------------------------------------------------------------------------
<h1>学生信息</h1>
<s:form action="back" theme="simple" enctype="multipart/form-data"> 
<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900"> 
	
	<tr>
	<td>name: <s:textfield name="sname" value="%{sname}"></s:textfield></td>
	
	<td>age:<s:textfield name="sage" value="%{sage}"></s:textfield></td>
	<td>sex:<s:textfield name="ssex" value="%{ssex}"></s:textfield></td>
	<td rowspan="3">照片</td>
	</tr>
	<tr>
	<td>email:<s:textfield name="semail" value="%{semail}"></s:textfield></td>
	<td>studentnumber:<s:textfield name="sxuehao" value="%{sxuehao}"></s:textfield></td>
	<td>school:<s:textfield name="sschool" value="%{sschool}"></s:textfield></td>
	</tr>
	<tr>
	<td>benkezhuanye:<s:textfield name="sm" value="%{sm}"></s:textfield></td>
	<td>lanking:<s:textfield name="sp" value="%{sp}"></s:textfield></td>
	<td>IfWantToBeMaster:<s:textfield name="sb" value="%{sb}"></s:textfield></td>
	</tr>
	<tr>
	<td colspan="2">chengguo:<s:textfield name="sc" value="%{sc}"></s:textfield></td>
	<td>HaveTeacher:<s:textfield name="sd" value="%{sd}"></s:textfield></td>
	<td>mima:<s:textfield name="snumber" value="%{snumber}"></s:textfield></td>
	</tr>
	</table>
	<td>
	<s:submit value="修改"/>
	</td>
	</s:form>
</center>	
</body>
</html>