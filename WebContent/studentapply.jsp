<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>学生注册</title>
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
                <s:textfield name="snuma" label="学号"></s:textfield>
                <s:textfield name="schoola" label="本科学校" value="请填全称"></s:textfield>
                <s:textfield name="smaina" label="本科专业"></s:textfield>
                <s:textfield name="srankinga" label="专业排名"></s:textfield>
                <s:textfield name="schena" label="成果" value="获得过的奖项、做过的大项目" cssStyle="width:200px;height:100px"></s:textfield>
				<s:if test="sboa==null">
				<s:radio name="sboa" label="是否读博" list="%{#{'1':'否','0':'是'}}" value="1"></s:radio> 
				</s:if>
				<s:else>
				<s:radio name="sgboa" list="%{#{'1':'否','0':'是'}}" ></s:radio> 
				</s:else>
				<span id="permitSpan"><s:file name="photofile" label="照片（jpg/png<65k）"  size="40" >  
				</s:file></span>
				<span id="pS"><s:file name="provefile" label="学号姓名匹配证明（jpg/png<65k）"  size="40">
                </s:file></span>
                <span id="pS1"><s:file name="ponefile" label="奖项/项目一（jpg/png<65k）"  size="40">
                </s:file></span>
                <span id="pS2"><s:file name="ptwofile" label="奖项/项目二（jpg/png<65k）"  size="40">
                </s:file></span>
                <span id="pS3"><s:file name="ptherefile" label="奖项/项目三（jpg/png<65k）"  size="40">
                </s:file></span>
                <s:password name="snumbera" label="设置密码"></s:password>
                <s:submit value="注册"/>
                <s:reset value="重置"/>
   </s:form>
</center>
</body>
</html>