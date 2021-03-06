package www.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import www.action.DB_connect;
import www.model.file1;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class TapplyAction extends ActionSupport implements
ModelDriven<file1>{
	private String tnamea;//姓名
	private int tagea;//年龄
	private String temaila;//email
	private int tsexa;//性别
	private String tnuma;//教职工号
	private String tchoola;//学校
	private String tmaina;//研究方向
	private String tchena;//研究成果
	private int txemail;//是否显示邮箱
	private String tnumbera;//密码
	private String tsmaina;//要求学生的专业
 	private int tsb;//是否要求学生读博
 	private int tsp;//对学生排名的要求
 	private String tsshool;//对学生学校的要求
	private String error_messageo="注册失败！";
	private file1 singleFile1 = new file1();
	//照片
	public file1 getModel()
	{
		return singleFile1;
	}
	Connection connect_temp = DB_connect.connect();
	Connection connect_tempp = DB_connect.connect();

	public String getError_messageo(){
		return error_messageo;
	}
    public String getTnamea(){
		return tnamea;
	}
    public int getTagea(){
		return tagea;
	}
    public String getTemaila() {
        return temaila;
    }
    public int getTsexa(){
		return tsexa;
	}
    public String getTnuma(){
		return tnuma;
	}
    public String getTchoola(){
		return tchoola;
	}
    public String getTmaina(){
		return tmaina;
	}
  
    public String getTchena(){
		return tchena;
	}
    public int getTsb(){
		return tsb;
	}
    public int getTxemail(){
		return txemail;
	}
    public String getTnumbera(){
		return tnumbera;
	}
    public String getTsmaina(){
		return tsmaina;
	}
    public int getTsp(){
		return tsp;
	}
    public String getTsshool(){
		return tsshool;
	}


    public void setError_messageo(String error_messageo) {

        this.error_messageo = error_messageo;
    }
    public void setTnamea(String tnamea) {
        this.tnamea = tnamea;
    }
    public void setTagea(int tagea) {
        this.tagea = tagea;
    }
    public void setTemaila(String temaila) {
        this.temaila = temaila;
    }
    public void setTsexa(int tsexa) {
        this.tsexa = tsexa;
    }
    public void setTnuma(String tnuma) {
        this.tnuma = tnuma;
    }
    public void setTchoola(String tchoola) {
        this.tchoola = tchoola;
    }
    public void setTmaina(String tmaina) {
        this.tmaina = tmaina;
    }
   
    public void setTchena(String tchena) {
        this.tchena = tchena;
    }
    public void setTsb(int tsb) {
        this.tsb = tsb;
    }
    public void setTnumbera(String tnumbera) {
        this.tnumbera = tnumbera;
    }	
    public void setTxemail(int txemail) {
        this.txemail = txemail;
    }
    public void setTsmaina(String tsmaina) {
        this.tsmaina = tsmaina;
    }
    public void setTsp(int tsp) {
        this.tsp = tsp;
    }
    public void setTsshool(String tsshool) {
        this.tsshool = tsshool;
    }
    public static boolean checkEmail(String email)
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

	public String execute() throws Exception {
		java.sql.PreparedStatement flag = null;
		java.sql.ResultSet re1 = null;
		java.sql.PreparedStatement flagg = null;
		java.sql.ResultSet re11 = null;
		int i=0;
		int em=0;

		if(TapplyAction.isEmptyString(temaila))
		{
			if (TapplyAction.checkEmail(temaila))// 验证邮箱

			{
			    flag=connect_tempp.prepareStatement("select tn,ta,te,ts,jzgh,induction,tc,tsuccess,tx,tschool,tm,tb,tp,tsshool,tnumber,tpone,tptwo,tpthree,tpfour from teacher where te = ?");

				flag.setString(1, temaila);
				re1=flag.executeQuery();
				while(re1.next())//判断email是否重复
				{
					i=1;
				}
				if(i==1)
					error_messageo+="该email已注册！\n";

			}
			else
			{
			 i=1;
			 error_messageo+="邮箱名不符合规范！\n";
			}


		}
		else
		{
			em=1;
			error_messageo+="请将填写邮箱！\n";
		}

		if(TapplyAction.isEmptyString(tnamea))
		{
			flagg=connect_temp.prepareStatement("select tn,ta,te,ts,jzgh,induction,tc,tsuccess,tx,tschool,tm,tb,tp,tsshool,tnumber,tpone,tptwo,tpthree,tpfour from teacher where tn = ?");

			flagg.setString(1, tnamea);
			re11=flagg.executeQuery();
			while(re11.next())//判断姓名是否重复
			{
				i=1;
				
			}
			if(i==1)
				error_messageo+="该姓名已注册！\n";
		}
		else
		{
			em=1;
			error_messageo+="请填写姓名！\n";
		}

		if(TapplyAction.isEmptyString(tnuma))

		{
			if(!tnuma.matches("^[\\da-zA-Z]*$"))//判断
			{
				i=1;
				error_messageo+="请填写正确的教职工号！\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="请填写教职工号！\n";
		}

		if(TapplyAction.isEmptyString(tchoola))
		{
			if(!TapplyAction.isChinese(tchoola))

			{
				i=1;
				error_messageo+="请填写正确的学校！\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="请填写学校！\n";
		}
		

		if(TapplyAction.isEmptyString(tmaina))
		{
			if(!TapplyAction.isChinese(tmaina))

			{
				i=1;
				error_messageo+="请填写正确的研究方向！\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="请填写研究方向！\n";
		}
		

		if(TapplyAction.isEmptyString(tsshool))
		{
			if(!TapplyAction.isChinese(tsshool))
			{
				i=1;
				error_messageo+="请填写正确的学生学校！\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="请填写学生学校！若不要求请填无\n";
		}
		

		if(TapplyAction.isEmptyString(tsmaina))
		{
			if(!TapplyAction.isChinese(tsmaina))

			{
				i=1;
				error_messageo+="请填写正确学生的专业！\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="请填写学生的专业,若不要求请填无！\n";
		}
		
		
		

		if(!TapplyAction.isEmptyString(tchena))

		{
			em=1;
			error_messageo+="请填写成果，若没有请填无！\n";
		}

		if(tagea==0)
		{
			em=1;
			error_messageo+="请填写年龄!\n";
		}
		if(tagea<20||tagea>=100)
		{
			em=1;
			error_messageo+="请填写正确的年龄\n";
		}
		if(tsp<0)
		{
			em=1;
			error_messageo+="请填写正确的学生排名要求！\n";
		}
		if(tnumbera.length()<8)
		{
			em=1;
			error_messageo+="请填写长度不少于8的密码\n";
		}
		if(i==0&&em==0)
		{
			

			String sql = "insert into teacher ( tn,ta,te,ts,jzgh,induction,tc,tsuccess,tx,tschool,tm,tb,tp,tsshool,tnumber,tpone,tptwo,tpthree,tpfour) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement pStmt = connect_temp.prepareStatement(sql);
			pStmt.setString(1,tnamea);
			pStmt.setInt(2,tagea);
			pStmt.setString(3,temaila);
			pStmt.setInt(4,tsexa);
			pStmt.setString(5,tnuma);
			pStmt.setString(6,tmaina);
			pStmt.setString(7,tchena);
			pStmt.setInt(8,0);
			pStmt.setInt(9,txemail);
			pStmt.setString(10,tchoola);
			pStmt.setString(11,tsmaina);
			pStmt.setInt(12,tsb);
			pStmt.setInt(13,tsp);
			pStmt.setString(14,tsshool);
			pStmt.setString(15,tnumbera);
			String root = "d:\\uppicture\\";
			File rootFile = new File(root);
			if(!rootFile.exists())
			{
				rootFile.mkdir();
			}
			if(singleFile1.getResume1FileName() != null)
	    	{
				String filename1 = root +singleFile1.getResume1FileName();		
				FileInputStream fis1 = new FileInputStream(singleFile1.getResume1());
				FileOutputStream fos1 = new FileOutputStream(filename1);
				byte[] buffer1 = new byte[8192];
				int n1 = 0;
				while((n1 = fis1.read(buffer1)) > 0)
				{
					fos1.write(buffer1, 0, n1);
				}
				fos1.close();
				fis1.close();
				pStmt.setString(19,singleFile1.getResume1FileName());


	    	}
			else
				pStmt.setString(19,"无");
			if(singleFile1.getResume2FileName() != null){
			String filename2 = root + singleFile1.getResume2FileName();
			FileInputStream fis2 = new FileInputStream(singleFile1.getResume2());
			FileOutputStream fos2 = new FileOutputStream(filename2);
			byte[] buffer2 = new byte[8192];
			int n2 = 0;
			while((n2 = fis2.read(buffer2)) > 0)
			{
				fos2.write(buffer2, 0, n2);
			}
			fos2.close();
			fis2.close();
			pStmt.setString(16,singleFile1.getResume2FileName());
			}
			else
				pStmt.setString(16,"无");
			if(singleFile1.getResume3FileName() != null){
			String filename3 = root + singleFile1.getResume3FileName();	
			FileInputStream fis3 = new FileInputStream(singleFile1.getResume3());
			FileOutputStream fos3 = new FileOutputStream(filename3);
			byte[] buffer3 = new byte[8192];
			int n3 = 0;
			while((n3 = fis3.read(buffer3)) > 0)
			{
				fos3.write(buffer3, 0, n3);
			}
			fos3.close();
			fis3.close();
			pStmt.setString(17,singleFile1.getResume3FileName());
			}
			else
				pStmt.setString(17,"无");
			if(singleFile1.getResume4FileName() != null){
			String filename4 = root + singleFile1.getResume4FileName();	
			FileInputStream fis4 = new FileInputStream(singleFile1.getResume4());
			FileOutputStream fos4 = new FileOutputStream(filename4);
			byte[] buffer4 = new byte[8192];
			int n4 = 0;
			while((n4 = fis4.read(buffer4)) > 0)
			{
				fos4.write(buffer4, 0, n4);
			}
			fos4.close();
			fis4.close();
			pStmt.setString(18,singleFile1.getResume4FileName());
			}
			else
				pStmt.setString(18,"无");
			pStmt.executeUpdate();
			return "success";
		}
		else
			return "error";
    }


}

