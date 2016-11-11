<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>学生注册</title>
</head>
<body>

   <s:form action="sapply" theme="simple">
  				<td>
               <br>邮箱:  <s:textfield name="semaila" label="邮箱"></s:textfield></br>
               <br>密码:         <s:password name="snumbera" label="设置密码"></s:password></br>
               <br>姓名:         <s:textfield name="snamea" label="姓名"></s:textfield></br>
               
               <br>年龄:   <s:textfield name="sagea" label="年龄"></s:textfield></br>
               <br>性别:         <s:if test="ssexa==null">
				<s:radio name="ssexa" label="性别" list="%{#{'1':'男','0':'女'}}" value="1"></s:radio> 
				</s:if>
				<s:else>
				<s:radio name="sgsexa" list="%{#{'1':'男','0':'女'}}" ></s:radio> 
				</s:else></br>
               <br>学号:          <s:textfield name="snuma" label="学号"></s:textfield></br>
               <br>本科学校(请填全称):<s:textfield name="schoola" label="本科学校"></s:textfield></br>
               <br>本科专业(请填全称):  		<s:textfield name="smaina" label="本科专业"></s:textfield></br>
               <br>专业排名(如实填写):		<s:textfield name="srankinga" label="专业排名"></s:textfield></br>
               <br>是否读博:       <s:if test="sboa==null">

				<s:radio name="sboa" label="是否读博" list="%{#{'1':'否','0':'是'}}" value="1"></s:radio> 
				</s:if>
				<s:else>
				<s:radio name="sgboa" list="%{#{'1':'否','0':'是'}}" ></s:radio> 
				</s:else></br>
				<br>登陆学信网上传学号姓名匹配截图（jpg/png<65k）：</br>
					<br><span id="pS"><s:file name="provefile" label="学号姓名匹配证明（jpg/png<65k）"  size="40">
                </s:file></span></br>
               <br>成果:(获得过的奖项、做过的大项目,若没有请填无)</br>
               <br><s:textfield name="schena" label="成果" cssStyle="width:200px;height:100px"></s:textfield></br>
			   
				<br>本人生活照   （jpg/png<65k）：                        	<span id="permitSpan"><s:file name="photofile" label="照片（jpg/png<65k）"  size="40" >  
				</s:file></span></br>
				
                <br>奖项/项目一（jpg/png<65k）： 		<span id="pS1"><s:file name="ponefile" label="奖项/项目一（jpg/png<65k）"  size="40">
                </s:file></span></br>
                <br>奖项/项目二（jpg/png<65k）：		<span id="pS2"><s:file name="ptwofile" label="奖项/项目二（jpg/png<65k）"  size="40">
                </s:file></span></br>
                <br>奖项/项目三（jpg/png<65k）：		<span id="pS3"><s:file name="ptherefile" label="奖项/项目三（jpg/png<65k）"  size="40">
                </s:file></span></br>
                
                <s:submit value="注册"/>
                <s:reset value="重置"/>
                </td>
   </s:form>

</body>
</html>