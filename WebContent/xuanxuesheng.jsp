<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>导师信息管理</title>
</head>
<body style="background:url('D:/t012e2f3f94da_副本_副本.jpg') no-repeat;">	
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
<a href="tinfor?temail=${temail}&tname=<s:property value="tname"/>">个人信息</a> 
        
<a href="ttui?temail=${temail}&tname=<s:property value="tname"/>">系统推荐</a> 
        
<a href="tchoose?temail=${temail}&tname=<s:property value="tname"/>">选择学生</a> 
        
<a href="tyi?temail=${temail}&tname=<s:property value="tname"/>">已邀请</a> 
        
<a href="tyao?temail=${temail}&tname=<s:property value="tname"/>">学生申请</a> 
<br>
</br>
--------------------------------------------------------------------------
<br>
</br>
按条件筛选：
<s:form action="tselect" theme="simple">
                学校:<s:textfield name="sschool" label="学校"></s:textfield>
                专业:<s:textfield name="sm" label="专业"></s:textfield>
                姓名:    <s:textfield name="sname" label="姓名"></s:textfield>
                <br>
                </br>
                <s:hidden name="temail"></s:hidden>
                        学生排名下限  :    <s:textfield name="sp" label="学生排名下限"></s:textfield>
                        要求学生是否读博（若有此要求请填1）:<s:textfield name="sb" label="要求学生是否读博"></s:textfield>
               <s:submit value="筛选"/>
                <s:reset value="重置"/>
</s:form>
<br>
</br>
--------------------------------------------------------------------------
<br>
</br>
		<table border="1" width="450" cellspacing="0" cellpadding="2" >
			<s:iterator value="BL" id="a" status = "s">
			<tr>
			<td>
				<a href="checksx?sx=<s:property value="a"/>&tname=${tname}&temail=${temail}"><s:property value="a"/> </a> 
			</td>
			</tr>
			</s:iterator>
		</table>
</center>
</body>
</html>