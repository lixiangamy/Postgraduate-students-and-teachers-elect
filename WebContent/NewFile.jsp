<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>学生注册</title>
    <link type="text/css" rel="stylesheet" href="css/login.css">
    <script type="text/javascript" src="js/jquery.min.js"></script>

</head>
<body class="login_bj" >

<div class="zhuce_body">
	<div class="logo"><img src="images/logo.png" width="330" height="60" border="0"></div>
    <div class="zhuce_kong">
    	<div class="zc">
        	<div class="bj_bai">
            <h3>欢迎注册</h3>
       	  	   <s:form action="sapply" theme="simple" enctype="multipart/form-data">
                <input name="snamea" type="text" class="kuang_txt phone" placeholder="姓名">
                <input name="semaila" type="text" class="kuang_txt email" placeholder="邮箱">
                <input name="snumbera" type="password" class="kuang_txt possword" placeholder="密码">
                <input name="sagea" type="text" class="kuang_txt possword" placeholder="年龄">
                <br><h2>性别: </h2>        <s:if test="ssexa==null">
				<s:radio name="ssexa" label="性别" list="%{#{'1':'男','0':'女'}}" value="1"></s:radio> 
				</s:if>
				<s:else>
				<s:radio name="sgsexa" color="#37b5f9" list="%{#{'1':'男','0':'女'}}" ></s:radio> 
				</s:else></br>
                <input name="snuma" type="text" class="kuang_txt phone" placeholder="学号">
                <input name="schoola" type="text" class="kuang_txt phone" placeholder="本科学校(请填全称)">
                <input name="smaina" type="text" class="kuang_txt phone" placeholder="本科专业(请填全称)">
                <input name="srankinga" type="text" class="kuang_txt phone" placeholder="专业排名(如实填写)">
               <br><h2>是否读博: </h2>    <s:if test="sboa==null">
				<s:radio name="sboa" label="是否读博" color="#37b5f9" list="%{#{'1':'是','0':'否'}}" value="1"></s:radio> 
				</s:if>
				<s:else>
				<s:radio name="sgboa" list="%{#{'1':'是','0':'否'}}" ></s:radio> 
				</s:else></br>
               <input name="schena" type="text" class="kuang_txt chengguo_kuang" placeholder="获得过的奖项、做过的项目,若没有填无">
			   <br></br>
			   <br></br>
			   <br></br>
			   <br>学生证/卡证明照  （jpg/png<65k）：</br>
				<s:file name="resume" label="上传图片" />
				<br>本人生活照   （jpg/png<65k）：</br>
				<s:file name="resume1" label="上传图片" />
				<br>奖项/项目一（jpg/png<65k，可不传）：</br>
				<s:file name="resume2" label="上传图片" width="236"/>
				<br>奖项/项目二（jpg/png<65k，可不传）：</br>
				<s:file name="resume3" label="上传图片" width="236"/>
				<br>奖项/项目三（jpg/png<65k，可不传）：</br>
				<s:file name="resume4" label="上传图片" width="236"/>
				 <br></br>
                 <s:submit value="注册" class="btn_zhuce" />
                </s:form>
            </div>
        	
        </div>
    </div>

</div>

</body>
</html>