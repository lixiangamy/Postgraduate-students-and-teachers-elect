package www.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import www.action.DB_connect;

import www.action.DB_connect;

public class SapplyAction {
	private String snamea;//姓名
	private int sagea;//年龄
	private String semaila;//email
	private int ssexa;//性别
	private String snuma;//学号
	private String schoola;//本科院校
	private String smaina;//本科专业
	private int srankinga;//排名
	private String schena;//成果
	private int sboa;//是否读博
	private String snumbera;//密码
<<<<<<< HEAD
	private String error_message="注册失败！\n";
=======
	private String error_message="注册失败！";
>>>>>>> 14
	
	//照片
	Connection connect_temp = DB_connect.connect();
	Connection connect_tempp = DB_connect.connect();
	public String getError_message(){
		return error_message;
	}
    public String getSnamea(){
		return snamea;
	}
    public int getSagea(){
		return sagea;
	}
    public String getSemaila() {
        return semaila;
    }
    public int getSsexa(){
		return ssexa;
	}
    public String getSnuma(){
		return snuma;
	}
    public String getSchoola(){
		return schoola;
	}
    public String getSmaina(){
		return smaina;
	}
    public int getSrankinga(){
		return srankinga;
	}
    public String getSchena(){
		return schena;
	}
    public int getSboa(){
		return sboa;
	}
    public String getSnumbera(){
		return snumbera;
	}
    
    public void setError_message(String error_message) {
        this.error_message = error_message;
    }
    public void setSnamea(String snamea) {
        this.snamea = snamea;
    }
    public void setSagea(int sagea) {
        this.sagea = sagea;
    }
    public void setSemaila(String semaila) {
        this.semaila = semaila;
    }
    public void setSsexa(int ssexa) {
        this.ssexa = ssexa;
    }
    public void setSnuma(String snuma) {
        this.snuma = snuma;
    }
    public void setSchoola(String schoola) {
        this.schoola = schoola;
    }
    public void setSmaina(String smaina) {
        this.smaina = smaina;
    }
    public void setSrankinga(int srankinga) {
        this.srankinga = srankinga;
    }
    public void setSchena(String schena) {
        this.schena = schena;
    }
    public void setSboa(int sboa) {
        this.sboa = sboa;
    }
    public void setSnumbera(String snumbera) {
        this.snumbera = snumbera;
    }	
    public static boolean checkEmail(String email)
<<<<<<< HEAD
    {// 验证邮箱的正则表达式 
     String format = "\\p{Alpha}\\w{2,15}[@][a-z0-9]{3,}[.]\\p{Lower}{2,}";
     //p{Alpha}:内容是必选的，和字母字符[\p{Lower}\p{Upper}]等价。如：200896@163.com不是合法的。
     //w{2,15}: 2~15个[a-zA-Z_0-9]字符；w{}内容是必选的。 如：dyh@152.com是合法的。
     //[a-z0-9]{3,}：至少三个[a-z0-9]字符,[]内的是必选的；如：dyh200896@16.com是不合法的。
     //[.]:'.'号时必选的； 如：dyh200896@163com是不合法的。
     //p{Lower}{2,}小写字母，两个以上。如：dyh200896@163.c是不合法的。
     if (email.matches(format))
      { 
       return true;// 邮箱名合法，返回true 
      }
     else
      {
       return false;// 邮箱名不合法，返回false
      }
    }
    public static boolean isEmptyString(String s)
    {
        if (s == null || s == "")
=======
    {// 验证邮箱的正则表达式
    	String check = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";    
		 Pattern regex = Pattern.compile(check);    
		 Matcher matcher = regex.matcher(email);    
		 boolean isMatched = matcher.matches();    
		 return isMatched;
    }
    public static boolean isEmptyString(String s)
    {
        if (s == null || s.length()==0)
>>>>>>> 14
        	return false;
        else 
        	return true;
    }
    public static boolean isChinese(String str){
		if(str.matches("[\\u4E00-\\u9FA5]+")) 
			return true;
		else
			return false;
	}
<<<<<<< HEAD
    
=======
>>>>>>> 14
	public String execute() throws Exception {
		java.sql.PreparedStatement flag = null;
		java.sql.ResultSet re1 = null;
		java.sql.PreparedStatement flagg = null;
		java.sql.ResultSet re11 = null;
		int i=0;
		int em=0;
		if(SapplyAction.isEmptyString(semaila))
		{
			if (SapplyAction.checkEmail(semaila))// 验证邮箱
<<<<<<< HEAD
			{   
			 flag=connect_tempp.prepareStatement("select n,a,e,s,xuehao,school,m,p,c,b,number,d,"
						+ "photo,prove,pone,ptwo,pthere from student where e = ?");
=======
			{
				System.out.println(i); 
			    flag=connect_tempp.prepareStatement("select n,a,e,s,xuehao,school,m,p,c,b,number,d,photo,prove,pone,ptwo,pthere from student where e = ?");
>>>>>>> 14
				flag.setString(1, semaila);
				re1=flag.executeQuery();
				while(re1.next())//判断email是否重复
				{
					i=1;
<<<<<<< HEAD
					error_message+="该email已注册！\n";
				}
=======
				}
				if(i==1)
					error_message+="该email已注册！\n";
					
>>>>>>> 14
			}
			else
			{
			 i=1;
			 error_message+="邮箱名不符合规范！\n";
			}
<<<<<<< HEAD
			
=======
>>>>>>> 14
		}
		else
		{
			em=1;
			error_message+="请将填写邮箱！\n";
		}
		if(SapplyAction.isEmptyString(snamea))
		{
			flagg=connect_temp.prepareStatement("select n,a,e,s,xuehao,school,m,p,c,b,number,d,"
					+ "photo,prove,pone,ptwo,pthere from student where n = ?");
			flagg.setString(1, snamea);
			re11=flagg.executeQuery();
			while(re11.next())//判断姓名是否重复
			{
				i=1;
				error_message+="该姓名已注册！\n";
			}
		}
		else
		{
			em=1;
			error_message+="请填写姓名！\n";
		}
		if(SapplyAction.isEmptyString(snuma))
		{
			if(!snuma.matches("^[\\da-zA-Z]*$"))//判断学号
			{
				i=1;
				error_message+="请填写正确的学号！\n";
			}
		}
		else
		{
			em=1;
			error_message+="请填写学号！\n";
		}
		if(SapplyAction.isEmptyString(schoola))
		{
			if(!SapplyAction.isChinese(schoola))
			{
				i=1;
				error_message+="请填写正确的学校！\n";
			}
		}
		else
		{
			em=1;
			error_message+="请填写学校！\n";
		}
		
		if(SapplyAction.isEmptyString(smaina))
		{
			if(!SapplyAction.isChinese(smaina))
			{
				i=1;
				error_message+="请填写正确的专业！\n";
			}
		}
		else
		{
			em=1;
			error_message+="请填写专业！\n";
		}
		if(!SapplyAction.isEmptyString(schena))
		{
			em=1;
			error_message+="请填写成果，若没有请填无！\n";
		}

		if(sagea==0)
		{
			em=1;
			error_message+="请填写年龄!\n";
		}
		if(sagea<0||sagea>=100)
		{
			em=1;
			error_message+="请填写正确的年龄\n";
		}
		if(i==0&&em==0)
		{
			
			String sql = "insert into student ( n,a,e,s,xuehao,school,m,p,c,b,number,d,photo,prove,pone,ptwo,pthere) value (?,?,?,?,?,?,?,?,?,?,?,?,'','','','','')";

			PreparedStatement pStmt = connect_temp.prepareStatement(sql);
			pStmt.setString(1,snamea);
			pStmt.setInt(2,sagea);
			pStmt.setString(3,semaila);
			pStmt.setInt(4,ssexa);
			pStmt.setString(5,snuma);
			pStmt.setString(6,schoola);
			pStmt.setString(7,smaina);
			pStmt.setInt(8,srankinga);
			pStmt.setString(9,schena);
			pStmt.setInt(10,sboa);
			pStmt.setString(11,snumbera);
			pStmt.setInt(12,0);
			pStmt.executeUpdate();
			return "success";
		}
		else
			return "error";
    }
}

