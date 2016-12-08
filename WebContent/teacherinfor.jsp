<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导师信息</title>
</head>
<body style="background:url('D:/t012e2f3f94da_副本_副本.jpg') no-repeat;">
<body>
<center>
<tr>
<td>
您好，
<s:property value="tname"/>
导师！
</td>
</tr>
<br>
</br>

<a href="tinfor?temail=${temail}&tname=${tname}">个人信息</a> 
        
<a href="ttui?temail=${temail}&tname=${tname}">系统推荐</a> 
        
<a href="tchoose?temail=${temail}&tname=${tname}">选择学生</a> 
        
<a href="tyi?temail=${temail}&tname=${tname}">已邀请学生</a> 
        
<a href="tyao?temail=${temail}&tname=${tname}">学生申请</a> 
<br>
</br>
--------------------------------------------------------------------------
<h1>导师信息</h1>
	<s:form action="tback" theme="simple" enctype="multipart/form-data"> 
	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900"> 
	<tr>
	<td>姓名:<s:property value="tname"/></td>
	<s:hidden name="temail"></s:hidden>
	<td>年龄:<input name="ta" value="<s:property value='ta'/>"></td>
	<td>性别:<s:property value="ts"/></td>
	<td rowspan="4">照片<img  src=<s:property value="tpfourpath"/>></td>
	</tr>
	<tr>
	<td>电子邮箱:<s:property value="temail"/></td>
	<td>要求学生本科院校:<input name="tsshool" value="<s:property value="tsshool"/>"></td>
	<td>教职工号:<s:property value="jzgh"/></td>
	</tr>
	<tr>
	<td>研究方向:<input name="induction" value="<s:property value="induction"/>"></td>
	<td>已成功学生数量:<s:property value="tsuccess"/></td>
	<td>是否显示邮箱信息:<input name="tx" value="<s:property value="tx"/>"></td>
	</tr>
	<tr>
	<td>教师所在学校:<s:property value="tschool"/></td>
	<td>要求学生专业:<input name="tm" value="<s:property value="tm"/>"></td>
	<td>是否要求学生有读博意愿<input name="tb" value="<s:property value="tb"/>"></td>
	</tr>
	<tr>
	<td>要求学生最低专业排名<input name="tp" value="<s:property value="tp"/>"></td>
	<td colspan="2">科研成果:<input name="tc" value="<s:property value="tc"/>"></td>
	<td>密码:<input name="tnumber" value="<s:property value="tnumber"/>"></td>
	</tr>
	<tr>
	<td>证明照片一<img  src=<s:property value="tponepath"/>></td>
	<td>证明照片二<img  src=<s:property value="tptwopath"/>></td>
	<td>证明照片三<img  src=<s:property value="tpthreepath"/>></td>
	</tr>
	</table>
	<td>
	<s:submit value="修改"/>
	</td>
	</s:form>
</center>	
</body>
</html>