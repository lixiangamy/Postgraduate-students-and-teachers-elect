<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息</title>
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
<br>
</br>
--------------------------------------------------------------------------
<h1>学生信息</h1>
<s:form action="back" theme="simple" enctype="multipart/form-data"> 
<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900"> 
	
	<tr>
	<td>姓名: <s:property value="sna"></s:property></td>
	<s:hidden name="semail"></s:hidden>
	<td>年龄:<s:textfield name="sage" value="%{sage}"></s:textfield></td>
	<td>性别:<s:property value="ssex"></s:property></td>
	<td rowspan="3">照片<img  src=<s:property value="photopath"/>></td>
	</tr>
	<tr>
	<td>电子邮件:<s:property value="semail"></s:property></td>
	<td>学号:<s:property value="sxuehao"></s:property></td>
	<td>本科院校:<s:property value="sschool"></s:property></td>
	</tr>
	<tr>
	<td>本科专业:<s:property value="sm"></s:property></td>
	<td>专业排名:<s:property value="sp"></s:property></td>
	<td>是否有读博意向:<s:textfield name="sb" value="%{sb}"></s:textfield></td>
	</tr>
	<tr>
	<td>是否已选择导师:<s:property value="sd"></s:property></td>
	<td>密码:<s:textfield name="snumber" value="%{snumber}"></s:textfield></td>
	<td colspan="2">成果:<s:textfield name="sc" value="%{sc}"></s:textfield></td>
	</tr>
	<tr>
	<td>证明照片一<img  src=<s:property value="ponepath"/>></td>
	<td>证明照片二<img  src=<s:property value="ptwopath"/>></td>
	<td>证明照片三<img  src=<s:property value="pthreepath"/>></td>
	<td>学号证明照片<img  src=<s:property value="provepath"/>></td>
	</tr>
	</table>
	<td>
	<s:submit value="修改"/>
	</td>
	</s:form>
</center>	
</body>
</html>