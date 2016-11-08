<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>书籍信息</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script type="text/javascript">
function sdata(e)
{
	var semail = document.getElementById("e");
	window.location.href = "s?e="+e.innerHTML;
}
</script>
</head>
<body>
<body bgcolor="Bisque">//颜色
<h1>学生信息</h1>
		<p id="email">
		<s:property value = "e"/></p>
		<hr/>
		name:<s:property value = "n"/>
		<hr/>
		age:<s:property value = "a"/>
		<hr/>
		sex:<s:property value = "s"/>
		<hr/>
		shenfenzheng:<s:property value = "sh"/>
		<hr/>
		<hr/>
		studentnumber:<s:property value = "xuehao"/>
		<hr/>
		<hr/>
		school:<s:property value = "school"/>
		<hr/>
		<hr/>
		benkezhuanye:<s:property value = "m"/>
		<hr/>
		<hr/>
		lanking:<s:property value = "p"/>
		<hr/>
		<hr/>
		chengguo:<s:property value = "c"/>
		<hr/>
		<hr/>
		IfWantToBeMaster:<s:property value = "b"/>
		<hr/>
		<hr/>
		HaveTeacher:<s:property value = "d"/>
		<hr/>
		<p  onclick="deletes(this);">
		<a href='<s:url action="s.action" >
				</s:url>'> 删除</a>
		</p>
</body>
</html>