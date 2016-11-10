<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生信息管理</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script type="text/javascript">
function re(e)
{
	var BT = document.getElementById("dx");
	window.location.href = "checkdx?dx="+e.innerHTML;
}
</script>
</head>
<body>	
<center>
<tr>
<td>
您好，
<s:property value="sname"/>
同学！
</td>
</tr>
<br>
</br>
<a href="sinfor?semail=${semail}">个人信息</a> 
        
<a href="stui?semail=${semail}">系统推荐</a> 
        
<a href="schoose?semail=${semail}">选择导师</a> 
        
<a href="syi?semail=${semail}">已申请导师</a> 
        
<a href="syao?semail=${semail}">导师邀请</a> 
<br>
</br>
--------------------------------------------------------------------------
<br>
</br>
		<table border="1" width="30%">
			<s:iterator value="BL" id="a" status = "s">
			<tr>
			<td>
				<p onclick="re(this);"><s:property value="a"/> </p> 
			</td>
			</tr>
			</s:iterator>
		</table>
</center>
</body>
</html>