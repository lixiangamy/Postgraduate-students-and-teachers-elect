<%@ page contentType="textml; charset=UTF-8" %>
<%@ page import="www.action.SinforAction,www.action.DB_connect" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="textml; charset=UTF-8">
<title>学生信息</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script language="javascript" src="script/trim.js">
</script><!--导入脚本-->  
<script language="javascript">  
function check(){  
    var pwd = document.studentform.number.value;//得到用户输入的密码  
    var email = document.studentform.e.value;//得到用户输入的E-mail  
    if(pwd.trim()==""){alert("密码不可以为空!!!");return;}//密码为空时提示用户  
    else if(pwd.trim().length<3){alert("密码长度不得少于3!!!");return;}//密码长度小于6时提示用户  
    else if(email.trim()==""){alert("E-mail不得为空!!!");return;}//E-mail为空时提示用户  
    document.studentform.submit();             //将表单提交  
}
</script>
</head>
<body>
<jsp:useBean id="e" class="www.action.SinforAction" scope="session"/> 
<body bgcolor="Bisque">
<h1>学生信息</h1>
	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
	<form action="back" name="studentform" method="post">   
	<tr>
	<td>name:<input type="text" name="name" value="<s:property value="sname"/>"></td>
	<td>age:<input name="a" value="<s:property value='sage'/>"></td>
	<td>sex:<input name="sex" value="<s:property value="ssex"/>"></td>
	<td rowspan="2">照片</td>
	</tr>
	<tr>
	<td>email:<input name="e" value="<s:property value="semail"/>"></td>
	<td>shenfenzheng:<input name="sh" value="<s:property value="ssh"/>"></td>
	<td>studentnumber:<input name="xuehao" value="<s:property value="sxuehao"/>"></td>
	</tr>
	<tr>
	<td>school:<input name="school" value="<s:property value="sschool"/>"></td>
	<td>benkezhuanye:<input name="m" value="<s:property value="sm"/>"></td>
	<td>lanking:<input name="p" value="<s:property value="sp"/>"></td>
	<td>IfWantToBeMaster:<input name="b" value="<s:property value="sb"/>"></td>
	</tr>
	<tr>
	<td colspan="2">chengguo:<input name="c" value="<s:property value="sc"/>"></td>
	<td>HaveTeacher:<input name="d" value="<s:property value="sd"/>"></td>
	<td>mima:<input name="number" value="<s:property value="snumber"/>"></td>
	</tr>
	<tr>
	<input type="button" value="修改" onclick="check()"/>
	</tr>
	</form>
	</table>
<a href="javascript:history.back()">返回</a>
</body>
<ml>
