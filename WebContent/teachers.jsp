<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 </head>
  <body bgcolor="Bisque">
  <h1>导师信息</h1>
  	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
  	<tr>
 	<td>name:<s:property value="dx"/></td>
 	<td> age:<s:property value="ta"/> </td>
 	<td>sex:<s:property value="ts"/></td>
  	<td rowspan="2">照片</td>
  	</tr>
  	<tr>
 	<td>email:<s:property value="te"/></td>
 	<td>studentschool:<s:property value="tsschool"/></td>
 	<td>teachernumber:<s:property value="jzgh"/></td>
  	</tr>
  	<tr>
 	<td>induction:<s:property value="induction"/></td>
 	<td>chengguo:<s:property value="tc"/></td>
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
 	<input type="button" value="申请该导师" onclick="sq()"/>
 	</tr>
  	</table>
 <a href="javascript:history.back()">返回</a>
  </body>
 </html> 