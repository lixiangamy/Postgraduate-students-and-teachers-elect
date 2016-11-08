<%@ page contentType="text/html;charset= UTF-8"%>
<%@ page import="wyf.zrk.CartBean,wyf. zrk.DBcart,java.util.*"%> 

<!-- 导入相关的包  -->  
<html><head><title>用户信息修改</title>  
<script language="javascript" src="script/trim.js">
</script><!--导入脚本-->  
<script language="javascript">  
         function check(){  
           var pwd = document.mfmodify.upwd.value;    
//得到用户输入的密码  
           var email = document.mfmodify.uemail.value; 
//得到用户输入的E-mail  
           if(pwd.trim()==""){alert("密码不可以为空!!!");
return;}//密码为空时提示用户  
         else if(pwd.trim().length<6){alert("
密码长度不得少于6!!!");return;} 

//密码长度小于6时提示用户  
          else if(email.trim()==""){alert("E-mail不得为空!!!");return;} 

//E-mail为空时提示用户  
          document.mfmodify.submit();             //将表单提交  
        }</script></head>  
    <body><jsp:useBean id="mycart" class="wyf.zrk.CartBean" 
scope="session"/>  
       <table width="100%"><tr><td><%@ include file="top.
jsp" %></td></tr>  
            <tr align="center"><td><table>  
                  <form action="CartServlet" method="post" 
name="mfmodify">  
                    <% String uname = (String)session.
getAttribute("user"); 

//得到用户名  
                        uname = new String(uname.
getBytes(),"ISO-8859-1");

//将编码转为ISO-8859-1  
                        //从数据库中搜索出用户的资料  
                        String sql = "select Uname,Upwd,
Uemail from UserInfo "+  
                                              "where U
name='"+uname+"'";  
                        Vector<String[]> vuser = DBcart.
getInfoArr(sql);  
                        String[] str = vuser.get(0); %>  
               <tr align="center"><td><br/><br/>用户名:</td>  
                 <td align="left"><br/><br/><%=str[0] %></td></tr>  
               <tr><td><br/><br/>密&nbsp;码:</td>  
                 <td><br/><br/><input type="password" 
name="upwd" value="<%=

str[1] %>"/></td></tr>  
               <tr><td><br/><br/>E-mail:</td>  
                  <td><br/><br/><input name="uemail" 
value="<%=str[2] %>"/>
</td></tr>  
               <tr><td align="right">  
                  <br/><br/><input type="button" value="
修改" onclick= "check()"/>  
               <input type="hidden" name="action" value="
uinfomodify"/></td>  
                  <td align="right"><br/><br/>  
                     <a href="javascript:history.back()">
单击这里返回</a></td>  
               </tr></form></table></td></tr></table></body></html> 