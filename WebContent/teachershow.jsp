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
 function sq(){  
      
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
 	<td>name:<s:property value="tn"/></td>
 	<td>age:<s:property value='ta'/></td>
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
 	</form>
  	</table>
 <a href="javascript:history.back()">返回</a>
  </body>
 </html> 