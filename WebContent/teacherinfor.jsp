<%@ page contentType="textml; charset=UTF-8" %>
<%@ page import="www.action.SinforAction,www.action.DB_connect" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="textml; charset=UTF-8">
<title>学生信息</title>
</head>
<body bgcolor="Bisque">
<body>
<center>
-------------------------------------------------------------------------------------
<h1>学生信息</h1>
	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
	<form action="tback" name="teacherform" method="post">   
	<tr>
	<td>name:<input type="text" name="name" value="<s:property value="tn"/>"></td>
	<td>age:<input name="a" value="<s:property value='ta'/>"></td>
	<td>sex:<input name="sex" value="<s:property value="ts"/>"></td>
	<td rowspan="2">照片</td>
	</tr>
	<tr>
	<td>email:<input name="e" value="<s:property value="te"/>"></td>
	<td>shenfenzheng:<input name="sh" value="<s:property value="tsh"/>"></td>
	<td>teachernumber:<input name="jzgh" value="<s:property value="jzgh"/>"></td>
	</tr>
	<tr>
	<td>induction:<input name="induction" value="<s:property value="induction"/>"></td>
	<td>chengguo:<input name="tc" value="<s:property value="tc"/>"></td>
	<td>success:<input name="tsuccess" value="<s:property value="tsuccess"/>"></td>
	<td>IfShowEmail:<input name="tx" value="<s:property value="tx"/>"></td>
	</tr>
	<tr>
	<td>school:<input name="tschool" value="<s:property value="tschool"/>"></td>
	<td>StudentLearn:<input name="tm" value="<s:property value="tm"/>"></td>
	<td>IfStudentToBeMater<input name="tb" value="<s:property value="tb"/>"></td>
	<td>StudentMustBetterThan<input name="tp" value="<s:property value="tp"/>"></td>
	</tr>
	<tr>
	<input type="button" value="修改" onclick="check()"/>
	</tr>
	</form>
	</table>
<a href="javascript:history.back()">返回</a>
</body>
<ml>
