<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
		<!DOCTYPE html>
<html>

<head>

  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
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


  <link href="css/reset.css" rel="stylesheet" type="text/css" />
<link href="css/master.css" rel="stylesheet" type="text/css" />
<link href="css/fonts.css" rel="stylesheet" type="text/css" />
<script src="http://cdn.jquerytools.org/1.2.5/full/jquery.tools.min.js" type="text/javascript" ></script>
<!-- fancy box img viewer -->
<script type="text/javascript" src="js/fancybox/jquery.fancybox-1.3.1.pack.js"></script>
<script type="text/javascript" src="js/fancybox/jquery.easing-1.3.pack.js"></script>
<link rel="stylesheet" type="text/css" href="js/fancybox/jquery.fancybox-1.3.1.css" media="screen" />
<!-- form validation -->
<script src="js/jquery.validate.js" type="text/javascript"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#myform").validate();
});
</script>  
   <link type="text/css" rel="stylesheet" href="css/login.css">
    <script type="text/javascript" src="js/jquery-1.8.0.min.js"></script>
<title>学生信息管理</title>

 <style>
html{font-family:sans-serif;-ms-text-size-adjust:100%;-webkit-text-size-adjust:100%}
body{margin:0}
article,aside,details,figcaption,figure,footer,header,hgroup,main,nav,section,summary{display:block}
audio,canvas,progress,video{display:inline-block;vertical-align:baseline}
audio:not([controls]){display:none;height:0}[hidden],template{display:none}a{background:transparent}
a:active,a:hover{outline:0}
abbr[title]{border-bottom:1px dotted}
b,strong{font-weight:bold}
dfn{font-style:italic}
h1{font-size:2em;margin:0.67em 0}
mark{background:#ff0;color:#000}
small{font-size:80%}
sub,sup{font-size:75%;line-height:0;position:relative;vertical-align:baseline}
sup{top:-0.5em}
sub{bottom:-0.25em}
img{border:0}
svg:not(:root){overflow:hidden}
figure{margin:1em 40px}
hr{-moz-box-sizing:content-box;-webkit-box-sizing:content-box;box-sizing:content-box;height:0}
pre{overflow:auto}
code,kbd,pre,samp{font-family:monospace, monospace;font-size:1em}
button,input,optgroup,select,textarea{color:inherit;font:inherit;margin:0}
button{overflow:visible}
button,select{text-transform:none}
button,html input[type="button"],input[type="reset"],input[type="submit"]{-webkit-appearance:button;cursor:pointer}
button[disabled],html input[disabled]{cursor:default}
button::-moz-focus-inner,input::-moz-focus-inner{border:0;padding:0}
input{line-height:normal}
input[type="checkbox"],input[type="radio"]{-webkit-box-sizing:border-box;-moz-box-sizing:border-box;box-sizing:border-box;padding:0}
input[type="number"]::-webkit-inner-spin-button,input[type="number"]::-webkit-outer-spin-button{height:auto}
input[type="search"]{-webkit-appearance:textfield;-moz-box-sizing:content-box;-webkit-box-sizing:content-box;box-sizing:content-box}
input[type="search"]::-webkit-search-cancel-button,input[type="search"]::-webkit-search-decoration{-webkit-appearance:none}fieldset{border:1px solid #c0c0c0;margin:0 2px;padding:0.35em 0.625em 0.75em}
legend{border:0;padding:0}textarea{overflow:auto}
optgroup{font-weight:bold}table{border-collapse:collapse;border-spacing:0}td,th{padding:0}
</style>

    <style>
@import url(http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300,300italic,700);
body {
  background: #ddd;
}

sup {
  top: -.4em;
}

.pricing-container {
  width: 400px;
  text-align: center;
  font-family: 'Open Sans Condensed', sans-serif;
  position: absolute;
  margin-left: -130px;
  left: 45%;
  bottom: 5px;
}
.pricing-container .header {
  background: #2F2F2F;
  color: white;
  padding: 25px;
  font-size: 2.5em;
  font-weight: 300;
  border-radius: 5px 5px 0 0;
}
.pricing-container .price {
  background: #CAE1FF;
  background: linear-gradient(10deg, #D3D3D3 30%, #CAE1FF 80%);
  color: white;
  padding: 10px;
  box-shadow: inset 0 1px 0 rgba(255, 255, 255, 0.4);
  text-shadow: 0 1px 1px rgba(0, 0, 0, 0.2);
  font-size: 0.6em;
}
.pricing-container .price .figure {
  font-weight: 800;
  font-size: 0.8em;
  margin: 0 2px;
}
.pricing-container .price .cent {
  text-decoration: underline;
}
.pricing-container .price .frequency {
  color: #2F757F;
  text-shadow: none;
}
.pricing-container .price:hover .details {
  height: 15px;
}
.pricing-container .price .details {
  color: #2F757F;
  font-size: .6em;
  display: block;
  height: 0;
  overflow: hidden;
  transition: all 400ms ease;
}
.pricing-container .itemsWrapper {
  border: 1px solid #E6E6E6;
  border-top: none;
  border-radius: 0 0 2px 2px;
  background: white;
  box-shadow: inset 14px 0 white, inset 15px 0 #f2f2f2, inset -14px 0 white, inset -15px 0 #f2f2f2;
}
.pricing-container .itemsWrapper .items {
  list-style: none;
  padding: 15px;
  margin: 0;
}
.pricing-container .itemsWrapper .item {
  padding: 7px;
  text-transform: capitalize;
}

</style>

    <script src="js/prefixfree.min.js"></script>

    <script src="js/modernizr.js"></script>

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
    
    
<body class="login_bj" >	
<div class="zhuce_body">
      <center><s:form action="select" theme="simple"> 
               <span style="color: #CAE1FF"> 按条件筛选：研究方向:</span><s:textfield name="tindu" label="研究方向" class="textf"></s:textfield>
             <span style="color: #CAE1FF">姓名:  </span>  <s:textfield name="tname" label="姓名" class="textf"></s:textfield>
                <s:hidden name="semail"></s:hidden>
                      <span style="color: #CAE1FF">   导师年龄下限  ：</span>  <s:textfield name="tage" label="导师年龄下限" class="textf"></s:textfield>
               <s:submit value="筛选" class="textf"/>
</s:form></center>
   


<div class="pricing-container">
   <table width="450" >
    
    <s:iterator value="BL" id="a" status = "s">
			<tr>
			<td>
			<div class="price">
			<span>
				<span class="figure"><a href="checkdx?dx=<s:property value="a"/>&sna=${sna}&semail=${semail}"><s:property value="a"/> </a></span> 
				 <div class='details'> </div>
				  </span>
				    </div>
				    
			</td>
			</tr>
			</s:iterator>
    </table>
  </div>
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
</div>
</body>
</html>