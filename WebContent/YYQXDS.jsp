<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>已邀请学生的导师</title>
</head>

<body id="purple" class="pattern1">
    <div class="selector">
        <form method="get">
            <div class="clear"></div>
        	<h3>Patterns</h3>
            <ul class="patterns">
                <li><a href="javascript:void(0)" id="pattern1" class="active"></a></li>
                <li><a href="javascript:void(0)" id="pattern2"></a></li>
                <li><a href="javascript:void(0)" id="pattern3"></a></li>
                <div class="clear"></div>
                <li><a href="javascript:void(0)" id="pattern4"></a></li>
                <li><a href="javascript:void(0)" id="pattern5"></a></li>
                <li><a href="javascript:void(0)" id="pattern6"></a></li>
                <div class="clear"></div>
                <li><a href="javascript:void(0)" id="pattern7"></a></li>
                <li><a href="javascript:void(0)" id="pattern8"></a></li>
                <li><a href="javascript:void(0)" id="pattern9"></a></li>
                <div class="clear"></div>
                <li><a href="javascript:void(0)" id="pattern10"></a></li>
                <li><a href="javascript:void(0)" id="pattern11"></a></li>
                <li><a href="javascript:void(0)" id="pattern12"></a></li>
            </ul>
        </form>
        <div class="clear" style="height:15px;"></div>
    </div>
	<!-- start: #wrapper -->
    <div id="wrapper">
    

<center>
<tr>
<td>
您好，
<s:property value="sna"/>
同学！
</td>
</tr>
<br>
</br>
<a href="sinfor?semail=${semail}&sna=${sna}">个人信息</a> 
        
<a href="stui?semail=${semail}&sna=${sna}">系统推荐</a> 
        
<a href="schoose?semail=${semail}&sna=${sna}">选择导师</a> 
        
<a href="syi?semail=${semail}&sna=${sna}">已申请导师</a> 
        
<a href="syao?semail=${semail}&sna=${sna}">导师邀请</a> 
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
		未选择状态的：
		</td>
		</tr>
		<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900">
			<s:iterator value="DLL" id="C" status = "M">
			<tr>
			<td>
				<a href="checkdx?dx=<s:property value="C"/>&sna=${sna}&semail=${semail}"><s:property value="C"/> </a> 
			</td>
			<td>
				<a href="cs?state=1&tn=<s:property value="C"/>&sna=${sna}&semail=${semail}"><button>同意</button></a>
				<a href="cs?state=2&tn=<s:property value="C"/>&sna=${sna}&semail=${semail}"><button>不同意</button></a>
				<a href="cs?state=3&tn=<s:property value="C"/>&sna=${sna}&semail=${semail}"><button>待定</button></a>
			</td>
			</tr>
			</s:iterator>
		</table>
</center>
  </div>
      <!-- start: #footer -->
        <footer id="footer">
        	<nav>
            	<ul>
                	<li><a href="sinfor?semail=${semail}&sna=${sna}" rel="1" onclick="javascript:window.location.href='http://localhost:8080/354/studentinfor.jsp'">个人信息</a></li>
                    <li><a href="stui?semail=${semail}&sna=${sna}" rel="2" onclick="javascript:window.location.href='http://localhost:8080/354/stuij.jsp'">系统推荐</a></li>
                    <li><a href="schoose?semail=${semail}&sna=${sna}" rel="3" onclick="javascript:window.location.href='http://localhost:8080/354/xuandaoshi.jsp'">选择导师</a></li>
                    <li><a href="syi?semail=${semail}&sna=${sna}" rel="4" onclick="javascript:window.location.href='http://localhost:8080/354/yxds.jsp'">已申请导师</a></li>
                    <li><a href="syao?semail=${semail}&sna=${sna}" rel="5" onclick="javascript:window.location.href='http://localhost:8080/354/YYQXDS.jsp'">导师邀请</a></li>
                </ul>
            </nav>
        </footer>
		<!-- end: #footer -->
        <div class="clear"></div>
</body>
</html>