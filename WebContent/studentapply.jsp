<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生注册</title>
<script src="http://ajax.aspnetcdn.com/ajax/jQuery/jquery-1.8.0.js">
</script>
<script type="text/javascript">
function checkLast(str){  
    var flag=false;  
    var ext=str.split('.')[str.split('.').length-1];  
    if(ext=='jpg'){  
        flag=true;  
    }  
    return flag;  
}  
function checkPerm(obj){  
    if(!checkLast(obj.value.toLowerCase())){  
        alert("上传文件格式错误！");  
        document.getElementByIdx_x("permitSpan").innerHTML='<s:file name="permitFile" size="14" id="permitCheck" onchange="checkPerm(this);"></s:file>';  
    }  
}  
</script>
</head>
<body>
<center>
   <s:form action="sapply">
                <s:textfield name="semaila" label="邮箱" value="--@--"></s:textfield>
                <s:textfield name="snamea" label="姓名"></s:textfield>
                <s:textfield name="sagea" label="年龄" value="正整数"></s:textfield>
                <s:if test="ssexa==null">
				<s:radio name="ssexa" label="性别" list="%{#{'1':'男','0':'女'}}" value="1"></s:radio> 
				</s:if>
				<s:else>
				<s:radio name="sgsexa" list="%{#{'1':'男','0':'女'}}" ></s:radio> 
				</s:else>
				<s:password name="smannuma" label="身份证号"></s:password>
                <s:textfield name="snuma" label="学号"></s:textfield>
                <s:textfield name="schoola" label="本科学校" value="请填全称"></s:textfield>
                <s:textfield name="smaina" label="本科专业"></s:textfield>
                <s:textfield name="srankinga" label="专业排名"></s:textfield>
                <s:textfield name="srankinga" label="成果" value="获得过的奖项、做过的大项目" cssStyle="width:200px;height:100px"></s:textfield>
				<s:if test="sboa==null">
				<s:radio name="sboa" label="是否读博" list="%{#{'1':'否','0':'是'}}" value="1"></s:radio> 
				</s:if>
				<s:else>
				<s:radio name="sgboa" list="%{#{'1':'否','0':'是'}}" ></s:radio> 
				</s:else>
				<span id="permitSpan"><s:file name="photofile" label="照片（jpg/png）"  size="40" onchange="checkPerm(this);">  
                </s:file></span>
                <s:password name="snumbera" label="设置密码"></s:password>
                <s:submit value="注册"/>
                <s:reset value="重置"/>
   </s:form>
</center>
</body>
</html>