<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>�ظ�ѡѧ��</title>
</head>
<body>
<center>
<tr>
<td>
���ã�
<s:property value="tna"/>
��ʦ��
</td>
</tr>
<br>
</br>
<a href="tinfor?temail=${temail}&tna=${tna}">������Ϣ</a> 
        
<a href="ttui?temail=${temail}&tna=${tna}">ϵͳ�Ƽ�</a> 
        
<a href="tchoose?temail=${temail}&tna=${tna}">ѡ��ѧ��</a> 
        
<a href="tyi?temail=${temail}&tna=${tna}">������ѧ��</a> 
        
<a href="tyao?temail=${temail}&tna=${tna}">ѧ������</a> 
<h1>�Ѿ��ɹ���ѧ����ѡ����ֹ�ٴ�����ѧ��</h1>
</center>
</body>
</html>