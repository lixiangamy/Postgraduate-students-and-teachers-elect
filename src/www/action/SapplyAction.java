package www.action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import www.action.DB_connect;

public class SapplyAction {
	private String snamea;//����
	private int sagea;//����
	private String semaila;//email
	private int ssexa;//�Ա�
	private String snuma;//ѧ��
	private String schoola;//����ԺУ
	private String smaina;//����רҵ
	private int srankinga;//����
	private String schena;//�ɹ�
	private int sboa;//�Ƿ����
	private String snumbera;//����
	private String error_message="ע��ʧ�ܣ�";
	
	//��Ƭ
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
    {// ��֤�����������ʽ
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
		if(SapplyAction.isEmptyString(semaila))
		{
			if (SapplyAction.checkEmail(semaila))// ��֤����
			{
				System.out.println(i); 
			    flag=connect_tempp.prepareStatement("select n,a,e,s,xuehao,school,m,p,c,b,number,d,photo,prove,pone,ptwo,pthere from student where e = ?");
				flag.setString(1, semaila);
				re1=flag.executeQuery();
				while(re1.next())//�ж�email�Ƿ��ظ�
				{
					i=1;
				}
				if(i==1)
					error_message+="��email��ע�ᣡ\n";
					
			}
			else
			{
			 i=1;
			 error_message+="�����������Ϲ淶��\n";
			}
		}
		else
		{
			em=1;
			error_message+="�뽫��д���䣡\n";
		}
		if(SapplyAction.isEmptyString(snamea))
		{
			flagg=connect_temp.prepareStatement("select n,a,e,s,xuehao,school,m,p,c,b,number,d,"
					+ "photo,prove,pone,ptwo,pthere from student where n = ?");
			flagg.setString(1, snamea);
			re11=flagg.executeQuery();
			while(re11.next())//�ж������Ƿ��ظ�
			{
				i=1;
				error_message+="��������ע�ᣡ\n";
			}
		}
		else
		{
			em=1;
			error_message+="����д������\n";
		}
		if(SapplyAction.isEmptyString(snuma))
		{
			if(!snuma.matches("^[\\da-zA-Z]*$"))//�ж�ѧ��
			{
				i=1;
				error_message+="����д��ȷ��ѧ�ţ�\n";
			}
		}
		else
		{
			em=1;
			error_message+="����дѧ�ţ�\n";
		}
		if(SapplyAction.isEmptyString(schoola))
		{
			if(!SapplyAction.isChinese(schoola))
			{
				i=1;
				error_message+="����д��ȷ��ѧУ��\n";
			}
		}
		else
		{
			em=1;
			error_message+="����дѧУ��\n";
		}
		
		if(SapplyAction.isEmptyString(smaina))
		{
			if(!SapplyAction.isChinese(smaina))
			{
				i=1;
				error_message+="����д��ȷ��רҵ��\n";
			}
		}
		else
		{
			em=1;
			error_message+="����дרҵ��\n";
		}
		if(!SapplyAction.isEmptyString(schena))
		{
			em=1;
			error_message+="����д�ɹ�����û�������ޣ�\n";
		}
		if(sagea==0)
		{
			em=1;
			error_message+="����д����!\n";
		}
		if(sagea<0||sagea>=100)
		{
			em=1;
			error_message+="����д��ȷ������\n";
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

