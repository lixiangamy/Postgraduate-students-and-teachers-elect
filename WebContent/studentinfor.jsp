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
<body>
<center>
-------------------------------------------------------------------------------------
<h1>学生信息</h1>
<s:form action="back" theme="simple" enctype="multipart/form-data"> 
<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900"> 
	
	<tr>
	<td>name: <s:textfield name="sname" value="%{sname}"></s:textfield></td>
	
	<td>age:<s:textfield name="sage" value="%{sage}"></s:textfield></td>
	<td>sex:<s:textfield name="ssex" value="%{ssex}"></s:textfield></td>
	<td rowspan="2">照片</td>
	</tr>
	<tr>
	<td>email:<s:textfield name="semail" value="%{semail}"></s:textfield></td>
	<td>shenfenzheng:<s:textfield name="ssh" value="%{ssh}"></s:textfield></td>
	<td>studentnumber:<s:textfield name="sxuehao" value="%{sxuehao}"></s:textfield></td>
	</tr>
	<tr>
	<td>school:<s:textfield name="sschool" value="%{sschool}"></s:textfield></td>
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
	
<a href="javascript:history.back()">返回</a>
</center>	
</body>
</html>