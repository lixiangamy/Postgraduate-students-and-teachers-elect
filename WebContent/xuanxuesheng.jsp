<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>��ʦ��Ϣ����</title>
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
<a href="tinfor?temail=${temail}&sna=<s:property value="tna"/>">������Ϣ</a> 
        
<a href="ttui?temail=${temail}&sna=<s:property value="tna"/>">ϵͳ�Ƽ�</a> 
        
<a href="tchoose?temail=${temail}&sna=<s:property value="tna"/>">ѡ��ѧ��</a> 
        
<a href="tyi?temail=${temail}&sna=<s:property value="tna"/>">������</a> 
        
<a href="tyao?temail=${temail}&sna=<s:property value="tna"/>">ѧ������</a> 
<br>
</br>
--------------------------------------------------------------------------
<br>
</br>
������ɸѡ��
<s:form action="select" theme="simple">
                ѧУ:<s:textfield name="sschool" label="ѧУ"></s:textfield>
                רҵ:<s:textfield name="sm" label="רҵ"></s:textfield>
                ����:    <s:textfield name="sname" label="����"></s:textfield>
                <br>
                </br>
                <s:hidden name="semail"></s:hidden>
                        ѧ����������  :    <s:textfield name="sp" label="ѧ����������"></s:textfield>
                        ѧ���Ƿ��������"��"����1��"����"����0��:<s:textfield name="sb" label="Ҫ��ѧ���Ƿ����"></s:textfield>
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
				<a href="checksx?sx=<s:property value="a"/>&tna=${tna}&temail=${temail}"><s:property value="a"/> </a> 
			</td>
			</tr>
			</s:iterator>
		</table>
</center>
</body>
</html>