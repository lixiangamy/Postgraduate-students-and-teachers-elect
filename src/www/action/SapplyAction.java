package www.action;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import www.action.DB_connect;
import com.opensymphony.xwork2.ModelDriven;
import www.model.file;

import com.opensymphony.xwork2.ActionSupport;

public class SapplyAction extends ActionSupport implements
ModelDriven<file>{
	private String snamea;//����
	private int sagea;//����
	private String semaila;//email
	private int ssexa;//�Ա�
	private int sgsexa;
	private String snuma;//ѧ��
	private String schoola;//����ԺУ
	private String smaina;//����רҵ
	private int srankinga;//����
	private String schena;//�ɹ�
	private int sboa;//�Ƿ����
	private String snumbera;//����

	private String error_message="ע��ʧ�ܣ�";
  
	private file singleFile = new file();

	public file getModel()
	{
		return singleFile;
	}
	
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
    public int getSgsexa(){
		return sgsexa;
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
    public void setSgsexa(int sgsexa) {
        this.sgsexa = sgsexa;
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
			    flag=connect_tempp.prepareStatement("select n,a,e,s,xuehao,school,m,p,c,b,number,d,photo,pone,ptwo,pthree,prove from student where e = ?");
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
					+ "photo,pone,ptwo,pthree,prove from student where n = ?");
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
		if(sagea<12||sagea>=100)
		{
			em=1;
			error_message+="����д��ȷ������\n";
		}
		if(snumbera.length()<8)
		{
			em=1;
			error_message+="����д���Ȳ�����8������\n";
		}
		String root = "d:\\uppicture\\";
		File rootFile = new File(root);
		if(!rootFile.exists())
		{
			rootFile.mkdir();
		}
		String filename = root + singleFile.getResumeFileName();	//+snamea+"0"
		if(singleFile.getResumeFileName() == null)
    	{
    		addFieldError("resume", "���½ѧ�����ϴ�ѧ������ƥ���ͼ");
    		error_message+="���½ѧ�����ϴ�ѧ������ƥ���ͼ\n";
    		em=1;
    	}

		if(i==0&&em==0)
		{
			
			String sql = "insert into student ( n,a,e,s,xuehao,school,m,p,c,b,number,d,photo,pone,ptwo,pthree,prove) value (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

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
			pStmt.setString(17,singleFile.getResumeFileName());

			FileInputStream fis = new FileInputStream(singleFile.getResume());
			FileOutputStream fos = new FileOutputStream(filename);
			byte[] buffer = new byte[8192];
			int n = 0;
			while((n = fis.read(buffer)) > 0)
			{
				fos.write(buffer, 0, n);
			}
			fos.close();
			fis.close();

			//System.out.println( singleFile.getResumeFileName());


			if(singleFile.getResume1FileName() != null)
	    	{
				String filename1 = root +singleFile.getResume1FileName();//+ snamea+"1"		
				FileInputStream fis1 = new FileInputStream(singleFile.getResume1());
				FileOutputStream fos1 = new FileOutputStream(filename1);
				byte[] buffer1 = new byte[8192];
				int n1 = 0;
				while((n1 = fis1.read(buffer1)) > 0)
				{
					fos1.write(buffer1, 0, n1);
				}
				fos1.close();
				fis1.close();
				pStmt.setString(13,singleFile.getResume1FileName());

				//System.out.println( singleFile.getResume1FileName());

	    	}
			else
				pStmt.setString(13,"��");
			if(singleFile.getResume2FileName() != null){
			//System.out.println( singleFile.getResume1ContentType());
			String filename2 = root + singleFile.getResume2FileName();//	snamea+"2"+	
			FileInputStream fis2 = new FileInputStream(singleFile.getResume2());
			FileOutputStream fos2 = new FileOutputStream(filename2);
			byte[] buffer2 = new byte[8192];
			int n2 = 0;
			while((n2 = fis2.read(buffer2)) > 0)
			{
				fos2.write(buffer2, 0, n2);
			}
			fos2.close();
			fis2.close();
			pStmt.setString(14,singleFile.getResume2FileName());
			}
			else
				pStmt.setString(14,"��");
			if(singleFile.getResume3FileName() != null){
			String filename3 = root + singleFile.getResume3FileName();	//snamea+"3"+	
			FileInputStream fis3 = new FileInputStream(singleFile.getResume3());
			FileOutputStream fos3 = new FileOutputStream(filename3);
			byte[] buffer3 = new byte[8192];
			int n3 = 0;
			while((n3 = fis3.read(buffer3)) > 0)
			{
				fos3.write(buffer3, 0, n3);
			}
			fos3.close();
			fis3.close();
			pStmt.setString(15,singleFile.getResume3FileName());
			}
			else
				pStmt.setString(15,"��");
			if(singleFile.getResume4FileName() != null){
			String filename4 = root + singleFile.getResume4FileName();		//snamea+"4"+
			FileInputStream fis4 = new FileInputStream(singleFile.getResume4());
			FileOutputStream fos4 = new FileOutputStream(filename4);
			byte[] buffer4 = new byte[8192];
			int n4 = 0;
			while((n4 = fis4.read(buffer4)) > 0)
			{
				fos4.write(buffer4, 0, n4);
			}
			fos4.close();
			fis4.close();
			pStmt.setString(16,singleFile.getResume4FileName());
			}
			else
				pStmt.setString(16,"��");
			pStmt.executeUpdate();
			return "success";
		}
		else
			return "error";
    }
}

