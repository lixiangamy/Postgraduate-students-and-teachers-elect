<%@ page language="java" import="java.util.*" pageEncoding="GB2312"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>������ѧ���ĵ�ʦ</title>
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
<br>
</br>
		<tr>
		<td>
		�Ѿ�ѡ����ģ�
		</td>
		</tr>
		<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
			<s:iterator value="DL" id="a" status = "s">
			 	<s:if test="#s.odd||#s.first">            
	              <tr> 
	              <td bgcolor="#e0ffff">
					<a href="checkdx?dx=<s:property value="a"/>&sna=${sna}&semail=${semail}"><s:property value="a"/> </a>  
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
		δѡ��״̬�ģ�
		</td>
		</tr>
		<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
			<s:iterator value="DLL" id="C" status = "M">
			<tr>
			<td>
				<a href="checkdx?dx=<s:property value="C"/>&sna=${sna}&semail=${semail}"><s:property value="C"/> </a> 
			</td>
			<td>
				<a href="cs?state=1&tn=<s:property value="C"/>&sna=${sna}&semail=${semail}"><button>ͬ��</button></a>
				<a href="cs?state=2&tn=<s:property value="C"/>&sna=${sna}&semail=${semail}"><button>��ͬ��</button></a>
				<a href="cs?state=3&tn=<s:property value="C"/>&sna=${sna}&semail=${semail}"><button>����</button></a>
			</td>
			</tr>
			</s:iterator>
		</table>
</center>
</body>
</html>