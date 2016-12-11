<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考研师生互选系统</title>
<meta name="keywords" content="Your keywords here">
<meta name="description" content="Your description">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="http://fonts.googleapis.com/css?family=Arvo" rel="stylesheet" type="text/css">
<link href="css/styles.css" rel="stylesheet" type="text/css">
<link href="include/js/poshytip/tip-twitter/tip-twitter.css" rel="stylesheet" type="text/css">
<link href="include/js/fancybox/jquery.fancybox.css" rel="stylesheet" type="text/css">
<link href="include/js/jnotify/jNotify.jquery.css" rel="stylesheet" type="text/css">
<!-- Front End -->
<link href='http://fonts.googleapis.com/css?family=Advent+Pro:500' rel='stylesheet' type='text/css'>
<link href="front-end/css/styles.css" rel="stylesheet" type="text/css">
<link href="front-end/js/dropkick/dropkick.css" rel="stylesheet" type="text/css">
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<script type="text/javascript" src="include/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="include/js/jquery.debouncedresize.js"></script>
<script type="text/javascript" src="include/js/jquery.animate-colors-min.js"></script>
<script type="text/javascript" src="include/js/slider/jquery.ba-bbq.min.js"></script>
<script type="text/javascript" src="include/js/slider/jquery.touchSwipe-1.2.5.js"></script>
<script type="text/javascript" src="include/js/slider/jquery.sudoSlider.min.js"></script>
<script type="text/javascript" src="https://maps.google.com/maps/api/js?sensor=false"></script>
<script type="text/javascript" src="include/js/poshytip/jquery.poshytip.min.js"></script>
<script type="text/javascript" src="include/js/fancybox/jquery.fancybox.pack.js"></script>
<script type="text/javascript" src="include/js/fancybox/helpers/jquery.fancybox-media.js"></script>
<script type="text/javascript" src="include/js/jnotify/jNotify.jquery.min.js"></script>
<script type="text/javascript" src="include/js/scripts.js"></script>
<!-- Front End -->
<script type="text/javascript" src="front-end/js/dropkick/jquery.dropkick-1.0.0.js"></script>
<script type="text/javascript" src="front-end/js/scripts.js"></script>
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
    	<!-- start: #header -->
 		<header id="header">
        	<div class="decoration"></div>
            <div class="clear"></div>
        	<hgroup class="alignleft">
                <h1 class="arvo"><s:property value="tname"></s:property>导师</h1>
                
            </hgroup>
            
            <div class="social alignright">
            	
                <div class="clear"></div>
            </div>
            <div class="clear20"></div>
        </header>
        <!-- end: #header -->
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/" >Website Template</a></div>
        <!-- start: .content -->
        <div class="content">
        	<!-- end: .slider -->
        	<div class="slider">
                <ul class="wrapper">
                    <li class="box">
                        <!-- start: #home -->
                        <div id="home">
                            <div class="info alignleft">
                                <ul class="info np">
                                    <s:form action="tback" theme="simple" enctype="multipart/form-data"> 
	<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900"> 
	<tr>
	<td>姓名:<s:property value="tname"/></td>
	<s:hidden name="temail"></s:hidden>
	<td>年龄:<input name="ta" value="<s:property value='ta'/>"></td>
	<td>性别:<s:property value="ts"/></td>
	<td rowspan="4">照片<img  src=<s:property value="tpfourpath"/>></td>
	</tr>
	<tr>
	<td>电子邮箱:<s:property value="temail"/></td>
	<td>要求学生本科院校:<input name="tsshool" value="<s:property value="tsshool"/>"></td>
	<td>教职工号:<s:property value="jzgh"/></td>
	</tr>
	<tr>
	<td>研究方向:<input name="induction" value="<s:property value="induction"/>"></td>
	<td>已成功学生数量:<s:property value="tsuccess"/></td>
	<td>是否显示邮箱信息:<input name="tx" value="<s:property value="tx"/>"></td>
	</tr>
	<tr>
	<td>教师所在学校:<s:property value="tschool"/></td>
	<td>要求学生专业:<input name="tm" value="<s:property value="tm"/>"></td>
	<td>是否要求学生有读博意愿<input name="tb" value="<s:property value="tb"/>"></td>
	</tr>
	<tr>
	<td>要求学生最低专业排名<input name="tp" value="<s:property value="tp"/>"></td>
	<td colspan="2">科研成果:<input name="tc" value="<s:property value="tc"/>"></td>
	<td>密码:<input name="tnumber" value="<s:property value="tnumber"/>"></td>
	</tr>
	<tr>
	<td>证明照片一<img  src=<s:property value="tponepath"/>></td>
	<td>证明照片二<img  src=<s:property value="tptwopath"/>></td>
	<td>证明照片三<img  src=<s:property value="tpthreepath"/>></td>
	</tr>
	</table>
	<td>
	<s:submit value="修改"/>
	</td>
	</s:form>
                                </ul> 
                                
                                <div class="clear"></div>
                            
                            <div class="clear"></div>
                        </div>
                        <!-- end: #home -->   
                    </li>
                    <li class="box">
                        <!-- start: #resume -->
                        <div id="resume">
                            
                            
                            <div class="clear"></div>
                        </div>
                        <!-- end: #resume -->
                    </li>
                    <li class="box">
                        <!-- start: #portfolio -->
                        
                        <!-- end: #portfolio -->
                    </li>
                    <li>
                        <!-- start #contact -->
                        <div id="contact">
                            
                            <div class="clear"></div>
                        </div>
                        <!-- end: #contact -->
                    </li>
                    <li>
                        <!-- start #tyao -->
                        <div id="tyao">
                            
                            <div class="clear"></div>
                        </div>
                        <!-- end: #tyao -->
                    </li>
                </ul>
            </div>
            <!-- end: .slider -->
        </div>
        <!-- end: .content -->
        <!-- start: #footer -->
        <footer id="footer">
        	<nav>
            	<ul>
                	<li><a href="tinfor?temail=${temail}&tname=${tname}" rel="1" onclick="javascript:window.location.href='http://localhost:8080/354/teacgerinfor.jsp'">个人信息</a></li>
                    <li><a href="ttui?temail=${temail}&tname=${tname}" rel="2" onclick="javascript:window.location.href='http://localhost:8080/354/ttuij.jsp'">系统推荐</a></li>
                    <li><a href="tchoose?temail=${temail}&tname=${tname}" rel="3" onclick="javascript:window.location.href='http://localhost:8080/354/xuanxuesheng.jsp'">选择学生</a></li>
                    <li><a href="tyi?temail=${temail}&tname=${tname}" rel="4" onclick="javascript:window.location.href='http://localhost:8080/354/yxsd.jsp'">已邀请学生</a></li>
                    <li><a href="tyao?temail=${temail}&tname=${tname}" rel="5" onclick="javascript:window.location.href='http://localhost:8080/354/YYQDDX.jsp'">学生申请</a></li>
                </ul>
            </nav>
        </footer>
		<!-- end: #footer -->
        <div class="clear"></div>
    </div>
    <!-- end: #wrapper -->

</body>
</html>