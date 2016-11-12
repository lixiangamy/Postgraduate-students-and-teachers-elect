package www.action;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import www.action.DB_connect;

public class TapplyAction {
	private String tnamea;//����
	private int tagea;//����
	private String temaila;//email
	private int tsexa;//�Ա�
	private String tnuma;//��ְ����
	private String tchoola;//ѧУ
	private String tmaina;//�о�����

	private String tchena;//�о��ɹ�
	private int txemail;//�Ƿ���ʾ����
	private String tnumbera;//����
	private String tsmaina;//Ҫ��ѧ����רҵ
 	private int tsb;//�Ƿ�Ҫ��ѧ������
 	private int tsp;//��ѧ��������Ҫ��
 	private String tsshool;//��ѧ��ѧУ��Ҫ��

	private String error_messageo="ע��ʧ�ܣ�";
	
	//��Ƭ
	Connection connect_temp = DB_connect.connect();
	Connection connect_tempp = DB_connect.connect();
	public String getError_message(){
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

    public void setError_message(String error_messageo) {
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
		if(SapplyAction.isEmptyString(temaila))
		{
			if (SapplyAction.checkEmail(temaila))// ��֤����

			{
				//System.out.println(i); 
			    flag=connect_tempp.prepareStatement("select tn,ta,te,ts,jzgh,induction,tc,tsuccess,tx,tschool,tm,tb,tp,tpone,tptwo,tpthree,tsschool,tpfour from teacher where te = ?");
				flag.setString(1, temaila);
				re1=flag.executeQuery();
				while(re1.next())//�ж�email�Ƿ��ظ�
				{
					i=1;
				}
				if(i==1)
					error_messageo+="��email��ע�ᣡ\n";

			}
			else
			{
			 i=1;
			 error_messageo+="�����������Ϲ淶��\n";
			}


		}
		else
		{
			em=1;
			error_messageo+="�뽫��д���䣡\n";
		}
		if(SapplyAction.isEmptyString(tnamea))
		{
			flagg=connect_temp.prepareStatement("select tn,ta,te,ts,jzgh,induction,tc,tsuccess,tx,tschool,tm,tb,tp,tpone,tptwo,tpthree,tsschool,tpfour from teacher where tn = ?");
			flagg.setString(1, tnamea);
			re11=flagg.executeQuery();
			while(re11.next())//�ж������Ƿ��ظ�
			{
				i=1;
				
			}
			if(i==1)
				error_messageo+="��������ע�ᣡ\n";
		}
		else
		{
			em=1;
			error_messageo+="����д������\n";
		}
		if(SapplyAction.isEmptyString(tnuma))
		{
			if(!tnuma.matches("^[\\da-zA-Z]*$"))//�ж�ѧ��
			{
				i=1;
				error_messageo+="����д��ȷ�Ľ�ְ���ţ�\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="����д��ְ���ţ�\n";
		}
		if(SapplyAction.isEmptyString(tchoola))
		{
			if(!SapplyAction.isChinese(tchoola))
			{
				i=1;
				error_messageo+="����д��ȷ��ѧУ��\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="����дѧУ��\n";
		}
		
		if(SapplyAction.isEmptyString(tmaina))
		{
			if(!SapplyAction.isChinese(tmaina))
			{
				i=1;
				error_messageo+="����д��ȷ���о�����\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="����д�о�����\n";
		}
		
		
		
		if(SapplyAction.isEmptyString(tsshool))
		{
			if(!SapplyAction.isChinese(tsshool))
			{
				i=1;
				error_messageo+="����д��ȷ��ѧ��ѧУ��\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="����дѧ��ѧУ��\n";
		}
		
		if(SapplyAction.isEmptyString(tsmaina))
		{
			if(!SapplyAction.isChinese(tsmaina))
			{
				i=1;
				error_messageo+="����д��ȷѧ����רҵ��\n";
			}
		}
		else
		{
			em=1;
			error_messageo+="����дѧ����רҵ�о�����\n";
		}
		
		
		
		
		if(!SapplyAction.isEmptyString(tchena))
		{
			em=1;
			error_messageo+="����д�ɹ�����û�������ޣ�\n";
		}

		if(tagea==0)
		{
			em=1;
			error_messageo+="����д����!\n";
		}
		if(tagea<20||tagea>=100)
		{
			em=1;
			error_messageo+="����д��ȷ������\n";
		}
		if(tsp==0)
		{
			em=1;
			error_messageo+="����дѧ������Ҫ��!\n";
		}
		if(tsp<0)
		{
			em=1;
			error_messageo+="����д��ȷ��ѧ������Ҫ��\n";
		}
		if(i==0&&em==0)
		{
			
			String sql = "insert into teacher ( tn,ta,te,ts,jzgh,induction,tc,tsuccess,tx,tschool,tm,tb,tp,tpone,tptwo,tpthree,tsschool,tpfour) value (?,?,?,?,?,?,?,?,?,?,?,?,?,'','','',?,'')";
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
			pStmt.executeUpdate();
			return "success";
		}
		else
			return "error";
    }
}

