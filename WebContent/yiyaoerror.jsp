<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>�ظ�ѡ��ʦ</title>
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
<a href="sinfor?semail=${semail}&sna=${sna}">������Ϣ</a> 
        
<a href="stui?semail=${semail}&sna=${sna}">ϵͳ�Ƽ�</a> 
        
<a href="schoose?semail=${semail}&sna=${sna}">ѡ��ʦ</a> 
        
<a href="syi?semail=${semail}&sna=${sna}">�����뵼ʦ</a> 
        
<a href="syao?semail=${semail}&sna=${sna}">��ʦ����</a> 
<h1>��</h1>
</center>
</body>
</html>