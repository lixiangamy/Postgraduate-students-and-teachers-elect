<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ѧ����Ϣ����</title>
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
���ã�
<s:property value="sna"/>
ͬѧ��
</td>
</tr>
<br>
</br>
<a href="sinfor?semail=${semail}">������Ϣ</a> 
        
<a href="stui?semail=${semail}">ϵͳ�Ƽ�</a> 
        
<a href="schoose?semail=${semail}">ѡ��ʦ</a> 
        
<a href="syi?semail=${semail}">�����뵼ʦ</a> 
        
<a href="syao?semail=${semail}">��ʦ����</a> 
<br>
</br>
--------------------------------------------------------------------------
<br>
</br>
������ɸѡ��
<s:form action="select" theme="simple">
                �о�����:<s:textfield name="tindu" label="�о�����"></s:textfield>
                ����:    <s:textfield name="tname" label="����"></s:textfield>
                <br>
                </br>
                         ��ʦ��������  ��    <s:textfield name="tage" label="��ʦ��������"></s:textfield>
               <a href="select?semail=${semail}"> <s:submit value="ɸѡ"/></a>
                <s:reset value="����"/>
</s:form>
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