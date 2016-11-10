<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>已邀请学生的导师</title>
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
<s:property value="tna"/>
导师！
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
		<tr>
		<td>
		已经选择完的：
		</td>
		</tr>
		<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
			<s:iterator value="DL" id="a" status = "s">
			<s:iterator value="DIL" id="b" status = "N">
			<tr>
			<td>
				<p onclick="re(this);"><s:property value="a"/> </p> 
			</td>
			<td>
				<s:property value="b"/>
			</td>
			</tr>
			</s:iterator>
			</s:iterator>
		</table>
		<tr>
		<td>
		未选择状态的：
		</td>
		</tr>
		<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
			<s:iterator value="DLL" id="C" status = "M">
			<tr>
			<td>
				<p onclick="re(this);"><s:property value="C"/> </p> 
			</td>
			<td>
				<a href="cs?state=1"><button>同意</button></a>
				<a href="cs?state=2"><button>不同意</button></a>
				<a href="cs?state=3"><button>待定</button></a>
			</td>
			</tr>
			</s:iterator>
		</table>
</center>
</body>
</html>