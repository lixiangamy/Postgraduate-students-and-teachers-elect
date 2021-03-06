<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Colores - Responsive HTML vCard</title>
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
            <h3>Colors</h3>
        	<select name="color">
            	<option value="blue" >Blue</option>
                <option value="red" >Red</option>
                <option value="gray" >Gray</option>
                <option value="orange" >Orange</option>
                <option value="green" >Green</option>
                <option value="purple" selected>Purple</option>
                <option value="pale-blue" >Pale Blue</option>
            </select>
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
                <h1 class="arvo">JOHN DOE</h1>
                <h2>graphic designer</h2>
            </hgroup>
            <a href="#" class="download">Download vCard</a>
            <div class="social alignright">
            	<a href="#" class="dribble" target="_blank" title="Dribble"></a>
                <a href="#" class="flickr" target="_blank" title="Flickr"></a>
                <a href="#" class="twitter" target="_blank" title="Twitter"></a>
                <a href="#" class="facebook" target="_blank" title="Facebook"></a>
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
                            <div class="border"></div>
                            <div class="info alignleft">
                                <ul class="info np">
                                    <s:form action="back" theme="simple" enctype="multipart/form-data"> 
<table width="450" border="1" cellspacing="0" cellpadding="2" bordercolor="#009900"> 
	
	<tr>
	<td>姓名: <s:property value="sna"></s:property></td>
	<s:hidden name="semail"></s:hidden>
	<td>年龄:<s:textfield name="sage" value="%{sage}"></s:textfield></td>
	<td>性别:<s:property value="ssex"></s:property></td>
	<td rowspan="3">照片</td>
	</tr>
	<tr>
	<td>电子邮件:<s:property value="semail"></s:property></td>
	<td>学号:<s:property value="sxuehao"></s:property></td>
	<td>本科院校:<s:property value="sschool"></s:property></td>
	</tr>
	<tr>
	<td>本科专业:<s:property value="sm"></s:property></td>
	<td>专业排名:<s:property value="sp"></s:property></td>
	<td>是否有读博意向:<s:textfield name="sb" value="%{sb}"></s:textfield></td>
	</tr>
	<tr>
	<td>是否已选择导师:<s:property value="sd"></s:property></td>
	<td>密码:<s:textfield name="snumber" value="%{snumber}"></s:textfield></td>
	<td colspan="2">成果:<s:textfield name="sc" value="%{sc}"></s:textfield></td>
	</tr>
	<tr>
	<td>证明照片一</td>
	<td>证明照片二</td>
	<td>证明照片三</td>
	<td>学号证明照片</td>
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
                            <div class="border"></div>
                            <div class="alignleft">
                                <section class="skills">
                                    <h3 class="np">SOFTWARE SKILLS</h3>
                                    <ul class="info">
                                        <li><span class="rating5"></span>Adobe Fireworks</li>
                                        <li><span class="rating2"></span>Adobe Photoshop</li>
                                        <li><span class="rating5"></span>Adobe Illustrator</li>
                                        <li><span class="rating3"></span>Adobe Dreamweaver</li>
                                        <li><span class="rating1"></span>Corel Painter</li>
                                    </ul>
                                </section>
                                <section class="skills">
                                    <h3>PROGRAMMING SKILLS</h3>
                                    <ul class="info">
                                        <li><span class="rating3"></span>HTML / HTML 5</li>
                                        <li><span class="rating2"></span>CSS / CSS 3</li>
                                        <li><span class="rating1"></span>PHP</li>
                                        <li><span class="rating3"></span>MYSQL</li>
                                    </ul>
                                </section>
                                <div class="clear"></div>
                            </div>
                            <div class="alignright">
                                <section class="misc">
                                    <h3>EDUCATION</h3>
                                    <ul class="info">
                                        <li><span class="date">1996 - 2001</span><p>University of Harvard<span class="charge">Graphic and Illustrator Designer</span></p></li>
                                        <li><span class="date">2003- 2007</span><p>School of Arts, Los Angeles, CA<span class="charge">Master on Design</span></p></li>
                                </ul>
                                	<div class="clear"></div>
                                </section>
                                <section class="misc">
                                    <h3>WORK</h3>
                                    <ul class="info">
                                        <li><span class="date">1996 - 2001</span><p>University of Harvard<span class="charge">Graphic and Illustrator Designer</span></p></li>
                                        <li><span class="date">2003- 2007</span><p>School of Arts, Los Angeles, CA<span class="charge">Master on Design</span></p></li>
                                    </ul>
                                    <div class="clear"></div>
                                </section>
                            </div>
                            <div class="clear"></div>
                        </div>
                        <!-- end: #resume -->
                    </li>
                    <li class="box">
                        <!-- start: #portfolio -->
                        <div id="portfolio">
                        	<h3>MY WORK</h3>
                            <a href="http://www.cssmoban.com/" class="video"><img src="images/portfolio/1-th.jpg" width="140" height="100" alt="Image 1"><p><span></span>Lorem Ipsum</p></a>
                            <a href="http://www.cssmoban.com/" class="website"><img src="images/portfolio/2-th.jpg" width="140" height="100" alt="Image 2"><p><span></span>Lorem Ipsum dolor sit amet</p></a>
                            <a href="images/portfolio/3.jpg" class="photo" title="Lorem Ipsum dolor sit amet" rel="gallery1"><img src="images/portfolio/3-th.jpg" width="140" height="100" alt="Image 3"><p><span></span>Lorem Ipsum dolor sit amet</p></a>
                            <a href="http://www.cssmoban.com/" class="video last"><img src="images/portfolio/4-th.jpg" width="140" height="100" alt="Img 1"><p><span></span>Lorem Ipsum</p></a>
                            <a href="http://www.cssmoban.com/" class="video"><img src="images/portfolio/2-th.jpg" width="140" height="100" alt="Image 5"><p><span></span>Lorem Ipsum</p></a>
                            <a href="http://www.cssmoban.com/" class="website"><img src="images/portfolio/3-th.jpg" width="140" height="100" alt="Image 6"><p><span></span>Lorem Ipsum dolor sit amet</p></a>
                            <a href="images/portfolio/4.jpg" class="photo" title="Lorem Ipsum dolor sit amet" rel="gallery1"><img src="images/portfolio/4-th.jpg" width="140" height="100" alt="Image 7"><p><span></span>Lorem Ipsum dolor sit amet</p></a>
                            <a href="http://www.cssmoban.com/" class="video last"><img src="images/portfolio/1-th.jpg" width="140" height="100" alt="Img 8"><p><span></span>Lorem Ipsum</p></a>
                        </div>
                        <!-- end: #portfolio -->
                    </li>
                    <li>
                        <!-- start #contact -->
                        <div id="contact">
                            <div class="border"></div>
                            <div class="alignleft">
                                <form action="send.php" class="contact" method="post">
                                    <h3 class="np">CONTACT ME</h3>
                                    <input type="text" name="name" class="inputbox required alignleft" title="Your name...">
                                    <input type="text" name="email" class="inputbox required alignright" title="Your email...">
                                    <textarea name="message" class="required" title="Your message..."></textarea>
                                    <input type="hidden" name="action" value="send">
                                    <input type="submit" value="Send" class="send">
                                </form>
                                <div class="clear"></div>
                                <section>
                                    <h3>CONTACT INFO</h3>
                                    <p>Road Hill 239, Florida, CA<br>United States</p>
                                </section>
                            </div>
                            <div class="alignright">
                                <section>
                                    <h3 class="np">MAP</h3>
                                    <div id="map_canvas"></div>
                                </section>
                            </div>
                            <div class="clear"></div>
                        </div>
                        <!-- end: #contact -->
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
                	<li><a href="sinfor?semail=${semail}&sna=${sna}" class="sinfor" rel="1">个人信息</a></li>
                    <li><a href="stui?semail=${semail}&sna=${sna}" class="stui" rel="2">系统推荐</a></li>
                    <li><a href="schoose?semail=${semail}&sna=${sna}" class="schoose" rel="3">选择导师</a></li>
                    <li><a href="syi?semail=${semail}&sna=${sna}" class="syi" rel="4">已申请导师</a></li>
                    <li><a href="syao?semail=${semail}&sna=${sna}" class="syao" rel="5">导师邀请</a></li>
                </ul>
            </nav>
        </footer>
		<!-- end: #footer -->
        <div class="clear"></div>
    </div>
    <!-- end: #wrapper -->

</body>
</html>