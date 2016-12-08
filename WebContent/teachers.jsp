<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导师信息</title>
</head>
<body  style="background:url('D:/t012e2f3f94da_副本_副本.jpg') no-repeat;">
<body>
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
  <h1>导师信息</h1>
  	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
  	<tr>
 	<td>name:<s:property value="dx"/></td>
 	<td>age:<s:property value="ta"/> </td>
 	<td>sex:<s:property value="ts"/></td>
  	<td rowspan="3">照片<img  src=<s:property value="tpfourpath"/>></td>
  	</tr>
  	<tr>
 	<td>email:<s:property value="te"/></td>
 	<td>studentschool:<s:property value="tsschool"/></td>
 	<td>teachernumber:<s:property value="jzgh"/></td>
  	</tr>
  	<tr>
 	<td>induction:<s:property value="induction"/></td>
 	<td>success:<s:property value="tsuccess"/></td>
 	<td>IfShowEmail:<s:property value="tx"/></td>
  	</tr>
  	<tr>
 	<td>school:<s:property value="tschool"/></td>
 	<td>StudentLearn:<s:property value="tm"/></td>
 	<td>IfStudentToBeMater<s:property value="tb"/></td>
 	<td>StudentMustBetterThan:<s:property value="tp"/></td>
  	</tr>
  	<tr>
	<td>chengguo:<s:property value="tc"/></td>
	<td>证明照片一<img  src=<s:property value="tponepath"/>></td>
	<td>证明照片二<img  src=<s:property value="tptwopath"/>></td>
	<td>证明照片三<img  src=<s:property value="tpthreepath"/>></td>
	</tr>
  	</table>
  	<a href="sapplyteacher?semail=${semail}&dx=${dx}&sna=${sna}"><button>申请此位导师</button></a> 
  </body>
 </html> 