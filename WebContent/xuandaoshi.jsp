<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ѧ����Ϣ����</title>
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
<a href="sinfor?semail=${semail}&sna=<s:property value="sna"/>">������Ϣ</a> 
        
<a href="stui?semail=${semail}&sna=<s:property value="sna"/>">ϵͳ�Ƽ�</a> 
        
<a href="schoose?semail=${semail}&sna=<s:property value="sna"/>">ѡ��ʦ</a> 
        
<a href="syi?semail=${semail}&sna=<s:property value="sna"/>">�����뵼ʦ</a> 
        
<a href="syao?semail=${semail}&sna=<s:property value="sna"/>">��ʦ����</a> 
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
                <s:hidden name="semail"></s:hidden>
                         ��ʦ��������  ��    <s:textfield name="tage" label="��ʦ��������"></s:textfield>
               <s:submit value="ɸѡ"/>
                <s:reset value="����"/>
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
				<a href="checkdx?dx=<s:property value="a"/>&sna=${sna}&semail=${semail}"><s:property value="a"/> </a> 
			</td>
			</tr>
			</s:iterator>
		</table>
</center>
</body>
</html>