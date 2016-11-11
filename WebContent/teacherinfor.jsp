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
    var pwd = document.teacherform.number.value;//得到用户输入的密码  
    var email = document.teacherform.e.value;//得到用户输入的E-mail  
    if(pwd.trim()==""){alert("密码不可以为空!!!");return;}//密码为空时提示用户  
    else if(pwd.trim().length<3){alert("密码长度不得少于3!!!");return;}//密码长度小于6时提示用户  
    else if(email.trim()==""){alert("E-mail不得为空!!!");return;}//E-mail为空时提示用户  
    document.teacherform.submit();             //将表单提交  
}
</script>
</head>
<body>
<jsp:useBean id="e" class="www.action.TinforAction" scope="session"/> 
<body bgcolor="Bisque">
<h1>学生信息</h1>
	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
	<form action="tback" name="teacherform" method="post">   
	<tr>
	<td>name:<input type="text" name="tn" value="<s:property value="tn"/>"></td>
	<td>age:<input name="ta" value="<s:property value='ta'/>"></td>
	<td>sex:<input name="ts" value="<s:property value="ts"/>"></td>
	<td rowspan="2">照片</td>
	</tr>
	<tr>
	<td>email:<input name="te" value="<s:property value="te"/>"></td>
	<td>SrudentSchool:<input name="tsshool" value="<s:property value="tsshool"/>"></td>
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
