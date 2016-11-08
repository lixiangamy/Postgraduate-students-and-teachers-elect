<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="www.action,SinforAction"%> 
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script language="javascript" src="script/trim.js">
</script><!--导入脚本-->  
<script language="javascript">  
         function check(){  
           var pwd = document.mfmodify.upwd.value;    
//得到用户输入的密码  
           var email = document.mfmodify.uemail.value; 
//得到用户输入的E-mail  
           if(pwd.trim()==""){alert("密码不可以为空!!!");
return;}//密码为空时提示用户  
         else if(pwd.trim().length<6){alert("
密码长度不得少于6!!!");return;} 

//密码长度小于6时提示用户  
          else if(email.trim()==""){alert("E-mail不得为空!!!");return;} 

//E-mail为空时提示用户  
          document.mfmodify.submit();             //将表单提交  
        }</script>
</head>
<body>
<jsp:useBean id="studentinfor" class="SinforAction.java" 
scope="session"/> 
<body bgcolor="Bisque">
<h1>学生信息</h1>
	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
	<form action="CartServlet" method="post" name="mfmodify">  
    <% String semail = (String)session.getAttribute("e");//得到邮箱  
       uname = new String(semail.getBytes(),"ISO-8859-1");//将编码转为ISO-8859-1  
       //从数据库中搜索出用户的资料  
       String sql = "select e,n,a,s,sh,xuehao,school,m,p,b,c,d,number from student "+"where e='"+semail+"'";  
       Vector<String[]> vuser = DB_connect.getInfoArr(sql);
       String[] str = vuser.get(0); %>  
	<tr>
	<td>name:<input type="a" name="name" value="<%=str[1] %>"/></td>
	<td>age:<input name="age" value="<%=str[2] %>"/></td>
	<td>sex:<input name="sex" value="<%=str[3] %>"/></td>
	<td rowspan="2">照片</td>
	</tr>
	<tr>
	<td>email:<%=str[0] %></td>
	<td>shenfenzheng:<input name="sh" value="<%=str[4] %>"/></td>
	<td>studentnumber:<input name="xuehao" value="<%=str[5] %>"/></td>
	</tr>
	<tr>
	<td>school:<input name="school" value="<%=str[6] %>"/></td>
	<td>benkezhuanye:<input name="m" value="<%=str[7] %>"/></td>
	<td>lanking:<input name="p" value="<%=str[8] %>"/></td>
	<td>IfWantToBeMaster:<input name="b" value="<%=str[9] %>"/></td>
	</tr>
	<tr>
	<td colspan="2">chengguo:<input name="c" value="<%=str[10] %>"/></td>
	<td>HaveTeacher:<input name="d" value="<%=str[11] %>"/></td>
	<td>mima:<input name="number" value="<%=str[12] %>"/></td>
	</tr>
	</form>
	</table>
<input type="button" value="
修改" onclick= "check()"/>  
<tr></tr>
<a href='<s:url action="s.action" >
</s:url>'>返回</a>
</body>
</html>