<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 </head>
  <body bgcolor="Bisque">
  <h1>学生信息</h1>
  	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
  	<tr>
 	<td>name:<s:property value="sx"/></td>
 	<td> age:<s:property value="a"/> </td>
 	<td>sex:<s:property value="s"/></td>
  	<td rowspan="3">照片</td>
  	</tr>
  	<tr>
 	<td>email:<s:property value="e"/></td>
 	<td>studentnumber:<s:property value="sxuehao"/></td>
 	<td>school:<s:property value="sschool"/></td>
  	</tr>
  	<tr>
 	<td>benkezhuanye:<s:property value="sm"/></td>
 	<td>lanking:<s:property value="sp"/></td>
 	<td>IfWantToBeMaster:<s:property value="sb"/></td>
  	</tr>
  	<tr>
 	<td colspan="3">chengguo:<s:property value="sc"/></td>
 	<td>HaveTeacher:<s:property value="sd"/></td>
  	</tr>
  	</table>
  	<a href="tapplystudent?temail=${temail}&sx=${sx}&tna=${tna}"><button>邀请此学生</button></a> 
 <a href="javascript:history.back()">返回</a>
  </body>
 </html> 