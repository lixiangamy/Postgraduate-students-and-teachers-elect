<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script type="text/javascript">
function tdata(e)
{
	var semail = document.getElementById("e");
	window.location.href = "t?e="+e.innerHTML;
}
</script>
</head>
<body>
<body bgcolor="Bisque">
<h1>学生信息</h1>
	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
	<tr>
	<td>name:<s:property value = "n"/></td>
	<td>age:<s:property value = "a"/></td>
	<td>sex:<s:property value = "s"/></td>
	<td rowspan="2">照片</td>
	</tr>
	<tr>
	<td>email:<s:property value = "e"/></td>
	<td>shenfenzheng:<s:property value = "sh"/></td>
	<td>studentnumber:<s:property value = "xuehao"/></td>
	</tr>
	<tr>
	<td>school:<s:property value = "school"/></td>
	<td>benkezhuanye:<s:property value = "m"/></td>
	<td>lanking:<s:property value = "p"/></td>
	<td>IfWantToBeMaster:<s:property value = "b"/></td>
	</tr>
	<tr>
	<td colspan="2">chengguo:<s:property value = "c"/></td>
	<td>HaveTeacher:<s:property value = "d"/></td>
	<td>mima:<s:property value = "number"/></td>
	</tr>
	</table>
<a href='<s:url action="s.action" >
</s:url>'>修改</a>
</body>
</html>