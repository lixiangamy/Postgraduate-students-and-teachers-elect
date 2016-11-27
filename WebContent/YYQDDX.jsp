<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>已申请导师的学生</title>
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
		<tr>
		<td>
		已经选择完的：
		</td>
		</tr>
		<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
			<s:iterator value="DL" id="a" status = "s">
			 	<s:if test="#s.odd||#s.first">            
	              <tr> 
	              <td bgcolor="#e0ffff">
					<a href="checksx?sx=<s:property value="a"/>&tname=${tname}&temail=${temail}"><s:property value="a"/> </a>  
					</td>  
					</s:if>       
				   <s:elseif test="#s.even||#s.last">    
				   <td bgcolor="#e0ffff">
					<s:property value="a"/>
					</td>  
	           		 </tr>          
	       			 </s:elseif>     
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
				<a href="checksx?sx=<s:property value="C"/>&tname=${tname}&temail=${temail}"><s:property value="C"/> </a> 
			</td>
			<td>
				<a href="tcs?state=1&sn=<s:property value="C"/>&tname=${tname}&temail=${temail}"><button>同意</button></a>
				<a href="tcs?state=2&sn=<s:property value="C"/>&tname=${tname}&temail=${temail}"><button>不同意</button></a>
				<a href="tcs?state=3&sn=<s:property value="C"/>&tname=${tname}&temail=${temail}"><button>待定</button></a>
			</td>
			</tr>
			</s:iterator>
		</table>

</center>
</body>
</html>