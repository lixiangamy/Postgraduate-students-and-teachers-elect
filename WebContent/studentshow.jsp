<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息</title>
</head>
<body style="background:url('D:/t012e2f3f94da_副本_副本.jpg') no-repeat;">	
<body bgcolor="Bisque">
<center>
<tr>
<td>
您好，
<s:property value="tname"/>
同学！
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
  <h1>学生信息</h1>
  	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
  	<tr>
 	<td>姓名:<s:property value="sx"/></td>
 	<td>年龄:<s:property value="sage"/> </td>
 	<td>性别:<s:property value="ssex"/></td>
  	<td rowspan="3">照片<img  src=<s:property value="photopath"/>> </td>
  	</tr>
  	<tr>
 	<td>电子邮箱:<s:property value="semail"/></td>
 	<td>学号:<s:property value="sxuehao"/></td>
 	<td>本科院校:<s:property value="sschool"/></td>
  	</tr>
  	<tr>
 	<td>本科专业:<s:property value="sm"/></td>
 	<td>专业排名:<s:property value="sp"/></td>
 	<td>是否有读博意向:<s:property value="sb"/></td>
  	</tr>
  	<tr>
 	<td>是否已选导师:<s:property value="sd"/></td>
 	<td colspan="3">成果:<s:property value="sc"/></td>
  	</tr>
  	<tr>
	<td>证明照片一<img  src=<s:property value="ponepath"/>> </td>
	<td>证明照片二<img  src=<s:property value="ptwopath"/>> </td>
	<td>证明照片三<img  src=<s:property value="pthreepath"/>> </td>
	<td>学号证明照片<img  src=<s:property value="provepath"/>> </td>
	</tr>
  	</table>
  	<a href="tapplystudent?temail=${temail}&sx=${sx}&tname=${tname}"><button>邀请此学生</button></a> 
  </body>
 </html> 